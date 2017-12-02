package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.interfaces.*;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Animal implements Killer,XML_Parsable {
	private int nrOfLegs;
	private String name;
	private double MAINTENANCE_COST;
	private double DANGER_PERC;
	private boolean takenCareOf;
	
	
	Animal(){}
	
	Animal(double maintenanceCost,double dangerPerc){
		MAINTENANCE_COST = maintenanceCost;
		DANGER_PERC = dangerPerc;
	}
	
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMaintenanceCost() {
		return MAINTENANCE_COST;
	}
	
	public void setMaintenaceCost(double maintenaceCost) {
		MAINTENANCE_COST = maintenaceCost;
	}
	
	public double getDangerPerc() {
		return DANGER_PERC;
	}
	
	public void setDangerPerc(double dangerPerc) {
		DANGER_PERC = dangerPerc;
	}
	
	public boolean isTakenCareOf() {
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	@Override
	public double getPredisposition() {
		return 0.0;
	}
	
	@Override
	public boolean kill() {
		double chance = Math.random();
		if(chance - getPredisposition() < DANGER_PERC)
			return true;
		return false;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		createNode(eventWriter,"nrOfLegs",String.valueOf(nrOfLegs));
		createNode(eventWriter,"name",name);
		createNode(eventWriter,"maintenanceCost",String.valueOf(MAINTENANCE_COST));
		createNode(eventWriter,"dangerPerc",String.valueOf(DANGER_PERC));
		createNode(eventWriter,"takenCareOf",String.valueOf(takenCareOf));
	}
	
	@Override
	public void decodeFromXml(Element element){
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenaceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
	
}
