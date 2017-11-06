package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static final String[][] animalsConstants = {{Constants.Animals.Mammals.Tiger,Constants.Animals.Mammals.Monkey,Constants.Animals.Mammals.Cow},
			{Constants.Animals.Reptiles.Crocodile,Constants.Animals.Reptiles.Snake,Constants.Animals.Reptiles.Lizard},
			{Constants.Animals.Birds.Pigeon,Constants.Animals.Birds.Crane,Constants.Animals.Birds.Goose},
			{Constants.Animals.Aquatics.Jellyfish,Constants.Animals.Aquatics.Frog,Constants.Animals.Aquatics.Shark},
			{Constants.Animals.Insects.Spider,Constants.Animals.Insects.Butterfly,Constants.Animals.Insects.Cockroach}};
	
	public static final int MAX_NR = 50;
	
	public static void main(String[] args) {
		Animal[] animals = new Animal[15 * MAX_NR];
		AnimalFactory animalFactory = new AnimalFactory();
		SpeciesFactory[] speciesFactories = null;
		try {
		speciesFactories = new SpeciesFactory[]{animalFactory.getSpicesFactory(Constants.Species.Mammals),
											 animalFactory.getSpicesFactory(Constants.Species.Reptiles),
											 animalFactory.getSpicesFactory(Constants.Species.Birds),
											 animalFactory.getSpicesFactory(Constants.Species.Aquatics),
											 animalFactory.getSpicesFactory(Constants.Species.Insects)};
		
		}catch(Exception ex) {}
		int count = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3 ; j++) {
				int nrAnimals = (int)(Math.random()*MAX_NR+1);
				for(int t = 0; t < nrAnimals; t++) {
					try {
						animals[count] = speciesFactories[i].getAnimal(animalsConstants[i][j]);
					}catch(Exception ex) {}
					count++;
				}
			}
		}
	}
}
