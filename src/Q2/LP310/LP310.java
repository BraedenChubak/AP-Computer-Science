package Q2.LP310;

import java.util.*;

public class LP310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many burgers? ");
        int b = input.nextInt();
        System.out.print("How many fries? ");
        int f = input.nextInt();
        System.out.print("How many sodas? ");
        int s = input.nextInt();
        System.out.print("How much cash are you giving the cashier? $");
        double t = input.nextDouble();
        ClLP310 cashier = new ClLP310(b,f,s,t);
        cashier.calc();
        cashier.returnstuff();
    }
}

/*
How many burgers? 4
How many fries? 5
How many sodas? 3
How much cash are you giving the cashier? $20
Total before tax: $15.18
Tax: $0.99
Final total: $16.17
Change: $3.83
 */