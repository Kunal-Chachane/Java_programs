//Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
//Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.

import java.util.*;

public class Animal{
    public void Sound(){
        System.out.println("Animal makes a sound");
    }
}

class Bird extends Animal{
    public void Sound(){
        System.out.println("Chirp");
    }
}

class Cat extends Animal{
    public void Sound(){
        System.out.println("Meow");
    }
}

public class Main{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.Sound(); // Output: Animal makes a sound
        bird.Sound();   // Output: Chirp
        cat.Sound();    // Output: Meow
    }
}