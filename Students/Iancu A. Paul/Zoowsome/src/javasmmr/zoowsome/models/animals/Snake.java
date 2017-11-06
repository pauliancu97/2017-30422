package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{
	private static final boolean LAYS_EGGS = true;
	private static final int DEFAULT_NR_LEGS = 0;
	
	public Snake() {
		super(LAYS_EGGS);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Snake(String name, int nrOfLegs) {
		super(LAYS_EGGS);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Snake(int nrOfLegs) {
		super(LAYS_EGGS);
		setNrOfLegs(nrOfLegs);
	}
	
	public Snake(String name) {
		super(LAYS_EGGS);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}

}
