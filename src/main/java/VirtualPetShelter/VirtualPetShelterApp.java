package VirtualPetShelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myPetShelter = new VirtualPetShelter();
		VirtualPet penelope = new VirtualPet("Penelope", "Loves to eat and play!");
		VirtualPet luna = new VirtualPet("Luna",  "She is a trickster!!");
		VirtualPet hermione = new VirtualPet("Hermione", "She is a smarty pants!");
		VirtualPet alastor = new VirtualPet("Alastor", "He is a little shy");
		
		myPetShelter.add(penelope);
		myPetShelter.add(luna);
		myPetShelter.add(hermione);
		myPetShelter.add(alastor);
		
		System.out.println("Welcome to Hagrid's Aquarium of exotic Animals!");
		System.out.println();
		
		String choice = "";
		
			System.out.println("Here are our pets at the aquarium");
			myPetShelter.displayAllPets();
			myPetShelter.tick();
			System.out.println();
			Collection<VirtualPet> pets = myPetShelter.getAllPets();
			
			System.out.println("What would you like to do today?");
			System.out.println();
			System.out.println("1. Feed the pets");
			System.out.println("2. Water the pets");
			System.out.println("3. Play with a pet");
			System.out.println("4. Adopt a pet");
			System.out.println("5. Admit a pet");
			System.out.println("6. Quit");
			
			choice = input.nextLine();
			if(choice.equals("1")) {
				myPetShelter.feedAllPets();
				System.out.println("Yummy, they all loved the fish!");
				System.out.println();
			}else if (choice.equals("2")) {
				myPetShelter.waterAllPets();
				System.out.println("The penguins and polar bears love water!");
				System.out.println();
			}else if (choice.equals("3")) {
				myPetShelter.playWith(choice);
				System.out.println("What pet would you like to play with?");
				System.out.println();
			}else if (choice.equals("4")) {
				myPetShelter.adopt(myPetShelter.getName());
				System.out.println("What pet would you like to adopt");
				System.out.println();
			}else if (choice.equals("5")) {
				System.out.println("You have chosen to admit a pet");
				System.out.println("What is the name of your pet?");
				String admitPetName = input.nextLine();
				System.out.println("What is the description of " + admitPetName + "?");
				input.nextLine();
				VirtualPet admitPet = new VirtualPet(admitPetName, admitPetDescription);
				
				
				
				
		}
	
				
				
			
			
			
			
			
		
			
			
			
		
	
		
		
		
		
		
		
		
		

	}

}
