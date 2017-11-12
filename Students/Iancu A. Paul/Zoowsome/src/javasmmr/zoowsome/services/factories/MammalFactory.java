package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Mammals.Tiger.equals(type))
			return new Tiger(Constants.Animals.Mammals.Attributes.Tiger.getMaintenanceCost(), Constants.Animals.Mammals.Attributes.Tiger.getDangerPerc());
		else if(Constants.Animals.Mammals.Monkey.equals(type))
			return new Monkey(Constants.Animals.Mammals.Attributes.Monkey.getMaintenanceCost(), Constants.Animals.Mammals.Attributes.Monkey.getDangerPerc());
		else if(Constants.Animals.Mammals.Cow.equals(type))
			return new Cow(Constants.Animals.Mammals.Attributes.Cow.getMaintenanceCost(), Constants.Animals.Mammals.Attributes.Cow.getDangerPerc());
		else
			throw new Exception("Invalid animal exception.");
	}
}
