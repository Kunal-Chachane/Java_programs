import java.util.*;
public class Java15 {
    static void multiplication(int n){
        for(int i=1; i<=10;i++){
            System.out.printf("%d X %d = %d%n", n, i, n*i);
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        multiplication(num);
    }
}
