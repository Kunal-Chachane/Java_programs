// Stone , paper , scissor game
// 0 for Stone
// 1 for Paper
// 2 for Scissors

import java.util.Scanner;
import java.util.Random;

public class Java23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Stone, 1 for Paper, 2 for Scissors: ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: Please enter a valid number.");
            return;
        }
        
        int userChoice = sc.nextInt();
        
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Error: Choice must be 0, 1, or 2.");
            return;
        }

        Random rand = new Random();
        int computerChoice = rand.nextInt(3);

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        
        System.out.println("Computer chose: " + computerChoice);
        sc.close(); 
    }
}
