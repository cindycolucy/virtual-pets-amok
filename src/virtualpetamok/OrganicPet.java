package virtualpetamok;

public interface OrganicPet {

	// Getters for name, hunger and thirst
	String getName();

	int getHunger();

	int getThirst();

	// Methods for feed water and tick organic pets
	void feed();

	void water();

	// Tick for organic pets
	int tick();

}
