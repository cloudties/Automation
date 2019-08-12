package com.automation.ui.base.common.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.joox.selector.CSS2XPath;
import java.io.*;

public class XpathExtractor {
    public static void main(String[] args) {

        try {
            Document doc = Jsoup.connect("http://localhost:8090/UI").get();
            Elements elements = doc.select("*");
            for (Element element : elements) {
                String path = CSS2XPath.css2xpath(element.cssSelector(), true);
                System.out.println("Node name : " + element.nodeName());
                System.out.println("      Tag : " + element.tagName());
                System.out.println("      CSS : " + element.cssSelector());
                System.out.println("    XPath : " + path + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
