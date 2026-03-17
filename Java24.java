/* Write a Java program to create a class called "Cat" with instance variables name and age. 
Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
*/

class cat{
    String name;
    int age;


    public cat(){
        name = "Unknown";
        age = 0;
    }

    public cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age; 
}
}

public class Java24 {
    public static void main(String[] args) {
        cat myCat = new cat();
        System.out.println("Name: " + myCat.getname());
        System.out.println("Age: " + myCat.getage());
    }
}

