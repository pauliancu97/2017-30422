package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Insect extends Animal{
	private boolean canFly;
	private boolean isDangerous;
	
	Insect(){}
	
	Insect(boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public boolean getCanFly() {
		return canFly;
	}
	
	public boolean getIsDangerous() {
		return isDangerous;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"canFly",String.valueOf(canFly));
		createNode(eventWriter,"isDangerous",String.valueOf(isDangerous));
	}
	
	@Override
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		if(element.getElementsByTagName("canFly").item(0).getTextContent().equals("true"))
			canFly = true;
		else
			canFly = false;
		if(element.getElementsByTagName("isDangerous").item(0).getTextContent().equals("true"))
			isDangerous = true;
		else
			isDangerous = false;
	}
}
