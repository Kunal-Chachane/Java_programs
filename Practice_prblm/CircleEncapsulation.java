// Write a Java program to create a class called Circle with a private instance variable radius.
// Provide public getter and setter methods to access and modify the radius variable.
// Provide two methods called calculateArea() and calculatePerimeter().

class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class CircleEncapsulation {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.setRadius(5);   // setting radius

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());
    }
}