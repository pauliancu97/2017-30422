package javasmmr.zoowsome.models.animals;

public enum WaterType {
	Salt("Salt"),Fresh("Fresh");
	
	private String name;
	
	WaterType(String name){
		this.name = name; 
	}
	
	@Override
	public String toString() {
		return name;
	}
}
