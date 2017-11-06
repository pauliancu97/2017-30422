package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Aquatics.Shark.equals(type))
			return new Shark();
		else if(Constants.Animals.Aquatics.Frog.equals(type))
			return new Frog();
		else if(Constants.Animals.Aquatics.Jellyfish.equals(type))
			return new Jellyfish();
		else
			throw new Exception("Invalid animal exception.");
	}
}
