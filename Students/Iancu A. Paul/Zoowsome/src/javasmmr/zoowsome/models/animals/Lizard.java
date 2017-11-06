package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{
	private static final boolean LAYS_EGGS = true;
	private static final int DEFAULT_NR_LEGS = 4;
	
	public Lizard() {
		super(LAYS_EGGS);
		setNrOfLegs(DEFAULT_NR_LEGS);
	}
	
	public Lizard(String name, int nrOfLegs) {
		super(LAYS_EGGS);
		setName(name);
		setNrOfLegs(nrOfLegs);
	}
	
	public Lizard(int nrOfLegs) {
		super(LAYS_EGGS);
		setNrOfLegs(nrOfLegs);
	}
	
	public Lizard(String name) {
		super(LAYS_EGGS);
		setNrOfLegs(DEFAULT_NR_LEGS);
		setName(name);
	}
}
