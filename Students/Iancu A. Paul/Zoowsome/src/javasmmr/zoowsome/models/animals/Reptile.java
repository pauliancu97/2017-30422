package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Reptile extends Animal {
	private boolean laysEggs;
	
	Reptile(){}
	
	Reptile(boolean laysEggs, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}
	
	
	public boolean getLaysEggs() {
		return laysEggs;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"laysEggs",String.valueOf(laysEggs));
	}
	
	@Override
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		if(element.getElementsByTagName("laysEggs").item(0).getTextContent().equals("true"))
			laysEggs = true;
		else 
			laysEggs = false;
	}
}
