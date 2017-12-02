package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Crane extends Bird {
	private static final boolean MIGRATES = true;
	private static final int AVG_FLIGHT_ALT = 10000;
	private static final int DEFAULT_NR_LEGS = 2;
	
	public Crane() {}
	
	public Crane(double maintenanceCost, double dangerPerc) {
		super(MIGRATES,AVG_FLIGHT_ALT,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Crane(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(MIGRATES,AVG_FLIGHT_ALT,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Crane(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(MIGRATES,AVG_FLIGHT_ALT,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Crane(String name, double maintenanceCost, double dangerPerc) {
		super(MIGRATES,AVG_FLIGHT_ALT,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Crane);
	}
}

