package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import javax.xml.stream.*;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

public abstract class Employee implements XML_Parsable{
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employee() {}
	
	public Employee(String name, long id, BigDecimal salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public boolean getIsDead() {
		return isDead;
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		createNode(eventWriter,"name",name);
		createNode(eventWriter,"id",String.valueOf(id));
		createNode(eventWriter,"salary",String.valueOf(salary));
		createNode(eventWriter,"isDead",String.valueOf(isDead));
	}
	
	@Override
	public void decodeFromXml(Element element) {
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
	}
}
