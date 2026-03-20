//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
// The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        int number = scanner.nextInt();
        int squareRoot = findSquareRoot(number);
        System.out.println("The square root of " + number + " is " + squareRoot);
    }


    public static int findSquareRoot(int x) {
        if(x<0){
            System.out.println("Enter a positive integer.");
            return -1;
        }
        long root = 0;
        for(int i = 1; i<=x;i++){
            if(i*i>x){
                break;
            }
            root=i;
        }
        return (int)root;
    }
}
