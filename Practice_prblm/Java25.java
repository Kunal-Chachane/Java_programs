
import java.util.Scanner;
class Sum {
    int add(int a, int b) {
        return a + b;
    }
}
public class Java25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        Sum sum = new Sum();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum: " + sum.add(num, num2));
    }
}
