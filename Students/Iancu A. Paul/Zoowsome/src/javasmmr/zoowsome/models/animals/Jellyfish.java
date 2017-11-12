package javasmmr.zoowsome.models.animals;

public class Jellyfish extends Aquatic{
	private static final int AVG_SWIM_DEPTH = 30;
	private static final WaterType WATER_TYPE = WaterType.Fresh;
	private static final int DEFAULT_NR_LEGS = 0;
	
	public Jellyfish(double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Jellyfish(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Jellyfish(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Jellyfish(String name, double maintenanceCost, double dangerPerc) {
		super(AVG_SWIM_DEPTH,WATER_TYPE,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
