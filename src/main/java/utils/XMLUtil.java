package utils;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/12
 */
public class XMLUtil {
    public static String getProductType(){
        String productType=null;

        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
            Document document;
            document=documentBuilder.parse(new File("config.xml"));

            NodeList nodeList=document.getElementsByTagName("productType");
            Node node=nodeList.item(0).getFirstChild();
            productType=node.getNodeValue().trim();
            return productType;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productType;
    }
}
