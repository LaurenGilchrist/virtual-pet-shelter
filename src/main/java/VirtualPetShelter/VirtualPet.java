package VirtualPetShelter;

import java.util.Random;

public class VirtualPet {

	private Random generator = new Random();

	String description;
	String name;
	int hunger;
	int thirst;
	int play;
	int happiness;
	int cageMessiness;

	public VirtualPet(String nameParam, String descriptionParam) {
		name = nameParam;
		description = descriptionParam;
		cageMessiness = 0;	
	}
	public VirtualPet(String nameParam, String descriptionParam, int hungerParam, int thirstParam, int playParam, int happinessParam, int cageMessinessParam) {
		name = nameParam;
		description = descriptionParam;
		hunger = hungerParam;
		thirst = thirstParam;
		play = playParam;
		happiness = happinessParam;
		cageMessiness = cageMessinessParam;	
	}
	
	public VirtualPet(String name, int thirst, int hunger, int play, int happiness, int cageMessiness) {
		
	}
	public void tick() {
		hunger += (10 + generateRandom());
		thirst += (10 + generateRandom());
		play += (10 + generateRandom());
		happiness += (20 + generateRandom());
		cageMessiness += (5 + generateRandom());
	}
	
	public void reset() {
		hunger = 0;
		thirst = 0;
		play = 0;
		happiness = 0;
		cageMessiness = 0;
	}

	private int generateRandom() {
		return generator.nextInt(10);
		
	}
	public String getName() {
		return name;
		
	}
	public void rename(String newName) {
		name = newName;
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
		cageMessiness += 20;
		
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
	public void water() {
		thirst = 0;
		happiness +=20;
		cageMessiness +=10;
	}
	public boolean hasDehydrated() {
		return thirst >=200;
	}
	public int getHappiness() {
		return happiness;
	}
	public void play() {
		hunger += 10;
		thirst += 5;
		happiness += 20;
	}
	public int getMessiness() {
		
		return cageMessiness;
	}
	public void cleanCage() {
		cageMessiness =0;
	}
	
	@Override
	public String toString() {
		return ("[" + name + "]" + description);
	}
	
	
		
	}
		
		
		
	