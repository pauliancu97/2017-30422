package javasmmr.zoowsome.repositories;


import javax.xml.stream.*;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;


import org.w3c.dom.Element;


import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository extends EntityRepository<Employee> {
	private static final String XML_FILENAME = "Employees.xml";
	
	
	
	protected Employee getEntityFromXmlElement(Element element) {
		Employee employee = null;
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch(discriminant) {
		case Constants.Employees.Caretaker:
			employee = new Caretaker();
			break;
		default:
			break;
		}
		return employee;
	}
	
	public EmployeeRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}
}
