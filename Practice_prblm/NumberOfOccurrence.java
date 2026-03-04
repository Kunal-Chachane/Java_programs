// create a program to find number of occurrences in an array.

import java.util.Scanner;

public class NumberOfOccurrence{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to find occurrences: ");
        int target = scanner.nextInt();

        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("Number of occurrences of " + target + ": " + count);
     scanner.close();
    }
}