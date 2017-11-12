package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{
	private static final boolean LAYS_EGGS = true;
	private static final int DEFAULT_NR_LEGS = 4;
	
	public Lizard(double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Lizard(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Lizard(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Lizard(String name, double maintenanceCost, double dangerPerc) {
		super(LAYS_EGGS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
