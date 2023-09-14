package Q1;

import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pounds: ");
        int pounds = input.nextInt();

        System.out.print("Enter shillings: ");
        int shillings = input.nextInt();

        System.out.print("Enter pence: ");
        int pence = input.nextInt();

        double newpence = ((shillings*12) + pence);
        newpence = newpence / 2.4;
        double newtotal = pounds + (newpence / 100);
        newtotal = Math.round(newtotal * 100.0) / 100.0;

        System.out.println("Your total in the new system is: " + newtotal + " pounds.");

    }
}

/*
Enter pounds: 5
Enter shillings: 2
Enter pence: 8
Your total in the new system is: 5.13 pounds.
 */
