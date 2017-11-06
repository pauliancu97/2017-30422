package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	private static final int AVG_SWIM_DEPTH = 100;
	private static final WaterType WATER_TYPE = WaterType.Salt;
	private static final int DEFAULT_NR_LEGS = 0;
	
	public Shark() {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Shark(String name, int nrOfLegs) {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Shark(int nrOfLegs) {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setNrOfLegs(nrOfLegs);
	}
	
	public Shark(String name) {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
