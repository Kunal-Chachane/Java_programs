// Write a Java program to create an outer class called  Computer with an inner class  Processor. 
// The Processor class should have a method "displayDetails()" that prints the details of the  processor (e.g., brand and speed). 
// Create an instance of Processor from the Computer class and call the "displayDetails()" method.

import java.util.Scanner;
public class Java20{
    class Computer {
        class Processor {
            String brand;
            double speed; 

            void displayDetails() {
                Scanner sc =  new Scanner(System.in);
                System.out.print("Enter Processor Brand: ");
                brand = sc.nextLine();
                System.out.print("Enter Processor Speed: ");
                speed = sc.nextDouble();
                System.out.println("Processor Brand: " + brand);
                System.out.println("Processor Speed: " + speed + " GHz");
            }
        }
    }

    public static void main(String[] args) {
        Java20 outer = new Java20();
        Java20.Computer myComp = outer.new Computer();
        Java20.Computer.Processor myProc = myComp.new Processor();
        
        myProc.displayDetails();
    }
}