package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic {
	private static final int AVG_SWIM_DEPTH = 100;
	private static final WaterType WATER_TYPE = WaterType.Salt;
	private static final int DEFAULT_NR_LEGS = 0;
	
	public Shark() {}
	
	public Shark(double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Shark(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Shark(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Shark(String name, double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.Shark);
	}
}
