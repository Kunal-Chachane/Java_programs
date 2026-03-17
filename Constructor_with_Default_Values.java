//Constructor with Default Values

//Write a Java program to create a class called Car with instance variables make, model, and year.
//Implement a parameterized constructor that initializes these variables and assigns default values if not provided. 
// Print the values of the variables.

class Car {
    String make;
    String model;
    int year;

    // Constructor with default values
   public class Car(String make, String model, int year) {

        if (make == null) {
            this.make = "Unknown Make";
        } else {
            this.make = make;
        }

        if (model == null) {
            this.model = "Unknown Model";
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = 2020;  // default year
        } else {
            this.year = year;
        }
    }

    // Method to print details
    void displayInfo() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println();
    }
}

public class Constructor_with_Default_Values {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car(null, null, 0);

        car1.displayInfo();
        car2.displayInfo();
    }
}