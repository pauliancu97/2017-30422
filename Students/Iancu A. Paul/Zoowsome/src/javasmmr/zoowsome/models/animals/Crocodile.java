package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{
	private static final boolean LAYS_EGGS = true;
	private static final int DEFAULT_NR_LEGS = 4;
	
	public Crocodile() {
		super(LAYS_EGGS);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Crocodile(String name, int nrOfLegs) {
		super(LAYS_EGGS);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Crocodile(int nrOfLegs) {
		super(LAYS_EGGS);
		setNrOfLegs(nrOfLegs);
	}
	
	public Crocodile(String name) {
		super(LAYS_EGGS);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
