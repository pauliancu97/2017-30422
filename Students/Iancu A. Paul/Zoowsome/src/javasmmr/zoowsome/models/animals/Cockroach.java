package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{
	static final boolean IS_DANGEROUS = false;
	static final boolean CAN_FLY = false;
	static final int DEFAULT_NR_LEGS = 8;
	
	public Cockroach() {
		super(CAN_FLY, IS_DANGEROUS);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Cockroach(String name, int nrOfLegs) {
		super(CAN_FLY, IS_DANGEROUS);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Cockroach(int nrOfLegs) {
		super(CAN_FLY, IS_DANGEROUS);
		setNrOfLegs(nrOfLegs);
	}
	
	public Cockroach(String name) {
		super(CAN_FLY, IS_DANGEROUS);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
