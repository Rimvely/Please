package com.xml;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class Test1 {

	public static void main(String[] args) {

		try {
			// Dom Document객체를 생성하기 위해 팩토리 생성
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance(); // newInstance
																				// =
																				// 객체생성

			DocumentBuilder parser = f.newDocumentBuilder();
			// parser가 xml를 읽을꺼다.

			Document xmlDoc = null;

			String url = "book.xml";

			if (url.indexOf("http://") != -1) {

				URL u = new URL(url);
				InputStream is = u.openStream();

				xmlDoc = parser.parse(is);

			} else {

				xmlDoc = parser.parse(url);

			}
			
			//root
			//Element : xml문서의 요소를 표현하기위해 사용
			Element root = xmlDoc.getDocumentElement();
			System.out.println(root.getTagName());
			
			//첫번째book
			//Node : 각 요소를 읽고 쓰기위해 사용
			Node book1 = root.getElementsByTagName("book").item(0);
			System.out.println(((Element)book1).getAttribute("kind"));
			
			Node title = book1.getFirstChild();
			Node title1 = title.getNextSibling();
			System.out.println(title1.getNodeName());
			
			Node title1_1 = title1.getFirstChild();
			System.out.println(title1_1.getNodeValue());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
