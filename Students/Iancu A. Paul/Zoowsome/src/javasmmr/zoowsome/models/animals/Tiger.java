package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	private static final float BODY_TEMP = 36.0f;
	private static final float PERC_BODY_HAIR = 98.8f;
	private static final int DEFAULT_NR_LEGS = 4;
	
	public Tiger() {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Tiger(String name, int nrOfLegs) {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Tiger(int nrOfLegs) {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setNrOfLegs(nrOfLegs);
	}
	
	public Tiger(String name) {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
