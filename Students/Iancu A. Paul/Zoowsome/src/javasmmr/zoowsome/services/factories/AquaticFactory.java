package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Aquatics.Shark.equals(type))
			return new Shark(Constants.Animals.Aquatics.Attributes.Shark.getMaintenanceCost(), Constants.Animals.Aquatics.Attributes.Shark.getDangerPerc());
		else if(Constants.Animals.Aquatics.Frog.equals(type))
			return new Frog(Constants.Animals.Aquatics.Attributes.Frog.getMaintenanceCost(), Constants.Animals.Aquatics.Attributes.Frog.getDangerPerc());
		else if(Constants.Animals.Aquatics.Jellyfish.equals(type))
			return new Jellyfish(Constants.Animals.Aquatics.Attributes.Jellyfish.getMaintenanceCost(), Constants.Animals.Aquatics.Attributes.Jellyfish.getDangerPerc());
		else
			throw new Exception("Invalid animal exception.");
	}
}
