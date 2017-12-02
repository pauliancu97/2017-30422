package javasmmr.zoowsome.repositories;

import java.util.ArrayList;
import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.*;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;



public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		
		StartElement sElement = eventFactory.createStartElement("","",name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		EndElement eElement = eventFactory.createEndElement("","",name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
	
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();   // Create XMLEventWriter   
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));   // Create a EventFactory   
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();   
		XMLEvent end = eventFactory.createDTD("\n");   // Create and write Start Tag   
		StartDocument startDocument = eventFactory.createStartDocument();   
		eventWriter.add(startDocument);   // Create content open tag   
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");   
		eventWriter.add(configStartElement);   eventWriter.add(end); 
		 
		  for (XML_Parsable animal : animals) {    
		   StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
		   
		   eventWriter.add(sElement);
		   
		   eventWriter.add(end);
		   
		   animal.encodeToXml(eventWriter); 
		 
		   EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
		   eventWriter.add(eElement);
		   eventWriter.add(end);   
		   } 
		 
		   eventWriter.add(eventFactory.createEndElement("", "", "content"));
		   eventWriter.add(eventFactory.createEndDocument());
		   eventWriter.close();
	}
	
	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for(int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				Animal animal = null;
				switch(discriminant) {
				case Constants.Animals.Insects.Butterfly:
					animal = new Butterfly();
					break;
				case Constants.Animals.Insects.Cockroach:
					animal = new Cockroach();
					break;
				case Constants.Animals.Mammals.Cow:
					animal = new Cow();
					break;
				case Constants.Animals.Birds.Crane:
					animal = new Crane();
					break;
				case Constants.Animals.Reptiles.Crocodile:
					animal = new Crocodile();
					break;
				case Constants.Animals.Aquatics.Frog:
					animal = new Frog();
					break;
				case Constants.Animals.Birds.Goose:
					animal = new Goose();
					break;
				case Constants.Animals.Aquatics.Jellyfish:
					animal = new Jellyfish();
					break;
				case Constants.Animals.Reptiles.Lizard:
					animal = new Lizard();
					break;
				case Constants.Animals.Mammals.Monkey:
					animal = new Monkey();
					break;
				case Constants.Animals.Birds.Pigeon:
					animal = new Pigeon();
					break;
				case Constants.Animals.Aquatics.Shark:
					animal = new Shark();
					break;
				case Constants.Animals.Reptiles.Snake:
					animal = new Snake();
					break;
				case Constants.Animals.Insects.Spider:
					animal = new Spider();
					break;
				case Constants.Animals.Mammals.Tiger:
					animal = new Tiger();
					break;
				default:
					break;
				}
				animal.decodeFromXml(element);
				animals.add(animal);
			}
		}
		return animals;
	}
}
