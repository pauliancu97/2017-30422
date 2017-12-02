package javasmmr.zoowsome.services.factories;

public final class Constants {
	public static final class Species{
		public static final String Mammals = "Mammals";
		public static final String Reptiles = "Reptiles";
		public static final String Birds = "Birds";
		public static final String Aquatics = "Aquatics";
		public static final String Insects = "Insects";
	}
	
	public static final class XML_TAGS{
		public static final String ANIMAL="ANIMAL";
		public static final String DISCRIMINANT = "DISCIRMINANT";
		public static final String EMPLOYEE = "EMPLOYEE";
	}
	
	public static final class Animals{
		public static final class Mammals{
			public static final String Tiger = "TIGER";
			public static final String Monkey = "MONKEY";
			public static final String Cow = "COW";
			public enum Attributes{
				Tiger(5.0,3.0,0.99,0.5),Monkey(4.0,2.0,0.6,0.3),Cow(3.0,1.0,0.4,0.1);
				private double maxMaintenanceCost;
				private double minMaintenanceCost;
				private double maxDangerPerc;
				private double minDangerPerc;
				
				Attributes(double maxMaintenanceCost, double minMaintenanceCost, double maxDangerPerc, double minDangerPerc){
					this.maxMaintenanceCost = maxMaintenanceCost;
					this.minMaintenanceCost = minMaintenanceCost;
					this.maxDangerPerc = maxDangerPerc;
					this.minDangerPerc = minDangerPerc;
				}
				
				public double getMaintenanceCost() {
					return minMaintenanceCost + Math.random()*(maxMaintenanceCost - minMaintenanceCost);
				}
				
				public double getDangerPerc() {
					return minDangerPerc + Math.random()*(maxDangerPerc - minDangerPerc);
				}
			}
		}
		
		public static final class Reptiles{
			public static final String Crocodile = "CROCODILE";
			public static final String Lizard = "LIZARD";
			public static final String Snake = "SNAKE";
			public enum Attributes{
				Crocodile(5.0,3.0,0.99,0.5),Lizard(2.0,0.5,0.2,0.1),Snake(3.0,1.0,0.5,0.3);
				private double maxMaintenanceCost;
				private double minMaintenanceCost;
				private double maxDangerPerc;
				private double minDangerPerc;
				
				Attributes(double maxMaintenanceCost, double minMaintenanceCost, double maxDangerPerc, double minDangerPerc){
					this.maxMaintenanceCost = maxMaintenanceCost;
					this.minMaintenanceCost = minMaintenanceCost;
					this.maxDangerPerc = maxDangerPerc;
					this.minDangerPerc = minDangerPerc;
				}
				
				public double getMaintenanceCost() {
					return minMaintenanceCost + Math.random()*(maxMaintenanceCost - minMaintenanceCost);
				}
				
				public double getDangerPerc() {
					return minDangerPerc + Math.random()*(maxDangerPerc - minDangerPerc);
				}
			}
		}
		
		public static final class Birds{
			public static final String Crane = "CRANE";
			public static final String Goose = "GOOSE";
			public static final String Pigeon = "PIGEON";
			public enum Attributes{
				Crane(6.0,5.0,0.1,0.0),Goose(1.0,0.5,0.1,0.0),Pigeon(1.0,0.1,0.1,0.0);
				private double maxMaintenanceCost;
				private double minMaintenanceCost;
				private double maxDangerPerc;
				private double minDangerPerc;
				
				Attributes(double maxMaintenanceCost, double minMaintenanceCost, double maxDangerPerc, double minDangerPerc){
					this.maxMaintenanceCost = maxMaintenanceCost;
					this.minMaintenanceCost = minMaintenanceCost;
					this.maxDangerPerc = maxDangerPerc;
					this.minDangerPerc = minDangerPerc;
				}
				
				public double getMaintenanceCost() {
					return minMaintenanceCost + Math.random()*(maxMaintenanceCost - minMaintenanceCost);
				}
				
				public double getDangerPerc() {
					return minDangerPerc + Math.random()*(maxDangerPerc - minDangerPerc);
				}
			}
		}
		
		public static final class Aquatics{
			public static final String Frog = "FROG";
			public static final String Jellyfish = "JELLIFISH";
			public static final String Shark = "SHARK";
			public enum Attributes{
				Frog(2.0,1.0,0.1,0.0),Jellyfish(1.5,0.5,0.1,0.0),Shark(7.0,5.0,0.7,0.2);
				private double maxMaintenanceCost;
				private double minMaintenanceCost;
				private double maxDangerPerc;
				private double minDangerPerc;
				
				Attributes(double maxMaintenanceCost, double minMaintenanceCost, double maxDangerPerc, double minDangerPerc){
					this.maxMaintenanceCost = maxMaintenanceCost;
					this.minMaintenanceCost = minMaintenanceCost;
					this.maxDangerPerc = maxDangerPerc;
					this.minDangerPerc = minDangerPerc;
				}
				
				public double getMaintenanceCost() {
					return minMaintenanceCost + Math.random()*(maxMaintenanceCost - minMaintenanceCost);
				}
				
				public double getDangerPerc() {
					return minDangerPerc + Math.random()*(maxDangerPerc - minDangerPerc);
				}
			}
		}
		
		public static final class Insects{
			public static final String Butterfly = "BUTTERFLY";
			public static final String Cockroach = "COCKROACK";
			public static final String Spider = "SPIDER";
			public enum Attributes{
				Butterfly(5.0,3.0,0.0,0.0),Cockroach(1.0,0.1,0.0,0.0),Spider(3.0,1.0,0.4,0.1);
				private double maxMaintenanceCost;
				private double minMaintenanceCost;
				private double maxDangerPerc;
				private double minDangerPerc;
				
				Attributes(double maxMaintenanceCost, double minMaintenanceCost, double maxDangerPerc, double minDangerPerc){
					this.maxMaintenanceCost = maxMaintenanceCost;
					this.minMaintenanceCost = minMaintenanceCost;
					this.maxDangerPerc = maxDangerPerc;
					this.minDangerPerc = minDangerPerc;
				}
				
				public double getMaintenanceCost() {
					return minMaintenanceCost + Math.random()*(maxMaintenanceCost - minMaintenanceCost);
				}
				
				public double getDangerPerc() {
					return minDangerPerc + Math.random()*(maxDangerPerc - minDangerPerc);
				}
			}
		}
	}
	
	public static final class Employees{
		public static final String Caretaker = "Caretaker";
		
		public static final class Caretakers{
			public static final double MIN_WORKING_HOURS = 10;
			public static final double MAX_WORKING_HOURS = 40;
			
			public static final String TCO_SUCCES = "SUCCES";
			public static final String TCO_KILLED = "KILLED";
			public static final String TCO_NO_TIME = "NO_TIME";
			
			public static double getWorkingHours() {
				return MIN_WORKING_HOURS + Math.random()*(MAX_WORKING_HOURS - MIN_WORKING_HOURS);
			}
		}
	}
}
