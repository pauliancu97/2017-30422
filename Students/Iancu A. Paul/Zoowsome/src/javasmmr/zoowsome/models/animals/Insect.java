package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal{
	private boolean canFly;
	private boolean isDangerous;
	
	Insect(boolean canFly, boolean isDangerous){
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public boolean getCanFly() {
		return canFly;
	}
	
	public boolean getIsDangerous() {
		return isDangerous;
	}
}
