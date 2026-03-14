import java.util.Scanner;

class num{
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0){
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

}

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        boolean result = num.isPowerOfTwo(n);
        System.out.println(result); // Output: true
    }
}

