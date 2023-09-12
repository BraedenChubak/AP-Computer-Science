package Q1;

import java.util.*;

public class Prog88a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter number 1-13
        // Enter number 2-20
        // Math.random() * (max - min) + min
        int num1 = (int)(Math.random() * (13-1)) + 1;
        int num2 = (int)(Math.random() * (20-2)) + 2;
        // Sum, difference, product, average, abs. value of difference, max and min
        int sum = num1 + num2;
        int dif = num1 - num2;
        int prod = num1 * num2;
        int abs = Math.abs(dif);
        double avg = (num1 + num2) / 2.0;
        int max, min;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        /*
        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }
         */

        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + dif);
        System.out.println("Product is " + prod);
        System.out.println("Abs. Value of difference is " + abs);
        System.out.println("Average is " + avg);
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);

    }
}

/*
Original numbers are 7 and 9
Sum is 16
Difference is -2
Product is 63
Abs. Value of difference is 2
Average is 8.0
Maximum is 9
Minimum is 7
 */
