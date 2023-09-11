package Q1;

import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14159;
        System.out.print("Enter radius of circle: ");
        double rad = input.nextDouble();
        double circum = Math.round(2 * pi * rad * 1000.0) / 1000.0;
        double area = Math.round(pi * Math.pow(rad, 2) * 1000.0) / 1000.0;

        System.out.println("Circumference of circle: " + circum);
        System.out.println("Area of circle:  " + area);
    }
}

/*
Enter radius of circle: 7.38
Circumference of circle: 46.37
Area of circle:  171.105    
 */
