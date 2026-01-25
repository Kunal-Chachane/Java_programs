// Creating our first java class

package com.company;
class employee{
    int id;
    String name;
    double salary;
}
public class Java19 {
    public static void main(String[] args) {
        employee emp1 = new employee();
        emp1.id = 1;
        emp1.name = "John Doe";
        emp1.salary = 50000;
    System.out.println("Employee ID: " + emp1.id);
    System.out.println("Employee Name: " + emp1.name);
    System.out.println("Employee Salary: " + emp1.salary);
    
    }
}
