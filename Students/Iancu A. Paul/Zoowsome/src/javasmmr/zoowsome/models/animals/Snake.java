package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Snake extends Reptile{
	private static final boolean LAYS_EGGS = true;
	private static final int DEFAULT_NR_LEGS = 0;
	
	public Snake() {}
	
	public Snake(double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Snake(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Snake(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Snake(String name, double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Snake);
	}
}
