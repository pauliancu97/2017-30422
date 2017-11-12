package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import java.math.BigDecimal;

public class CaretakerFactory extends EmployeeFactory{
	public Caretaker getEmployee(String name, BigDecimal salary) {
		Caretaker caretaker = new Caretaker(name,getId(),salary,Constants.Employees.Caretakers.getWorkingHours());
		return caretaker;
	}
}
