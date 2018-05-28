package VirtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	Map<String, VirtualPet> mapOfPets = new HashMap<String, VirtualPet>();
	public Collection<VirtualPet>pets(){
		return mapOfPets.values();
	}
	public VirtualPet getPet(String name) {
		return mapOfPets.get(name);
		
	}
	public void intake(VirtualPet pet) {
		mapOfPets.put(pet.name, pet);
		
	}
	public void adopt(VirtualPet pet) {
		mapOfPets.remove(pet.name);
		
	}
	public void feedPets() {
		for(VirtualPet currentPet: mapOfPets.values()) {
			currentPet.feed();
			
	}
	public void waterPets() {
		for(VirtualPet currentPet:  mapOfPets.values()) {
			currentPet.water();
			
		}
		
	public void playWith(String name) {
		getPet(name).play();
	}
	public void cleanCage(String name) {
		getPet(name).cleanCage();
		
	}
	public void tick() {
		for(VirtualPet currentPet: pets()) {
			currentPet.tick();
			
		}
	}
	
	@Override
	public String toString() {
		return("" + mapOfPets.keySet() + mapOfPets.values());
	
	}
	}
			
		}
	
		

	
	
	private int hunger;
	private int thirst;
	private int play;
	private int happiness;

	public VirtualPetShelter(int hunger, int thirst, int play, int happiness) {
	  this.hunger = hunger;
	  this.thirst = thirst;
	  this.play = play;
	  this.happiness = happiness;
	  
	}

	public int getHunger() {
		
		return hunger;
	}

	public void feed(int feed) {
		hunger -=15;
		happiness +=25;
	}

	public void tick() {
		hunger += 15;
		thirst += 5;
		play += 50;
		
		
	}

	public void PlayTime(int playtime) {
		hunger += 25;
		thirst += 5;
		happiness +=50;
		
	}

	public int getThirst() {
		
		return thirst;
	}

	public int getPlay() {
		
		return play;
	}

	public void swim(int swim) {
		
		play -= swim;
		
	}

	public int getHappiness() {
		
		return happiness;
	}

	public void drink(int drink) {
		thirst-=drink;
		happiness +=15;
		
	}

}
