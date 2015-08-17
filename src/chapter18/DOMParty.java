package chapter18;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMParty
{
  public static void main( String[] args ) throws Exception
  {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse( new File("party.xml") );
//    System.out.println( document.getFirstChild().getTextContent() );
    NodeList nl = document.getElementsByTagName("getraenk");
    for (int i=0; i<nl.getLength(); i++){
    	Node n = nl.item(i);
    	System.out.println(n.getTextContent());
    }
    System.out.println( document.getElementsByTagName(""));
  }
}
