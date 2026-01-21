// table of any n number

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Java12 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, (n * i));
        }
    }
}
