package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Birds.Pigeon.equals(type))
			return new Pigeon();
		else if(Constants.Animals.Birds.Crane.equals(type))
			return new Crane();
		else if(Constants.Animals.Birds.Goose.equals(type))
			return new Goose();
		else
			throw new Exception("Invalid animal exception.");
	}
}
