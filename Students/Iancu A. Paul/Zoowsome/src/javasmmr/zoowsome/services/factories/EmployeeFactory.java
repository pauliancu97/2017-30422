package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Employee;
import java.math.BigDecimal;

public abstract class EmployeeFactory {
	private static long counter = 0;
	
	public abstract Employee getEmployee(String name, BigDecimal salary);
	
	public long getId() {
		counter++;
		return counter;
	}
}
