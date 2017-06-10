Cindy's Virtual Pets Amok
There are four types of pets in the Virtual Pet Shelter: 1. Organic dogs 2. Organic cats 3. Robotic dogs 4. Robotic cats.

Virtual Pet Shelter Class:
Contains instance variables and methods that apply to the whole shelter. 
Includes a map of all pets in the shelter. 
Includes methods to maintain and get level of litter box.
Includes method to maintain all robotic pets.
Includes methods to clean all dog cages (organic) and walk all dogs.
Includes methods to intake any type of pet.
Includes methods to feed and water all organic pets.
Includes tick to increase all levels indicating the passage of time.
Includes method to play with one pet.
Includes method to adopt a pet (remove from the map).

Virtual Pet Class (superclass):
Includes instance variable: name, description, health and mood (effect all pets).
Constructor creating Virtual Pet.
Getters for name, health and mood.
Methods for play, tick and generate random.
To string for name and description.

Dog Class (subclass of Virtual Pet):
Creates a dog method referring to the super class (Virtual Pet).
Implements method to walk all dogs.

Cat Class (subclass of Virtual Pet):
Creates a cat method referring to the super class (Virtual Pet).

Organic Cat Class (subclass of Virtual Pet, implements Organic Pet):
Includes instance variables and implements all methods pertaining to organic cats.

Organic Dog Class (subclass of Virtual Pet, implements Organic Pet):
Includes instance variables and implements all methods pertaining to organic dogs.

Robotic Cat Class (subclass of Virtual Pet, implements Robotic Pet):
Includes instance variables and implements all methods pertaining to robotic cats.

Robotic Dog Class (subclass of Virtual Pet, implements Robotic Pet):
Includes instance variables and implements all methods pertaining to robotic dogs.

Organic Pet Interface:
Includes methods that refer only to organic pets.

Robotic Pet Interface:
Includes methods that refer only to robotic pets.

Virtual Pet App:
Adds pets to the shelter (one of each type).
Includes methods to decrease health if the litter box gets too full or the cages get too messy.
Switch case calling each method as the user selects.
Write line method.
# virtual-pets-amok
