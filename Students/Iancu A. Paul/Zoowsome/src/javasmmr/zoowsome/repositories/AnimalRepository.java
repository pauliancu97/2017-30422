package javasmmr.zoowsome.repositories;


import javax.xml.stream.*;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;


import org.w3c.dom.Element;


import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;



public class AnimalRepository extends EntityRepository<Animal>{
	private static final String XML_FILENAME = "Animals.xml";
	
	
	
	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}
	
	
	@Override
	protected Animal getEntityFromXmlElement(Element element) {
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
		return animal;
	}
	
	
}
