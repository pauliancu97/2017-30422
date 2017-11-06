package javasmmr.zoowsome.models.animals;

public class Crane extends Bird {
	private static final boolean MIGRATES = true;
	private static final int AVG_FLIGHT_ALT = 10000;
	private static final int DEFAULT_NR_LEGS = 2;
	
	public Crane() {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Crane(String name, int nrOfLegs) {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Crane(int nrOfLegs) {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setNrOfLegs(nrOfLegs);
	}
	
	public Crane(String name) {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
