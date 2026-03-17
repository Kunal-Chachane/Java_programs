import java.util.Scanner;

public class Java07{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to encrypt:");
        char Ch = sc.next().charAt(0);
        char En = (char)(Ch + 8);
        System.out.println("The encrypted Character is:" + En );
    }
}