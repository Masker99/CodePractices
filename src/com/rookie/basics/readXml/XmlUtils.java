package com.rookie.basics.readXml;

import com.sun.org.apache.xerces.internal.dom.ChildNode;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * 学习利用java读取xml文本
 * 了解什么是NodeList，Node
 * @author Masker
 */
public class XmlUtils {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;

        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {

            document = builder.parse("src\\com\\rookie\\basics\\readXml\\book.xml");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        NodeList nodeList =  document.getElementsByTagName("书");
        System.out.println(nodeList.getLength());
        for (int i = 0 ; i < nodeList.getLength() ; i++){
            Node childNode = nodeList.item(i);
            NodeList childNodeList = childNode.getChildNodes();
            System.out.println(childNode.getNodeName());
            System.out.println(childNodeList.getLength());
            for (int j = 0 ; j < childNodeList.getLength() ; j++){
                if (childNodeList.item(j).getNodeType()== 1) {
                    System.out.println(childNodeList.item(j).getNodeName());
                    System.out.println(childNodeList.item(j).getFirstChild().getNodeValue());
                }
            }
        }
    }
}
