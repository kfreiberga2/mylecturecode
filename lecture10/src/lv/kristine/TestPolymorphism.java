package lv.kristine;

import lv.kristine.polymorphism.Animal;
import lv.kristine.polymorphism.Cat;
import lv.kristine.polymorphism.Dog;

public class TestPolymorphism {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();
		
	}

}
