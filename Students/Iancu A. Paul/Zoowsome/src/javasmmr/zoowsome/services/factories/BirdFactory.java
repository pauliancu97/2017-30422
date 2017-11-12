package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Birds.Pigeon.equals(type))
			return new Pigeon(Constants.Animals.Birds.Attributes.Pigeon.getMaintenanceCost(), Constants.Animals.Birds.Attributes.Pigeon.getDangerPerc());
		else if(Constants.Animals.Birds.Crane.equals(type))
			return new Crane(Constants.Animals.Birds.Attributes.Crane.getMaintenanceCost(), Constants.Animals.Birds.Attributes.Crane.getDangerPerc());
		else if(Constants.Animals.Birds.Goose.equals(type))
			return new Goose(Constants.Animals.Birds.Attributes.Goose.getMaintenanceCost(), Constants.Animals.Birds.Attributes.Goose.getDangerPerc());
		else
			throw new Exception("Invalid animal exception.");
	}
}
