package VirtualPetShelter;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> mapOfPets = new HashMap<String, VirtualPet>();
	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

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

	public void wateringPets() {
		for (VirtualPet currentPet : mapOfPets.values()) {
			currentPet.watering();
			return;
		}

	}

	public void playWith(String name) {
		getPet(name).getPlay();
	}

	public void cleanCage(String name) {
		getPet(name).cleanCage();

	}

	public void tick() {
		for (VirtualPet currentPet : pets()) {
			currentPet.tick();
		}
	}

	public void add(VirtualPet virtualPet) {
		pets.put(virtualPet.getName(), virtualPet);

	}

	public void feedAllPets() {
		Collection<VirtualPet> feedingPets = pets.values();
		for (VirtualPet pet : feedingPets) {
			pet.feed();
		}
	}

	public void wateringAllPets() {
		Collection<VirtualPet> wateringPets = pets.values();
		for (VirtualPet pet : wateringPets) {
			pet.watering();

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

}
