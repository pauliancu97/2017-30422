package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammal {
	private static final float BODY_TEMP = 36.0f;
	private static final float PERC_BODY_HAIR = 90.8f;
	private static final int DEFAULT_NR_LEGS = 2;
	
	public Monkey() {}
	
	public Monkey(double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Monkey(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Monkey(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Monkey(String name, double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Monkey);
	}
}
