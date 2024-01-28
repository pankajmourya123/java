package Stack;

import java.util.Scanner;

public class Implementation {

    private static int[] Stack = new int[100];
    private static int top = -1;
 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Show");
            System.out.println("4. Peek");
            System.out.println("5. Exit");
            System.out.print("Choose from the above choices: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    peek();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }

        } while (choice != 5);
    }

    public  static void  push() {
        int val; // Declare a variable to store the value to be pushed

        if (top == Stack.length - 1) {
            System.out.println("Overflow");
        } else {
            Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
            System.out.print("Enter the value: ");
            val = scanner.nextInt(); // Read an integer value from the user
            top = top + 1; // Increment the top index
            Stack[top] = val; // Push the value onto the stack
        }
    }
    public static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            top--; // Decrement the top index to remove the top element
        }
    }
    

    public static void show() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(Stack[i]);
            }
        }
    }
    public static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(Stack[top]);
        }
    }
    
}

