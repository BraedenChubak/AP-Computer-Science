package Q1;

import java.util.*;

public class LP46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int)Math.floor(Math.random() *(10 - 1 + 1) + 1);
        int num2 = (int)Math.floor(Math.random() *(10 - 1 + 1) + 1);
        int op = (int)Math.floor(Math.random() *(4 - 1 + 1) + 1);
        int ans = 0;
        if (op == 1) {
            System.out.print("What is " + num1 + " + " + num2 + "?  ");
            ans = input.nextInt();
            if (ans == num1 + num2) System.out.println("Correct!");
            else System.out.println("Incorrect!");
        }
        else if (op == 2) {
            System.out.print("What is " + num1 + " - " + num2 + "?  ");
            ans = input.nextInt();
            if (ans == num1 - num2) System.out.println("Correct!");
            else System.out.println("Incorrect!");
        }
        else if (op == 3) {
            System.out.print("What is " + num1 + " * " + num2 + "?  ");
            ans = input.nextInt();
            if (ans == num1 * num2) System.out.println("Correct!");
            else System.out.println("Incorrect!");
        }
        else if (op == 4) {
            System.out.print("What is " + num1 + " / " + num2 + "? (Remember to round down!)  ");
            ans = input.nextInt();
            if (ans == num1 / num2) System.out.println("Correct!");
            else System.out.println("Incorrect!");
        }
    }
}
/*
What is 7 - 2?  5
Correct!
 */
