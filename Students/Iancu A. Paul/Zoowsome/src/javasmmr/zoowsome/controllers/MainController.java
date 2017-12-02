package javasmmr.zoowsome.controllers;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.xml.stream.*;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.repositories.*;

public class MainController {
	public static final String[][] animalsConstants = {{Constants.Animals.Mammals.Tiger,Constants.Animals.Mammals.Monkey,Constants.Animals.Mammals.Cow},
			{Constants.Animals.Reptiles.Crocodile,Constants.Animals.Reptiles.Snake,Constants.Animals.Reptiles.Lizard},
			{Constants.Animals.Birds.Pigeon,Constants.Animals.Birds.Crane,Constants.Animals.Birds.Goose},
			{Constants.Animals.Aquatics.Jellyfish,Constants.Animals.Aquatics.Frog,Constants.Animals.Aquatics.Shark},
			{Constants.Animals.Insects.Spider,Constants.Animals.Insects.Butterfly,Constants.Animals.Insects.Cockroach}};
	
	public static final int MAX_NR = 50;
	
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		AnimalFactory animalFactory = new AnimalFactory();
		SpeciesFactory[] speciesFactories = null;
		try {
		speciesFactories = new SpeciesFactory[]{animalFactory.getSpicesFactory(Constants.Species.Mammals),
											 animalFactory.getSpicesFactory(Constants.Species.Reptiles),
											 animalFactory.getSpicesFactory(Constants.Species.Birds),
											 animalFactory.getSpicesFactory(Constants.Species.Aquatics),
											 animalFactory.getSpicesFactory(Constants.Species.Insects)};
		
		}catch(Exception ex) {}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3 ; j++) {
				int nrAnimals = (int)(Math.random()*MAX_NR+1);
				for(int t = 0; t < nrAnimals; t++) {
					try {
						animals.add( speciesFactories[i].getAnimal(animalsConstants[i][j]) );
					}catch(Exception ex) {}
				}
			}
		}
		AnimalRepository animalRepository = new AnimalRepository();
		try {
			animalRepository.save(animals);
		}catch(FileNotFoundException e) {
			System.out.println("File wasn't found");
		}
		catch(XMLStreamException e) {
			System.out.println("Problems with the XML file");
		}
		EmployeeAbstractFactory empAbstrFactory = new EmployeeAbstractFactory();
		CaretakerFactory employeeFactory = null;
		try {
			employeeFactory = (CaretakerFactory)empAbstrFactory.getEmployeeFactory(Constants.Employees.Caretaker);
		}catch(Exception ex) {}
		ArrayList<Employee> caretakers = new ArrayList<Employee>();
		caretakers.add(employeeFactory.getEmployee("John", new BigDecimal(100.0)));
		caretakers.add(employeeFactory.getEmployee("Paul", new BigDecimal(100.0)));
		caretakers.add(employeeFactory.getEmployee("Geroge", new BigDecimal(100.0)));
		caretakers.add(employeeFactory.getEmployee("Ringo", new BigDecimal(100.0)));
		EmployeeRepository employeeRepository = new EmployeeRepository();
		try {
			employeeRepository.save(caretakers);
		}catch(FileNotFoundException e) {
			System.out.println("File wasn't found");
		}
		catch(XMLStreamException e) {
			System.out.println("Problems with the XML file");
		}
		for(Employee caretaker:caretakers) {
			for(Animal animal:animals) {
				if(!caretaker.getIsDead() && !animal.isTakenCareOf()) {
					Caretaker realCaretaker = (Caretaker) caretaker;
					String result = realCaretaker.takeCareOf(animal);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						caretaker.setIsDead(true);
					}
					else if(result.equals(Constants.Employees.Caretakers.TCO_SUCCES)) {
						animal.setTakenCareOf(true);
					}
				}
			}
		}
		boolean allAnimalsInCare = true;
		for(Animal animal:animals)
			if(!animal.isTakenCareOf())
				allAnimalsInCare=false;
		System.out.println(allAnimalsInCare ? "All animals are in care" : "Not all the animals are cared after");
	}
}
