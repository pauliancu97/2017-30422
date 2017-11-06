package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{
	static final boolean IS_DANGEROUS = false;
	static final boolean CAN_FLY = true;
	static final int DEFAULT_NR_LEGS = 6;
	
	public Butterfly() {
		super(CAN_FLY, IS_DANGEROUS);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Butterfly(String name, int nrOfLegs) {
		super(CAN_FLY, IS_DANGEROUS);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Butterfly(int nrOfLegs) {
		super(CAN_FLY, IS_DANGEROUS);
		setNrOfLegs(nrOfLegs);
	}
	
	public Butterfly(String name) {
		super(CAN_FLY, IS_DANGEROUS);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
