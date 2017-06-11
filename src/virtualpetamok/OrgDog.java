package virtualpetamok;

public class OrgDog extends Dog implements OrganicPet {

	// instance variables unique to organic dogs
	protected int cageMessiness;
	protected int hunger;
	protected int thirst;

	// superclass constructor
	public OrgDog(String newName, String newDescription) {
		super(newName, newDescription);
		cageMessiness = 50;
		hunger = 50;
		thirst = 50;

	}

	// feed method overrides method from organic pet interface
	public void feed() {
		hunger -= 20;
		mood += 10;
		cageMessiness += 10;
	}

	// water method overrides method from organic pet interface
	public void water() {
		thirst -= 20;
		mood += 10;
		cageMessiness += 10;
	}

	// walk method overrides from Dog
	@Override
	public void walk() {
		cageMessiness -= 5;
		mood += 20;
		health += 10;
		hunger += 5;
		thirst += 5;
	}

	// play method overrides method from Virtual Pet
	@Override
	public void play() {
		mood += 20;
		hunger += 10;
		thirst += 10;
	}

	// get name method overrides method from Virtual Pet
	@Override
	public String getName() {
		return name;
	}

	// get health method overrides method from Virtual Pet
	@Override
	public int getHealth() {
		return health;
	}

	// get mood method overrides method from Virtual Pet
	@Override
	public int getMood() {
		return mood;
	}

	// tick method overrides method from organic pet interface
	@Override
	public int tick() {
		hunger += (5 + generateRandom());
		thirst += (5 + generateRandom());
		mood -= (5 + generateRandom());
		cageMessiness += (5 + generateRandom());
		return cageMessiness;
	}

	@Override
	public int generateRandom() {
		return generator.nextInt(10);
	}

	// get hunger method overrides method from organic pet interface
	@Override
	public int getHunger() {
		return hunger;
	}

	// get cage messiness method (org dogs only)
	public int getCageMessiness() {
		return cageMessiness;
	}

	// clean cage method (org dogs only)
	public void cleanCage() {
		cageMessiness = 0;
		mood += 10;
		health += 10;
	}

	// get thirst method overrides method from organic pet interface
	@Override
	public int getThirst() {
		return thirst;
	}

	// method to decrease health in organic dogs
	public void decreaseHealth() {
		health -= 10;
	}
}