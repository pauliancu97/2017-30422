package javasmmr.zoowsome.models.animals;

public abstract class Animal implements Killer {
	private int nrOfLegs;
	private String name;
	private final double MAINTENANCE_COST;
	private final double DANGER_PERC;
	private boolean takenCareOf;
	
	Animal(double maintenanceCost,double dangerPerc){
		MAINTENANCE_COST = maintenanceCost;
		DANGER_PERC = dangerPerc;
	}
	
	public int getNrOfLegs() {
		return nrOfLegs;
	}
	
	public void setNrOfLegs(int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMaintenanceCost() {
		return MAINTENANCE_COST;
	}
	
	public boolean isTakenCareOf() {
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	@Override
	public double getPredisposition() {
		return 0.0;
	}
	
	@Override
	public boolean kill() {
		double chance = Math.random();
		if(chance - getPredisposition() < DANGER_PERC)
			return true;
		return false;
	}
}
