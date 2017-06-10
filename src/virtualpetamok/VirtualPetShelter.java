package virtualpetamok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	//Declaring variable for the litter box which effects all cats in the shelter
	private int litterBox = 50;
	
	// Map of pets and attributes
	Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	//Getter for litter box status
	public int getLitterBox() {
		return litterBox;
	}
	//Method to take litter box level to 0
	public void cleanLitterBox() {
		litterBox = 0;
	}

	//Method to maintain all robotic pets
	public void maintainAllRobo() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).oilPet();
				((RoboticPet) pet).recharge();
			}
		}
	}
	//Method to clean all the dog cages
	public void cleanDogCages() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrgDog) {
				((OrgDog) pet).cleanCage();
			}
		}
	}
	//Method to walk all the dogs (organic and robotic)
	public void walkDogs() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof Dog) {
				((Dog) pet).walk();
			}
		}

	}
	//Methods to intake any type of pet
	public void intake(VirtualPet pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public void intake(RoboticPet pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public void intake(OrganicPet pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	//Method to feed all organic pets
	public void feedAllOrganic() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
		}
		litterBox += 10;
	}
	//Method to water all organic pets
	public void waterAllOrganic() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}
		litterBox += 10;
	}

	// Tick method 
	void tickAllPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrgCat) {
				litterBox += ((OrgCat) pet).tick();
			} else if (pet instanceof OrganicPet) {
				((OrganicPet) pet).tick();
			}
		}
	}

	// Method returning collection of all pets in the shelter
	public Collection<VirtualPet> pets() {
		return shelterPets.values();
	}

	// Method to return a pet from the map by name
	public VirtualPet getPet(String name) {
		return shelterPets.get(name);

	}

	// Method to play with one pet
	public void playOne(VirtualPet player) {
		player.play();
	}

	// Method to adopt a pet
	public void adoptPet(VirtualPet pet) {
		shelterPets.remove(pet.getName());
	}
}