// Program calculates the sum of all numbers from 1 to n using recursion.

import java.util.Scanner;
public class Java17 {
    static int Sum(int n){
        if (n == 0){
            return 0;
        }
        else{
            return n + Sum(n - 1);
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int result = Sum(num);
    System.out.println("The sum of numbers from 1 to " + num + " is: " + result);
}
}