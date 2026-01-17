import java.util.Scanner;

public class java03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks1:");
        int marks1 = sc.nextInt();
        System.out.println("Enter the marks2:");
        int marks2 = sc.nextInt();
        System.out.println("Enter the marks3:");
        int marks3 = sc.nextInt();

        int total = (marks1 + marks2 + marks3)/3;
        System.out.println("The percentage is: " + total + "%");
        sc.close();

    }
    
}
