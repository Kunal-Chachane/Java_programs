// Write a Java program to create a class called Desktop with private instance variables brand, processor, and ramSize. 
// Provide public getter and setter methods to access and modify these variables.
//  Add a method called upgradeRam() that takes an integer value and increases the ramSize by that value.

import java.util.*;

class Desktop {
    private String brand;
    private String processor;
    private int ramSize;

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    // Method to upgrade RAM
    public void upgradeRam(int additionalRam) {
        this.ramSize += additionalRam;
    }
}

// Public class containing the main method
public class ComputerTest {
    public static void main(String[] args) {
        // Creating an object of the Desktop class
        Desktop myDesktop = new Desktop();

        // Using setters to assign values
        myDesktop.setBrand("Dell");
        myDesktop.setProcessor("Intel i7");
        myDesktop.setRamSize(16);

        // Displaying initial values using getters
        System.out.println("--- Desktop Specifications ---");
        System.out.println("Brand: " + myDesktop.getBrand());
        System.out.println("Processor: " + myDesktop.getProcessor());
        System.out.println("RAM Size: " + myDesktop.getRamSize() + " GB");

        // Upgrading the RAM
        System.out.println("\nUpgrading RAM by 8GB...");
        myDesktop.upgradeRam(8);

        // Displaying the updated RAM size
        System.out.println("New RAM Size: " + myDesktop.getRamSize() + " GB");
    }
}
