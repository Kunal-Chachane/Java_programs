import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        int n, i, j, number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            number = 1;

            for (j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}