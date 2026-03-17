// Program to print * pattern using method overloading

import java.util.Scanner;
public class Java16 {
    static void star(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of rows for the star pattern:");
        int rows = sc.nextInt();
        star(rows);
    }
}