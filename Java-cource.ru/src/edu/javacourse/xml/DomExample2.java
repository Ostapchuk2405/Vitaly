package edu.javacourse.xml;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class DomExample2 {

	public static void main(String[] args) {
		try {
			DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = documentBuilder.parse("BookCatalog.xml");
			addNewBook(document);

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (SAXException se) {
			se.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

	private static void addNewBook(Document document) throws TransformerFactoryConfigurationError, DOMException {

		Node root = document.getDocumentElement();

		Element book = document.createElement("Book");

		Element title = document.createElement("Title");
		title.setTextContent("Incredible book about Java");

		Element author = document.createElement("Author");
		author.setTextContent("Saburov Anton");

		Element date = document.createElement("Date");
		date.setTextContent("2015");

		Element isbn = document.createElement("ISBN");
		isbn.setTextContent("0-06-999999-9");

		Element publisher = document.createElement("Publisher");
		publisher.setTextContent("Java-course publisher");

		Element cost = document.createElement("Cost");
		cost.setTextContent("499");
		cost.setAttribute("currency", "RUB");

		book.appendChild(title);
		book.appendChild(author);
		book.appendChild(date);
		book.appendChild(isbn);
		book.appendChild(publisher);
		book.appendChild(cost);

		root.appendChild(book);
		writeDocument(document);
	}

	private static void writeDocument(Document document) throws TransformerFactoryConfigurationError {

		try {
			Transformer tr = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(document);
			FileOutputStream fos = new FileOutputStream("Other.xml");
			StreamResult result = new StreamResult(fos);
			tr.transform(source, result);

		} catch (TransformerException | IOException e) {
			e.printStackTrace();
		}
	}
}