package virtualpetamok;

import java.util.Random;

public abstract class VirtualPet {

	protected Random generator = new Random();

	// Instance variables for all pets
	protected String name;
	protected String description;

	protected int health;
	protected int mood;

	// Constructor that accepts VirtualPet and establishes default attributes
	// for new pets
	public VirtualPet(String newName, String newDescription) {
		name = newName;
		description = newDescription;
		health = 50;
		mood = 50;
	}

	// Getters for name, health and mood
	public abstract String getName();

	public abstract int getHealth();

	public abstract int getMood();

	// Play method
	public abstract void play();

	// Method to generate random for the tick
	public abstract int generateRandom();

	// To string method for name and description
	@Override
	public String toString() {
		return ("[" + name + "] " + description);
	}
}