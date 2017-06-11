package virtualpetamok;

public abstract class Dog extends VirtualPet {

	// superclass constructor
	public Dog(String nameParam, String descriptionParam) {
		super(nameParam, descriptionParam);
	}

	// Method to walk (all dogs)
	public abstract void walk();

}