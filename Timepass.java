import java.util.Scanner;

import Linklisted.singally;
public class Timepass {
static int[] stack=new int[100];
int top=-1;

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int choice;
    do{
        System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Show");
            System.out.println("4. Peek");
            System.out.println("5. Exit");
            System.out.print("Choose from the above choices: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    push();
                    break;
            
                default:
                    break;
            }
    }
}

}
