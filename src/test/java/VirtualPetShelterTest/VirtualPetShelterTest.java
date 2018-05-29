package VirtualPetShelterTest;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.util.Collection;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

import VirtualPetShelter.VirtualPet;
import VirtualPetShelter.VirtualPetShelter;

public class VirtualPetShelterTest {
		
	VirtualPetShelter underTest;
	VirtualPet pet1;
	VirtualPet pet2;

	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("Penelope", 0, 0, 0, 0, 0, 0);
		pet2 = new VirtualPet("Luna", 0, 0, 0, 0, 0, 0);
	}	
	
	@Test
	public void shouldHaveADefaultHungerOf50() {
	VirtualPet underTest = new VirtualPet("", 50, 0, 0, 0, 0, 0);
	int check = underTest.getHunger();
	assertEquals(50, check);
	
	}
	
	@Test
	public void shouldHaveADefaultHungerOf100() {
		VirtualPet underTest = new VirtualPet("", 100, 0, 0, 0, 0, 0);
		int check = underTest.getHunger();
		assertEquals(100, check);
	}
	
	@Test
	public void shouldHaveHungerOf35AfterFeedOf15() {
		VirtualPet underTest = new VirtualPet("", 50, 0, 0, 0, 0, 0);
		underTest.feed(15);
		int check = underTest.getHunger();
		assertEquals(35, check);
		
	}	
	
	@Test
	public void shouldHaveHungerOf65AfterTick() {
		VirtualPet underTest = new VirtualPet("", 50, 0, 0, 0, 0, 0);
		underTest.tick();
		int check = underTest.getHunger();
		assertEquals(65, check);
		
	}
	
	@Test
	public void shouldHaveHungerOf75AfterPlayTime() {
		VirtualPet underTest = new VirtualPet("",50, 0, 0, 0, 0, 0);
		underTest.PlayTime(75);
		int check = underTest.getHunger();
		assertEquals(75, check);
		
	}
	
	@Test 
	public void shouldHaveADefaultThirstOf10() {
		VirtualPet underTest = new VirtualPet("", 0, 10, 0, 0, 0, 0);
		int check = underTest.getThirst();
		assertEquals(10, check);
	}
	
	@Test
	public void shouldHaveThirstof5AfterDrinkOf5() {
		VirtualPet underTest = new VirtualPet("", 0, 10, 0, 0, 0, 0);
		underTest.drink(5);
		int check = underTest.getThirst();
		assertEquals(5, check);
		
	}
	@Test
	public void shouldHaveThirstOf15AfterTick() {
		VirtualPet underTest = new VirtualPet("", 0, 10, 0, 0, 0, 0);
		underTest.tick();
		int check = underTest.getThirst();
		assertEquals(15, check);
	}
	
	@Test
	public void shouldHaveDefaultPlayOf100() {
		VirtualPet underTest = new VirtualPet("", 0, 0, 100, 0, 0, 0);
		int check = underTest.getPlay();
		assertEquals(100, check);
		
	}
	@Test
	public void shouldHavePlayof50AfterSwimOf50() {
		VirtualPet underTest = new VirtualPet("", 0, 0, 100, 0, 0, 0);
		underTest.swim(50);
		int check = underTest.getPlay();
		assertEquals(50, check);
	}
	
	@Test
	public void shouldHavePlay150AfterTick() {
		VirtualPet underTest = new VirtualPet("", 0, 0, 150, 0, 0, 0);
		underTest.tick();
		int check = underTest.getPlay();
		assertEquals(150, check);
	}
	
	@Test
	public void shouldHaveDefaultHappinessOf50() {
		VirtualPet underTest = new VirtualPet("", 0, 0, 0, 50, 0, 0);
		int check = underTest.getHappiness();
		assertEquals(50, check);
	}
	
	@Test
	public void shouldHaveHappinessOf100AfterDrink() {
		VirtualPet underTest = new VirtualPet("", 0, 0, 0, 100, 0, 0);
		int check = underTest.getHappiness();
		assertEquals(100, check);
		
	}
	@Test 
	public void shouldHaveHappinessOf150AfterSwim() {
		VirtualPet underTest = new VirtualPet("", 0, 0, 0, 150, 0, 0);
		int check = underTest.getHappiness();
		assertEquals(150, check);
	}
	@Test
	public void shouldHaveDefaultMessinessOF50() {
		VirtualPet underTest = new VirtualPet("", 0, 0, 0, 0, 50, 0);
		int check = underTest.getMessiness();
		assertEquals(50, check);
	}
	
	@Test
	public void shouldReturnNamePenelope() {
		VirtualPet underTest = new VirtualPet("Penelope", 0, 0, 0, 0, 0, 0);
		String check = underTest.getName();
		assertEquals("Penelope", check);
	}

	@Test
	public void shouldReturnNameLuna() {
		VirtualPet underTest = new VirtualPet("Luna", 0, 0, 0, 0, 0, 0);
		String check = underTest.getName();
		assertEquals("Luna", check);
	}	
		
	@Test
	public void shouldReturnDescriptionOfLovesToEatAndPlay() {
		VirtualPet underTest = new VirtualPet("", 0, 0, 0, 0, "Loves to eat and play!", 0);
		String check = underTest.getDescription();
		assertEquals("Loves to play!", check);
	
	}
	@Test
	public void shouldBeAbleToAddPet() {
		underTest.add(pet1);
		VirtualPet check = underTest.getPet("Penelope");
		assertEquals((pet1), check);
	}

	@Test
	public void shouldBeAbleToAddTwoPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		assertThat(allPets, containsInAnyOrder(pet2, pet1));
		
	}
	
	@Test
	public void shouldHaveHungerOf30() {
		VirtualPet newPet = new VirtualPet("Penelope", "Loves to eat and play!");
		int checkHunger = newPet.getHunger();
		assertEquals((30), checkHunger);
	}
	
	@Test
	public void shouldHaveThirstOf30AfterAdding() {
		VirtualPet newPet = new VirtualPet("Penelope", "Loves to eat and play!");
		underTest.add(newPet);
		VirtualPet check = underTest.getPet("Penelope");
		int checkThirst = check.getThirst();
		assertEquals((30), checkThirst);
	}
	
	@Test
	public void allPetsShouldHaveHungerOf0AfterFeeding() {
		VirtualPet pet1 = new VirtualPet("Penelope", 100, 10, 100, 50, "Loves to eat and play!", 50);
		VirtualPet pet2 = new VirtualPet("Luna", 100, 10, 100, 50, "She is a trickster!", 50);
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.feedAllPets();
		VirtualPet check1 = underTest.getPet("Penelope");
		VirtualPet check2 = underTest.getPet("Luna");
		int checkHunger1 = check1.getHunger();
		int checkHunger2 = check2.getHunger();
		assertEquals((0), checkHunger1);
		assertEquals((0), checkHunger2);
	}
	
	@Test
	public void allPetsShouldHaveThirstOf0AfterWatering() {
		VirtualPet pet1 = new VirtualPet("Penelope", 100, 10, 100, 50, "Loves to eat and play!", 50);
		VirtualPet pet2 = new VirtualPet("Luna", 100, 10, 100, 50, "She is a trickster!", 50);
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.waterAllPets();
		VirtualPet check1 = underTest.getPet("Penelope");
		VirtualPet check2 = underTest.getPet("Luna");
		int checkThirst1 = check1.getThirst();
		int checkThirst2 = check2.getThirst();
		assertEquals(0, checkThirst1);
		assertEquals(0, checkThirst2);
	}
	
	@Test
	public void allPetsShouldHaveHungerOf40AfterTick() {
		VirtualPet pet1 = new VirtualPet("Penelope", 30, 10, 100, 50, "Loves to eat and play!", 50);
		VirtualPet pet2 = new VirtualPet("Luna", 30, 10, 100, 50, "She is a trickster", 50);
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.tick();
		VirtualPet check1 = underTest.getPet("Penelope");
		VirtualPet check2 = underTest.getPet("Luna");
		int checkHunger1 = check1.getHunger();
		int checkHunger2 = check2.getHunger();
		assertEquals((40), checkHunger1);
		assertEquals((40), checkHunger2);
	}
	
	@Test
	public void shouldBeAbleToRemovePet() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.remove(pet1);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		assertThat(allPets, containsInAnyOrder(pet2));
	}

	
	
}


	
	
	
	
