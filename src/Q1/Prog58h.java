package Q1;

import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The starting amount of money is: $");
        double p = input.nextDouble();  // principal

        System.out.print("The interest rate is: ");
        double r = input.nextDouble();  // interest rate

        System.out.print("How many times does it compound per year? ");
        double n = input.nextDouble();  // compounds per year

        System.out.print("How many days do you want to get interest for? ");
        double t = input.nextDouble();  // time

        double step1 = Math.pow(0.01 * r / n, (n*t/365.0));
        double interest = (1.0 + step1) * p;

        System.out.println(p);
        System.out.println(r);
        System.out.println(n);
        System.out.println(t);
        System.out.printf("The interest earned is: $%.2f\n", interest);
        System.out.printf("The total money saved is: $%.2f\n", interest + p);
    }
}
