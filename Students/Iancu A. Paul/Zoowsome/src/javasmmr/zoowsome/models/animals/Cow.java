package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	private static final float BODY_TEMP = 36.0f;
	private static final float PERC_BODY_HAIR = 99.8f;
	private static final int DEFAULT_NR_LEGS = 4;
	
	public Cow(double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Cow(String name, int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Cow(int nrOfLegs, double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
	}
	
	public Cow(String name, double maintenanceCost, double dangerPerc) {
		super(BODY_TEMP, PERC_BODY_HAIR,maintenanceCost, dangerPerc);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
