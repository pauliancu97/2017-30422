package javasmmr.zoowsome.models.animals;

public class Goose extends Bird{
	private static final boolean MIGRATES = true;
	private static final int AVG_FLIGHT_ALT = 10000;
	private static final int DEFAULT_NR_LEGS = 2;
	
	public Goose() {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Goose(String name, int nrOfLegs) {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Goose(int nrOfLegs) {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setNrOfLegs(nrOfLegs);
	}
	
	public Goose(String name) {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
