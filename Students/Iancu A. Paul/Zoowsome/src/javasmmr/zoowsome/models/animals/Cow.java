package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	private static final float BODY_TEMP = 36.0f;
	private static final float PERC_BODY_HAIR = 99.8f;
	private static final int DEFAULT_NR_LEGS = 4;
	
	public Cow() {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Cow(String name, int nrOfLegs) {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Cow(int nrOfLegs) {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setNrOfLegs(nrOfLegs);
	}
	
	public Cow(String name) {
		super(BODY_TEMP, PERC_BODY_HAIR);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
