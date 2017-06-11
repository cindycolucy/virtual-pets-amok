package virtualpetamok;

public class RoboDog extends Dog implements RoboticPet {

	// instance variable for robotic dogs
	int oilLevel;

	// superclass constructor
	public RoboDog(String newName, String newDescription) {
		super(newName, newDescription);
		oilLevel = 50;
	}

	// walk method overrides from Dog
	@Override
	public void walk() {
		mood += 20;
		health += 10;
		oilLevel -= 5;
	}

	// get name method overrides from Virtual Pet
	@Override
	public String getName() {
		return name;
	}

	// get health method overrides from Virtual Pet
	@Override
	public int getHealth() {
		return health;
	}

	// get mood method overrides from Virtual Pet
	@Override
	public int getMood() {
		return mood;
	}

	// play method overrides from Virtual Pet
	@Override
	public void play() {
		mood += 20;
		oilLevel -= 5;
	}

	// tick method overrides from Robotic Pet interface
	@Override
	public void tick() {
		mood -= (5 + generateRandom());
		oilLevel -= (5 + generateRandom());
	}

	@Override
	public int generateRandom() {
		return generator.nextInt(10);
	}

	// oil method overrides from Robotic Pet interface
	@Override
	public void oilPet() {
		oilLevel += 20;
	}

	// get oil level method overrides from Robotic Pet interface
	@Override
	public int getOilLevel() {
		return oilLevel;
	}

	// recharge method overrides from Robotic Pet interface
	@Override
	public void recharge() {
		mood += 10;
		health += 10;
	}

	// decrease health method overrides from Robotic Pet interface
	@Override
	public void decreaseHealth() {
		health -= 10;

	}

}
