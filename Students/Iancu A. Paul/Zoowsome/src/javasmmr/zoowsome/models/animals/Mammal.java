package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Mammal extends Animal{
	private float normalBodyTemp;
	private float percBodyHair;
	
	Mammal(){}
	
	Mammal(float normalBodyTemp, float percBodyHair,double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	private void setNormalBodyTemp(float normalBodyTemp) {
		if(normalBodyTemp > 0.0)
			this.normalBodyTemp = normalBodyTemp;
	}
	
	private void setPercBodyHair(float percBodyHair) {
		if(percBodyHair > 0.0)
			this.percBodyHair = percBodyHair;
	}
	
	public float getNormalBodyTemperature() {
		return normalBodyTemp;
	}
	
	
	public float getPercentageBodyHair() {
		return percBodyHair;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"normalBodyTemp",String.valueOf(normalBodyTemp));
		createNode(eventWriter,"percBodyHair",String.valueOf(percBodyHair));
	}
	
	@Override
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
