package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private boolean laysEggs;
	
	Reptile(boolean laysEggs, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}
	
	
	public boolean getLaysEggs() {
		return laysEggs;
	}
}
