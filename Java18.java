// program to convert celsius to fahrenheit

import java.util.Scanner;

public class Java18 {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Temperature in celsius: "); 
       double temp = sc.nextDouble();
        double fahrenheit = celsiusToFahrenheit(temp);
        System.out.println("Temperature in fahrenheit: " + fahrenheit + "°F");
    }
}
