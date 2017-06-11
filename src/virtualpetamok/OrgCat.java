package virtualpetamok;

public class OrgCat extends Cat implements OrganicPet {

	// instance variables unique to organic cats
	protected int hunger;
	protected int thirst;

	// superclass constructor
	public OrgCat(String nameParam, String descriptionParam) {
		super(nameParam, descriptionParam);
		hunger = 50;
		thirst = 50;
	}

	// feed method overrides method from organic pet interface
	@Override
	public void feed() {
		hunger -= 20;
		mood += 10;
	}

	// water method overrides method from organic pet interface
	@Override
	public void water() {
		thirst -= 20;
		mood += 10;
	}

	// get name method overrides method from organic pet interface
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

	// get hunger method overrides method from organic pet interface
	@Override
	public int getHunger() {
		return hunger;
	}

	// get thirst method overrides method from organic pet interface
	@Override
	public int getThirst() {
		return thirst;
	}

	// play method overrides method from Virtual Pet
	@Override
	public void play() {
		mood += 20;
		hunger += 10;
		thirst += 10;
	}

	// method to decrease health in organic cats
	public void decreaseHealth() {
		health -= 10;
	}

	// tick method overrides method from organic pet interface
	@Override
	public int tick() {
		hunger += (5 + generateRandom());
		thirst += (5 + generateRandom());
		mood -= (5 + generateRandom());
		return 5;
	}

	@Override
	public int generateRandom() {
		return generator.nextInt(10);
	}

}