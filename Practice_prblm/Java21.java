// Write a Java program to create an outer class called Java21 with a static nested class Department. 
// The Department class should have a method "displayInfo()" that prints the department name and the number of faculty members. 
// Instantiate the Department class from the main method and call the "displayInfo()" method.

import java.util.Scanner;

public class Java21{
    public class Department{
        String deptName;
        int facultyCount;

        void displayInfo() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Department Name: ");
            deptName = sc.nextLine();
            System.out.print("Enter Number of Faculty Members: ");
            facultyCount = sc.nextInt();
            System.out.println("Department Name: " + deptName);
            System.out.println("Number of Faculty Members: " + facultyCount);
        }
    }

    public static void main(String[] args) {
        Java21 outer = new Java21();
        Java21.Department dept = outer.new Department();
        dept.displayInfo();
    }
}