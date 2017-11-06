package javasmmr.zoowsome.models.animals;

public class Pigeon extends Bird{
	private static final boolean MIGRATES = false;
	private static final int AVG_FLIGHT_ALT = 100;
	private static final int DEFAULT_NR_LEGS = 2;
	
	public Pigeon() {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Pigeon(String name, int nrOfLegs) {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Pigeon(int nrOfLegs) {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setNrOfLegs(nrOfLegs);
	}
	
	public Pigeon(String name) {
		super(MIGRATES,AVG_FLIGHT_ALT);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
