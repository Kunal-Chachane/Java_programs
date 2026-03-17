// ATM Machine Project

import java.util.Scanner;

class ATM {
    float bal;
    int pin;

    Scanner sc = new Scanner(System.in);

    public void checkPin() {
        System.out.print("Please enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            menu();  
        } else {
            System.out.println("Incorrect PIN. Try again.");
            checkPin();  
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + bal);
    }

    public void deposit() {
        System.out.print("Enter the amount to deposit: ");
        float amount = sc.nextFloat();
        bal += amount;
        System.out.println("Deposit successful. New balance: " + bal);
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        float amount = sc.nextFloat();

        if (amount > bal) {
            System.out.println("Insufficient funds.");
        } else {
            bal -= amount;
            System.out.println("Withdrawal successful. New balance: " + bal);
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM Machine!");
                    return; 
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

public class ATM_machine_project {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.pin = 1234;
        obj.checkPin();
    }
}