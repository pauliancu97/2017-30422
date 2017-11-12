package javasmmr.zoowsome.models.animals;

public class Frog extends Aquatic{
	private static final int AVG_SWIM_DEPTH = 30;
	private static final WaterType WATER_TYPE = WaterType.Fresh;
	private static final int DEFAULT_NR_LEGS = 0;
	
	public Frog(double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Frog(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Frog(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Frog(String name, double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
