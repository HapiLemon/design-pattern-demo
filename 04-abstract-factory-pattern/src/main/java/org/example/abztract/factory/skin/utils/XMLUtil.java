package org.example.abztract.factory.skin.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean() {
        // 创建文档对象
        try {
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("04-abstract-factory-pattern\\src\\main\\resources\\config.xml"));

            // 获取包含类名的文本节点
            NodeList nodeList = document.getElementsByTagName("className");
            Node node = nodeList.item(0).getFirstChild();
            String className = node.getNodeValue();

            // 通过类名生成实例对象并将其返回
            Class<?> clazz = Class.forName(className);
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
