package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	static final boolean IS_DANGEROUS = false;
	static final boolean CAN_FLY = true;
	static final int DEFAULT_NR_LEGS = 6;
	
	public Butterfly(double maintenanceCost, double dangerPerc) {
		super(CAN_FLY, IS_DANGEROUS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Butterfly(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(CAN_FLY, IS_DANGEROUS,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Butterfly(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(CAN_FLY, IS_DANGEROUS,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Butterfly(String name, double maintenanceCost, double dangerPerc) {
		super(CAN_FLY, IS_DANGEROUS,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
