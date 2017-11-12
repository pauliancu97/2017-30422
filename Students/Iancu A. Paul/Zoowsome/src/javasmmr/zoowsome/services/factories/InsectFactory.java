package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Insects.Butterfly.equals(type))
			return new Butterfly(Constants.Animals.Insects.Attributes.Butterfly.getMaintenanceCost(), Constants.Animals.Insects.Attributes.Butterfly.getDangerPerc());
		else if(Constants.Animals.Insects.Cockroach.equals(type))
			return new Cockroach(Constants.Animals.Insects.Attributes.Cockroach.getMaintenanceCost(), Constants.Animals.Insects.Attributes.Cockroach.getDangerPerc());
		else if(Constants.Animals.Insects.Spider.equals(type))
			return new Spider(Constants.Animals.Insects.Attributes.Spider.getMaintenanceCost(), Constants.Animals.Insects.Attributes.Spider.getDangerPerc());
		else
			throw new Exception("Invalid animal exception.");
	}
}
