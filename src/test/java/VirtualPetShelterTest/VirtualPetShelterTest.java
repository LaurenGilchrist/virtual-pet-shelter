package VirtualPetShelterTest;

import static org.hamcrest.CoreMatchers.is;

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
		pet1 = new VirtualPet("Penelope", 10, 10, 10, 10, 10, 10);
		pet2 = new VirtualPet("Luna", 10, 10, 10, 10, 10, 10);
	}	
	
	@Test
	public void shouldHaveADefaultHungerOf10() {
	int check = pet1.getHunger();
	assertEquals(10, check);
	
	
	}
	
	@Test
	public void shouldHaveHungerOfAfterFeedOf15() {
		
		pet2.feed();
		int check = pet2.getHunger();
		assertEquals(0, check);
		
	}	
	
	@Test
	public void shouldHaveHungerOf20AfterTick() {
		
		pet1.tick();
		int check = pet1.getHunger();
		assertEquals(20, check);
		
	}
	
	@Test
	public void shouldHaveHungerOf20AfterPlayTime() {
		
		pet1.playTime();
		int check = pet1.getHunger();
		assertEquals(20, check);
		
	}
	
	@Test 
	public void shouldHaveADefaultThirstOf10() {
		
		int check = pet1.getThirst();
		assertEquals(10, check);
	}
	
	@Test
	public void shouldHaveThirstof0AfterDrinkOf() {
		
		pet1.drink();
		int check = pet1.getThirst();
		assertEquals(0, check);
		
	}
	@Test
	public void shouldHaveThirstOf20AfterTick() {
		
		pet1.tick();
		int check = pet1.getThirst();
		assertEquals(20, check);
	}
	
	@Test
	public void shouldHaveDefaultPlayOf10() {
		
		int check = pet1.getPlay();
		assertEquals(10, check);
		
	}
	@Test
	public void shouldHavePlayof20AfterSwimOf() {
		
		pet1.swim();
		int check = pet1.getPlay();
		assertEquals(0, check);
	}
	
	@Test
	public void shouldHavePlay20AfterTick() {
		
		pet1.tick();
		int check = pet1.getPlay();
		assertEquals(20, check);
	}
	
	@Test
	public void shouldHaveDefaultHappinessOf10() {
		
		int check = pet1.getHappiness();
		assertEquals(10, check);
	}
	
	@Test
	public void shouldHaveHappinessOf20AfterDrink() {
		pet1.drink();
		int check = pet1.getHappiness();
		assertEquals(20, check);
		
	}
	@Test 
	public void shouldHaveHappinessOf20AfterSwim() {
		pet1.swim();
		int check = pet1.getHappiness();
		assertEquals(60, check);
	}
	@Test
	public void shouldHaveDefaultMessinessOF10() {
		
		int check = pet1.getMessiness();
		assertEquals(10, check);
	}
	
	@Test
	public void shouldReturnNamePenelope() {
		
		String check = pet1.getName();
		assertEquals("Penelope", check);
	}

	@Test
	public void shouldReturnNameLuna() {
		
		String check = pet2.getName();
		assertEquals("Luna", check);
	}	
		
	@Test
	public void shouldReturnDescriptionOfLovesToEatAndPlay() {
		
		String check = pet1.getDescription();
		assertEquals("Loves to eat and play!", check);
	
	}
	@Test
	public void shouldBeAbleToAddPet() {
		underTest.add(pet1);
		VirtualPet check = underTest.getPet("Penelope");
		assertThat(pet1, is(pet1));
	}


	@Test
	public void shouldBeAbleToAddTwoPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		assertThat(allPets, containsInAnyOrder(pet2, pet1));
		
	}
	
	@Test
	public void shouldHaveHungerOf0AfterAdding() {
		VirtualPet newPet = new VirtualPet("Penelope", "Loves to eat and play!");
		int checkHunger = newPet.getHunger();
		assertEquals(checkHunger, 0);
	}
	
	@Test
	public void shouldHaveThirstOf0AfterAdding() {
		VirtualPet newPet = new VirtualPet("Penelope", "Loves to eat and play!");
		underTest.add(newPet);
		VirtualPet check = underTest.getPet("Penelope");
		int checkThirst = newPet.getThirst();
		assertEquals(0, checkThirst);
	}
	
	@Test
	public void allPetsShouldHaveHungerOf10AfterFeeding() {
		
		underTest.intake(pet1);
		underTest.intake(pet2);
		underTest.feedAllPets();
		VirtualPet check1 = underTest.getPet("Penelope");
		VirtualPet check2 = underTest.getPet("Luna");
		int checkHunger1 = check1.getHunger();
		int checkHunger2 = check2.getHunger();
		assertEquals(checkHunger1, 10);
		assertEquals(checkHunger2, 10);
	}
	
	@Test
	public void allPetsShouldHaveThirstOf10AfterWatering() {
		
		underTest.intake(pet1);
		underTest.intake(pet2);
		underTest.wateringAllPets();
		VirtualPet check1 = underTest.getPet("Penelope");
		VirtualPet check2 = underTest.getPet("Luna");
		int checkThirst1 = check1.getThirst();
		int checkThirst2 = check2.getThirst();
		assertEquals(checkThirst1, 10);
		assertEquals(checkThirst2, 10);
	}
	
	@Test
	public void allPetsShouldHaveHungerOf20AfterTick() {
		
		underTest.intake(pet1);
		underTest.intake(pet2);
		underTest.tick();
		VirtualPet check1 = underTest.getPet("Penelope");
		VirtualPet check2 = underTest.getPet("Luna");
		int checkHunger1 = check1.getHunger();
		int checkHunger2 = check2.getHunger();
		assertEquals((20), checkHunger1);
		assertEquals((20), checkHunger2);
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


	
	
	
	
