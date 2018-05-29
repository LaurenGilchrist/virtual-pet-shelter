package VirtualPetShelter;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> mapOfPets = new HashMap<String, VirtualPet>();
	private Map<String, VirtualPet> pets;

	public Collection<VirtualPet> pets() {
		return mapOfPets.values();
	}

	public VirtualPet getPet(String name) {
		return mapOfPets.get(name);

	}

	public void intake(VirtualPet pet) {
		mapOfPets.put(pet.getName(), pet);

	}

	public void adopt(VirtualPet pet) {
		mapOfPets.remove(pet.getName());

	}

	public void feedPets() {
		for (VirtualPet currentPet : mapOfPets.values()) {
			currentPet.feed();
		}

	}

	public void waterPets() {
		for (VirtualPet currentPet : mapOfPets.values()) {
			currentPet.water();
		}

	}

	public void playWith(String name) {
		getPet(name).getPlay();
	}
	public void play(int time) {
		if ( time - time >= 0) {
			time -= time;
		} else {
			time = 0;
		}
	}

	public void cleanCage(String name) {
		getPet(name).cleanCage();

	}

	public void tick() {
		for (VirtualPet currentPet : pets()) {
			currentPet.tick();
		}
	}

	public int getHunger() {

		return getHunger();
	}

	public void add(VirtualPet virtualPet) {
		pets.put(virtualPet.getName(), virtualPet);

	}

	public void feedAllPets() {
		Collection<VirtualPet> feedingPets = pets.values();
		for (VirtualPet pet : feedingPets) {
			pet.feed(100);
	}
	}
	public void waterAllPets() {
		Collection<VirtualPet> wateringPets = pets.values();
		for (VirtualPet pet : wateringPets) {
			pet.water(100);
			
		}
	}
	public Collection<VirtualPet> getAllPets() {
				
		return pets.values();
	}
			
	public void remove(VirtualPet pet) {
			pets.remove(pet.getName());
		}


    public void displayAllPets() {
            System.out.println("Name" + "\t\t" + "Hunger" + "\t" + "Thirst" + "\t" + "Happiness");
    		Collection<VirtualPet> displayPets = pets.values();
    		for (VirtualPet pet : displayPets) {
    			System.out.println(
    					pet.getName() + "\t\t" + pet.getHunger() + "\t" + pet.getThirst() + "\t" + pet.getHappiness());
    		}
    	}

    	public void displayAllPetDescriptions() {
    		System.out.println("Name" + "\t\t" + "Description");
    		Collection<VirtualPet> displayPets = pets.values();
    		for (VirtualPet pet : displayPets) {
    			System.out.println(pet.getName() + "\t\t" + pet.getDescription());
    		}
    	}

    	public boolean checkPetName(String enteredName) {
    		Collection<VirtualPet> petNames = pets.values();
    		for (VirtualPet pet : petNames) {
    		if (pet.getName().equals(enteredName)) {
			return true;
		}
	}
    		return false;
}
    	public VirtualPet getName() {
    		
    		return getName();
    	}
    	
	@Override
	public String toString() {
		return ("" + mapOfPets.keySet() + mapOfPets.values());

	}


		
	}


