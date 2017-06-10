package virtualpetamok;

public interface RoboticPet {
	//Getters for name and oil level (robotic pets)
	String getName();
	int getOilLevel();
	
	//Methods for maintaining a robotic pet
	void oilPet();
	void recharge();
	
	//Tick for robotic pets
	void tick();
}