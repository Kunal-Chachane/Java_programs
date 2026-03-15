import java.util.Scanner;

public class TribonacciSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 1;

        System.out.println("Tribonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm + thirdTerm;

            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = nextTerm;
        }

        scanner.close();
    }
}