package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {
	private static final float BODY_TEMP = 36.0f;
	private static final float PERC_BODY_HAIR = 98.8f;
	private static final int DEFAULT_NR_LEGS = 4;
	
	public Tiger() {}
	
	public Tiger(double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Tiger(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Tiger(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Tiger(String name, double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Tiger);
	}
}
