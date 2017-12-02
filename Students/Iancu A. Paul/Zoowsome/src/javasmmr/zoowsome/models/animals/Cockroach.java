package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Cockroach extends Insect{
	static final boolean IS_DANGEROUS = false;
	static final boolean CAN_FLY = false;
	static final int DEFAULT_NR_LEGS = 8;
	
	public Cockroach() {}
	
	public Cockroach(double maintenanceCost, double dangerPerc) {
		super(CAN_FLY, IS_DANGEROUS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Cockroach(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(CAN_FLY, IS_DANGEROUS,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Cockroach(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(CAN_FLY, IS_DANGEROUS,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Cockroach(String name, double maintenanceCost, double dangerPerc) {
		super(CAN_FLY, IS_DANGEROUS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Cockroach);
	}
}
