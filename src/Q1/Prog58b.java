package Q1;

import java.util.Scanner;

public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        double A = input.nextDouble();
        System.out.print("Enter B: ");
        double B = input.nextDouble();
        System.out.print("Enter C: ");
        double C = input.nextDouble();
        System.out.println();

        double root1 = (-B + Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / (2 * A);
        double root2 = (-B - Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / (2 * A);
        System.out.println("The roots are:");
        System.out.printf("%.3f", root1);
        System.out.println();
        System.out.printf("%.3f", root2);
    }
}

/*
Enter A: 1
Enter B: 5
Enter C: 6

The roots are:
-2.000
-3.000
 */
