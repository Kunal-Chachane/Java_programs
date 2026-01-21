import java.util.Scanner;

public class Java11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = sc.nextLine();

        int mid = (input.length())/2;
        String firstHalf = input.substring(0,mid);
        String secondHalf = input.substring(mid);

        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);
    }
    
}
