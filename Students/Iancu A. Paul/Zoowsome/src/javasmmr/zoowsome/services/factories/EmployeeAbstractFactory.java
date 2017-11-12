package javasmmr.zoowsome.services.factories;

public class EmployeeAbstractFactory {
	public EmployeeFactory getEmployeeFactory(String type) throws Exception{
		if(type.equals(Constants.Employees.Caretaker))
			return new CaretakerFactory();
		else throw new Exception("Invalid employee type.");
	}
}
