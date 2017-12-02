package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Crocodile extends Reptile{
	private static final boolean LAYS_EGGS = true;
	private static final int DEFAULT_NR_LEGS = 4;
	
	public Crocodile() {}
	
	public Crocodile(double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Crocodile(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Crocodile(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Crocodile(String name, double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Crocodile);
	}
}
