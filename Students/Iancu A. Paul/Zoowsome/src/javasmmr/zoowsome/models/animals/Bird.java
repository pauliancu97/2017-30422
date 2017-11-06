package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal{
	private boolean migrates;
	private int avgFlightAltitude;
	
	Bird(boolean migrates, int avgFlightAltitude){	
		this.migrates = migrates;
		setAverageFlightAltitude(avgFlightAltitude);
	}
	
	private void setAverageFlightAltitude(int avgFlightAltitude) {
		if(avgFlightAltitude > 0)
			this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public int getAvgFlightAltitude() {
		return avgFlightAltitude;
	}
	
	public boolean getMigrates() {
		return migrates;
	}
}
