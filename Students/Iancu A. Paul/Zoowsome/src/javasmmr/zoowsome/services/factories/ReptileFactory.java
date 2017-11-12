package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Reptiles.Crocodile.equals(type))
			return new Crocodile(Constants.Animals.Reptiles.Attributes.Crocodile.getMaintenanceCost(), Constants.Animals.Reptiles.Attributes.Crocodile.getDangerPerc());
		else if(Constants.Animals.Reptiles.Lizard.equals(type))
			return new Lizard(Constants.Animals.Reptiles.Attributes.Lizard.getMaintenanceCost(), Constants.Animals.Reptiles.Attributes.Lizard.getDangerPerc());
		else if(Constants.Animals.Reptiles.Snake.equals(type))
			return new Snake(Constants.Animals.Reptiles.Attributes.Snake.getMaintenanceCost(), Constants.Animals.Reptiles.Attributes.Snake.getDangerPerc());
		else
			throw new Exception("Invalid animal exception.");
	}
}
