package virtualpetamok;

public interface RoboticPet {
	// Getters for name and oil level (robotic pets)
	String getName();

	int getOilLevel();

	// oil pet method for a robotic pet
	void oilPet();

	// recharge method for a robotic pet
	void recharge();

	// Tick for robotic pets
	void tick();

	// decrease health for robotic pets
	void decreaseHealth();
}