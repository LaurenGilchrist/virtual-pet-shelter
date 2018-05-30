package VirtualPetShelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myPetShelter = new VirtualPetShelter();
		VirtualPet penelope = new VirtualPet("Penelope", "Loves to eat and play!");
		VirtualPet luna = new VirtualPet("Luna", "She is a trickster!!");
		VirtualPet hermione = new VirtualPet("Hermione", "She is a smarty pants!");
		VirtualPet alastor = new VirtualPet("Alastor", "He is a little shy");

		myPetShelter.add(penelope);
		myPetShelter.add(luna);
		myPetShelter.add(hermione);
		myPetShelter.add(alastor);

		System.out.println("Welcome to Hagrid's Aquarium of exotic Animals!");
		System.out.println();

		System.out.println("Here are our pets at the aquarium");
		myPetShelter.displayAllPets();
		myPetShelter.tick();
		System.out.println();
		Collection<VirtualPet> pets = myPetShelter.getAllPets();
		
		
		String choice;
		do {
		System.out.println("What would you like to do today?");
		System.out.println("1. Feed the pets");
		System.out.println("2. Water the pets");
		System.out.println("3. Play with a pet");
		System.out.println("4. Adopt a pet");
		System.out.println("5. Admit a pet");
		System.out.println("6. Quit");
		choice = input.nextLine();
		
		if (choice.equals("1")) {
			myPetShelter.feedAllPets();
			System.out.println("Yummy, they all loved the fish!");
			int hunger = input.nextInt();
			input.nextLine();
			
		} else if (choice.equals("2")) {
			myPetShelter.wateringAllPets();
			System.out.println("The penguins and polar bears love water!");
			int thirst = input.nextInt();
			input.nextLine();
			
		} else if (choice.equals("3")) {
			myPetShelter.playWith(choice);
			System.out.println("What pet would you like to play with?");
			System.out.println();
			myPetShelter.displayAllPetDescriptions();
			int play = input.nextInt();
			String playChoice = input.nextLine();

			while (myPetShelter.checkPetName(playChoice) == false) {
				if (myPetShelter.checkPetName(playChoice) == false) {
					System.out.println("There is no animal with that name at the aquarium.");
					System.out.println("Please pick another name");
					playChoice = input.nextLine();
				}
			}

			VirtualPet playingPet = myPetShelter.getPet(choice);
			System.out.println("How much time would you like to play with " + choice + "?");
			int playTime = input.nextInt();
			System.out.println(choice + "Was so happy to get to play with you today!!");
			input.nextLine();

		} else if (choice.equals("4")) {
			if (myPetShelter.getAllPets().isEmpty()) {
				System.out.println("Sorry, there are no pet adoptions today. Come back again soon!");
			} else {
				System.out.println("You have chosen to adopt a pet today. " + "Congrats!");
				System.out.println("Which pet have you chosen today?");
				myPetShelter.displayAllPetDescriptions();
				String adoptionChoice = input.nextLine();

				while (myPetShelter.checkPetName(adoptionChoice) == false) {
					if (myPetShelter.checkPetName(adoptionChoice) == false) {
						System.out.println("Sorry there are no penguins with that name.");
						System.out.println("Please choose another name.");
						adoptionChoice = input.nextLine();
					}
				}
				VirtualPet adoptionPet = myPetShelter.getPet(adoptionChoice);
				myPetShelter.remove(((VirtualPetShelter) pets).getName());		
				System.out.println("You chose to adopt " + adoptionChoice + "today.");
				System.out.println(adoptionChoice + "Is so happy to go home with you today!");
				System.out.println("Thank you for adopting from us today!");
				String removePet = input.nextLine();
			}

		} else if (choice.equals("5")) {
			System.out.println("You have chosen to admit a pet");
			System.out.println("What is the name of your pet?");
			String admitPetName = input.nextLine();
			System.out.println("What is the description of " + admitPetName + "?");
			String admitPetDescription = input.nextLine();
			VirtualPet admitPet = new VirtualPet(admitPetName, admitPetDescription);
			System.out.println("Thank you for trusting us to take care of your pet today!");
			input.nextLine();

		} else if (choice.equals("6")) {
			System.out.println("Thank you for visiting us at Hagrid's Aquarium of exotic Animals!");
			System.out.println("Please come visit us again soon!!");
			System.exit(0);

		} else {
			System.out.println("I don't understand your choice, please choose again.");
		}
		penelope.tick();		
		System.out.println("Penelope's levels are at " + penelope.getHunger()  + penelope.getThirst()  + penelope.getPlay()  + penelope.getHappiness()  + penelope.getMessiness());
		
		luna.tick();
		System.out.println("Luna's levels are "  + luna.getHunger()  + luna.getThirst()  + luna.getPlay()  + luna.getHappiness()  + luna.getMessiness());
		
		hermione.tick();
		System.out.println("Hermione's levels are "  + hermione.getHunger()  + hermione.getThirst()  + luna.getPlay()  + luna.getHappiness()  + luna.getMessiness());
		
		alastor.tick();
		System.out.println("Alastor's levels are "  + alastor.getHunger()  + alastor.getThirst()  + alastor.getPlay()  + alastor.getHappiness()  + alastor.getMessiness());
		
		} while (!choice.equals("6"));
		
		input.close();
	}
}
		
		
	