package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	private int avgSwimDepth;
	private WaterType waterType;
	
	Aquatic(int avgSwimDepth, WaterType waterType){
		
		setAverageSwimDepth(avgSwimDepth);
		this.waterType = waterType;
	}
	
	private void setAverageSwimDepth(int avgSwimDepth) {
		if(avgSwimDepth > 0)
			this.avgSwimDepth = avgSwimDepth;
	}
	
	public int getAverageSwimDepth() {
		return avgSwimDepth;
	}
	
	public WaterType getWaterType() {
		return waterType;
	}
}
