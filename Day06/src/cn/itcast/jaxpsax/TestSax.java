package cn.itcast.jaxpsax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TestSax {

	public static void main(String[] args) throws Exception {
		/**
		 * 1.创建解析器工厂
		 * 2.创建解析器
		 * 3.执行parse方法
		 * 
		 * 4. 自己创建类，继承DefaultHandler方法，重写类的方法
		 *
		 */
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		
		SAXParser saxParser = saxParserFactory.newSAXParser();
		
		saxParser.parse("src/p1.xml", new Mydefault());
		

	}

}
class Mydefault extends DefaultHandler {

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		System.out.print(new String(ch,start,length));
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		System.out.print("<" + qName + ">");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		System.out.print("<" + qName + ">");
	}
	
	
}