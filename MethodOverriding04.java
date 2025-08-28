package javapackage;

class Animal {
	// Superclass (Parent class)
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass (Child class) extending Animal
class Dog extends Animal {
    // Overriding the makeSound method
    @Override // Optional but recommended annotation for clarity and compile-time checks
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Subclass (Child class) extending Animal
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Main class to demonstrate method overriding
public class MethodOverriding04 {
    public static void main(String[] args) {
        // Create an object of the superclass
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); // Output: Animal makes a sound.

        // Create an object of the Dog subclass
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks.

        // Create an object of the Cat subclass
        Cat myCat = new Cat();
        myCat.makeSound(); // Output: Cat meows.

        // Demonstrating runtime polymorphism
        Animal polymorphicAnimal1 = new Dog(); // A Dog object referred to by an Animal reference
        polymorphicAnimal1.makeSound(); // Output: Dog barks. (The overridden method is called)

        Animal polymorphicAnimal2 = new Cat(); // A Cat object referred to by an Animal reference
        polymorphicAnimal2.makeSound(); // Output: Cat meows. (The overridden method is called)
    }
}