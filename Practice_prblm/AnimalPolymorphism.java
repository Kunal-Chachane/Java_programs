//Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
//Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.

import java.util.*;

class Animal {
    public void Sound() {
        System.out.println("Animal makes a sound");
    }
}

class Bird extends Animal {
    @Override
    public void Sound() {
        System.out.println("Chirp");
    }
}

class Cat extends Animal {
    @Override
    public void Sound() {
        System.out.println("Meow");
    }
}

public class AnimalPolymorphism {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal bird = new Bird();   // Polymorphism
        Animal cat = new Cat();     // Polymorphism

        animal.Sound();  // Animal makes a sound
        bird.Sound();    // Chirp
        cat.Sound();     // Meow
    }
}