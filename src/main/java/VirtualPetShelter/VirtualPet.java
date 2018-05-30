package VirtualPetShelter;

import java.util.Random;

public class VirtualPet {

	private Random generator = new Random();

	
	private String petName;
	private int hunger;
	private int thirst;
	private int play;
	private int happiness;
	private int messiness;
	private String petDescription;
	private double randomizedAction;
	
	
	
	public VirtualPet(String petName, int hunger, int thirst, int play, int happiness, int messiness, double randomizedAction) {
			this.petName = petName;
			this.hunger = hunger;	
			this.thirst = thirst;
			this.play = play;
			this.happiness = happiness;
			this.messiness = messiness;
			this.randomizedAction = randomizedAction;
		
	}
	

	public VirtualPet(String nameParam, String descriptionParam) {
		petName = nameParam;
		petDescription = descriptionParam;
		messiness = 0;	
	}
	public VirtualPet(String nameParam, String descriptionParam, int hungerParam, int thirstParam, int playParam, int happinessParam, int cageMessinessParam) {
		petName = nameParam;
		petDescription = descriptionParam;
		hunger = hungerParam;
		thirst = thirstParam;
		play = playParam;
		happiness = happinessParam;
		messiness = cageMessinessParam;	
	}
	
	public VirtualPet(String name, int hunger, int thirst, int play, int happiness, String petDescription, int messiness) {
		
	}


	public void tick() {
		hunger += 10;
		thirst += 10;
		play += 10;
		happiness += 20;
		messiness += 5;
	}
	
	public void reset() {
		hunger = 0;
		thirst = 0;
		play = 0;
		happiness = 0;
		messiness = 0;
	}

	private int generateRandom() {
		return generator.nextInt(10);
		
	}
	public String getName() {
		return petName;
		
	}
	public void rename(String newName) {
		petName = newName;
	}
	
	public int getHunger() {
		return hunger;
	}
	public boolean isHungry() {
		return hunger >=20;
		
	}
	public boolean isVeryHungry() {
		return hunger >=50;
		
	}
	public void feed() {
		hunger = 0;
		thirst += 10;
		happiness += 20;
		messiness += 20;
		
	}
	public void giveAFish() {
		hunger -= 100;
		thirst -= 20;			
	}
	public void giveASquid() {
		hunger -= 50;
		thirst -= 10;	
	}
	public boolean hasStarved() {
		return hunger >=200; 
	}
	public int getThirst() {
		return thirst;
	}
	public boolean isThirsty() {
		return thirst >= 50;
		
	}
	public boolean isVeryThirsty() {
		return thirst >=100;
		
	}
	public void watering() {
		thirst = 0;
		happiness +=20;
		messiness +=10;
	}
	public boolean hasDehydrated() {
		return thirst >=200;
	}
	public int getHappiness() {
		return happiness;
	}
	public int getPlay() {
		
		return play;
	}
	public int getMessiness() {
		
		return messiness;
	}
	public void cleanCage() {
		messiness =0;
	}
	
	public void swim() {
		play -=  10;
		happiness +=50;
		
	
		
	}


	public void playTime() {
		hunger += 10;
		thirst += 5;
		happiness += 20;
		
	}


	public void drink() {
		thirst = 0;
		happiness +=10;
		messiness +=10;
		
	}


	public String getDescription() {
		petDescription = "Loves to eat and play!";
		return petDescription;
	}


	public void water(int volume) {
		if (thirst - volume >= 0) {
			thirst -= volume;
		} else {
			thirst = 0;
	}
	}
	@Override
	public String toString() {
		return ("[" + petName + "]" + petDescription);
		
	}
	}
		
	