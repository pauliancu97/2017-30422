package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	private static final float BODY_TEMP = 36.0f;
	private static final float PERC_BODY_HAIR = 90.8f;
	private static final int DEFAULT_NR_LEGS = 2;
	
	public Monkey() {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Monkey(String name, int nrOfLegs) {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Monkey(int nrOfLegs) {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setNrOfLegs(nrOfLegs);
	}
	
	public Monkey(String name) {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}

}
