package javasmmr.zoowsome.models.animals;

public class Frog extends Aquatic{
	private static final int AVG_SWIM_DEPTH = 30;
	private static final WaterType WATER_TYPE = WaterType.Fresh;
	private static final int DEFAULT_NR_LEGS = 0;
	
	public Frog() {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Frog(String name, int nrOfLegs) {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Frog(int nrOfLegs) {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setNrOfLegs(nrOfLegs);
	}
	
	public Frog(String name) {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
