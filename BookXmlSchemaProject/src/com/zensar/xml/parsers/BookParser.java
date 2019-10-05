package com.zensar.xml.parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.zensar.xml.handlers.BookXmlHandler;

public class BookParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parsar=factory.newSAXParser();
			parsar.parse(new File("./src/books.xml"), new BookXmlHandler());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
