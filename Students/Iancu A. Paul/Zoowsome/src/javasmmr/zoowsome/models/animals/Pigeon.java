package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Pigeon extends Bird{
	private static final boolean MIGRATES = false;
	private static final int AVG_FLIGHT_ALT = 100;
	private static final int DEFAULT_NR_LEGS = 2;
	
	public Pigeon() {}
	
	public Pigeon(double maintenanceCost, double dangerPerc) {
		super(MIGRATES,AVG_FLIGHT_ALT,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Pigeon(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(MIGRATES,AVG_FLIGHT_ALT,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Pigeon(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(MIGRATES,AVG_FLIGHT_ALT,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Pigeon(String name, double maintenanceCost, double dangerPerc) {
		super(MIGRATES,AVG_FLIGHT_ALT,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Pigeon);
	}
}
