package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{
	private static final boolean LAYS_EGGS = true;
	private static final int DEFAULT_NR_LEGS = 4;
	
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
}
