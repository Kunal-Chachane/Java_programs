import java.util.Scanner;

public class java04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no.of subjects:");
        int sub = sc.nextInt();
        double total = 0;
        for(int i = 1; i<=sub; i++){
            System.out.println("Enter the marks for subject" + i + ":");
            int marks = sc.nextInt();
            total += marks;
        }
         total = (total/sub)/10;
        System.out.println("The CGPA is:" + total);
    }
    
}
