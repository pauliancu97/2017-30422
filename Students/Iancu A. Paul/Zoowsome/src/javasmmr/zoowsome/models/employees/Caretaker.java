package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import javax.xml.stream.*;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

public class Caretaker extends Employee implements Caretaker_I{
	private double workingHours;
	
	public Caretaker() {}
	
	public Caretaker(String name, long id, BigDecimal salary, double workingHours) {
		super(name, id, salary);
		this.workingHours = workingHours;
	}
	
	public double getWorkingHours() {
		return workingHours;
	}
	
	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	@Override
	public String takeCareOf(Animal animal) {
		if(animal.kill())
			return Constants.Employees.Caretakers.TCO_KILLED;
		if(workingHours < animal.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		animal.setTakenCareOf(true);
		workingHours -= animal.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"workingHours",String.valueOf(workingHours));
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Employees.Caretaker);
	}
	
	@Override
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
}
