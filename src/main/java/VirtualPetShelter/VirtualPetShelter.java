package VirtualPetShelter;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	private int hunger;
	private int thirst;
	private int play;
	private int happiness;
	private int messiness;
	
	
	
	public VirtualPetShelter(int hunger, int thirst, int play, int happiness, int messiness) {
		
			this.hunger = hunger;	
			this.thirst = thirst;
			this.play = play;
			this.happiness = happiness;
			this.messiness = messiness;
		
	}
	public VirtualPetShelter(String  name, int hunger, int thirst, int play, int happiness, int messiness) {
		// TODO Auto-generated constructor stub
	}
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
			
			
	}
	public void waterPets() {
		for(VirtualPet currentPet:  mapOfPets.values()) {
			currentPet.water();
		}
			
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
	
	public int getHunger() {
		
		return getHunger();
	}
	public void feed(int hunger) {
		
		hunger -=15;
		happiness +=25;
		
	}
	public void PlayTime(int play) {
		hunger += 25;
		thirst += 5;
		happiness +=50;
	}
	public int getThirst() {
		
		return thirst;
	}
	public void drink(int drink) {
		thirst-= drink;
		happiness += 15;
		
	}
	public int getPlay() {
		
		return play;
	}
	public void swim(int swim) {
		play -= swim;
		happiness +=50;
	}
		
	public int getHappiness() {
		
		return happiness;
	}
	public int getMessiness() {
		
		return messiness;
		
		
	}
		@Override
		public String toString() {
			return("" + mapOfPets.keySet() + mapOfPets.values());
			
	}
	}
			
		
	
		

	
	
	