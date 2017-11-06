package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal{
	private float normalBodyTemp;
	private float percBodyHair;
	
	Mammal(float normalBodyTemp, float percBodyHair){
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	private void setNormalBodyTemp(float normalBodyTemp) {
		if(normalBodyTemp > 0.0)
			this.normalBodyTemp = normalBodyTemp;
	}
	
	private void setPercBodyHair(float percBodyHair) {
		if(percBodyHair > 0.0)
			this.percBodyHair = percBodyHair;
	}
	
	public float getNormalBodyTemperature() {
		return normalBodyTemp;
	}
	
	
	public float getPercentageBodyHair() {
		return percBodyHair;
	}
}
