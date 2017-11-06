package javasmmr.zoowsome.models.animals;

public class Jellyfish extends Aquatic{
	private static final int AVG_SWIM_DEPTH = 30;
	private static final WaterType WATER_TYPE = WaterType.Fresh;
	private static final int DEFAULT_NR_LEGS = 0;
	
	public Jellyfish() {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Jellyfish(String name, int nrOfLegs) {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Jellyfish(int nrOfLegs) {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setNrOfLegs(nrOfLegs);
	}
	
	public Jellyfish(String name) {
		super(AVG_SWIM_DEPTH,WATER_TYPE);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
