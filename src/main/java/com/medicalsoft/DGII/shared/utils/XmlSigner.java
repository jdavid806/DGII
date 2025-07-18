package com.medicalsoft.DGII.shared.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
//Ref: https://repo1.maven.org/maven2/com/oracle/database/xml/xmlparserv2/21.8.0.0/xmlparserv2-21.8.0.0.jar
import oracle.xml.parser.v2.DOMParser;
import oracle.xml.parser.v2.XMLDocument;
//Fin Ref

import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import java.io.ByteArrayOutputStream;
import javax.xml.transform.*;

/*
 * Referencias
 * JDK https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html
 *
 * https://community.oracle.com/tech/developers/discussion/1539728/digital-signing-validating
 *
 * https://docs.oracle.com/javase/7/docs/api/javax/xml/parsers/DocumentBuilderFactory.html
 *
 * https://www.oracle.com/technical-resources/articles/wang-whitespace.html
 *
 * Parser XML v2-21.8.0.0
 * xmlparserv2-21.8.0.0.jar => https://repo1.maven.org/maven2/com/oracle/database/xml/xmlparserv2/21.8.0.0/xmlparserv2-21.8.0.0.jar
 * https://repo1.maven.org/maven2/com/oracle/database/xml/xmlparserv2/
 * Si usa VS Code como entorno para desarrollar estas extensiones serán de utilidad
 *
 * https://code.visualstudio.com/docs/java/extensions
 * https://code.visualstudio.com/docs/java/java-tutorial
 * Solo instalar el extensionPack for Java y el Coding Pack for Java para el JDK recomendamos Oracle Java SE
 */
@Component
public class XmlSigner {
    private static final String algoritmoSignatureMethod = "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";

    /*
     * Método para el firmado un XML utilizando un certificado digital (.p12)
     * 
     * @param streamXML InputStream del xml que será firmado.
     * 
     * @param pathCerticate ruta del certificado digital (archivo extension .p12)
     * 
     * @param passwordCertificate contraseña del certificado digital
     * 
     * @param pathFirmado Ruta donde sera almacenado el XML firmado
     * 
     * @throws Exception
     */
    public Element SignXML(InputStream streamXML, InputStream streamCerticate, String passwordCertificate)
            throws Exception {
        try {
            // Creamos un DOM XMLSignatureFactory. Se usará para generar la firma
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

            Reference ref = fac.newReference("", fac.newDigestMethod(DigestMethod.SHA256, null),
                    Collections.singletonList(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null)),
                    null,
                    null);

            // Creamos el objeto SignedInfo
            SignedInfo si = fac.newSignedInfo(
                    fac.newCanonicalizationMethod(CanonicalizationMethod.INCLUSIVE, (C14NMethodParameterSpec) null),
                    fac.newSignatureMethod(algoritmoSignatureMethod, null),
                    Collections.singletonList(ref));

            // Cargamos el archivo p12 desde disco
            KeyStore ks = KeyStore.getInstance("PKCS12");
            ks.load(streamCerticate, passwordCertificate.toCharArray());
            String param = ks.aliases().nextElement();

            // Extraemos los datos del archivo p12
            KeyStore.PrivateKeyEntry keyEntry = (KeyStore.PrivateKeyEntry) ks
                    .getEntry(param, new KeyStore.PasswordProtection(passwordCertificate.toCharArray()));
            X509Certificate cert = (X509Certificate) keyEntry.getCertificate();

            KeyInfoFactory kinfoFactory = fac.getKeyInfoFactory();
            // Cargamos nuestro certificado
            List<Serializable> x509Content = new ArrayList<Serializable>();
            x509Content.add(cert);
            // Objetos para extraer la llave privada
            X509Data x509d = kinfoFactory.newX509Data(x509Content);
            KeyInfo kinfo = kinfoFactory.newKeyInfo(Collections.singletonList(x509d));

            DOMParser parser = new DOMParser();
            parser.setPreserveWhitespace(false);
            parser.parse(streamXML);
            XMLDocument xml = parser.getDocument();
            Element xmlRoot = xml.getDocumentElement();

            // Crea el contexto de firmma y especifica las llaves privadas
            DOMSignContext dsc = new DOMSignContext(keyEntry.getPrivateKey(), xmlRoot);

            // crea los nodos de firmas xml
            XMLSignature signature = fac.newXMLSignature(si, kinfo);
            // en esta etapa dsc modifica el objeto xmlRoot insertándole la firma
            signature.sign(dsc);

            return xmlRoot;
        } catch (Exception e) {
            throw e;
        }
    }

    public String sign(String xml, InputStream certStream, String certPassword) throws Exception {
        ByteArrayInputStream xmlStream = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
        Element signedElement = SignXML(xmlStream, certStream, certPassword);

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        transformer.transform(new DOMSource(signedElement), new StreamResult(outputStream));

        return outputStream.toString(StandardCharsets.UTF_8);
    }
}