// Write a Java program to implement a stack with push and pop operations. 
// Find the top element of the stack and check if the stack is empty or not.

import java.util.*;

public class BasicStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        
        while(true){
            System.out.println("\n--- Stack Operations Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();
            sc.nextLine();
            
            switch(n){
                case 1:
                System.out.println("Enter the element to push: ");
                String element = sc.nextLine();
                st.push(element);
                System.out.println("Pushed successfully!");
                break;
                
                case 2:
                    if(st.isEmpty()){
                        System.out.println("Element cannot be popped!");
                    }
                System.out.println("Popped element: " +st.pop());
                break;

                case 3:
                    if (st.isEmpty()) {
                        System.out.println("Stack is empty!");
                    } else {
                     System.out.println("Top element: " + st.peek());
                    }
                    break;

                case 4:
                    if (st.isEmpty()) {
                     System.out.println("Stack is empty.");
                     } else {
                        System.out.println("Stack is NOT empty.");
                    }
                    break;

                case 5: 
                     System.out.println("Exiting...");
                sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}