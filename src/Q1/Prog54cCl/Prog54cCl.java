package Q1.Prog54cCl;

import java.util.*;

public class Prog54cCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double rad = input.nextDouble();

        Cl54c cool = new Cl54c(rad);
        cool.calc();

        double circum = cool.getCircum();
        double area = cool.getArea();

        System.out.println("The circumference is: " + circum);
        System.out.println("The area is: " + area);
    }
}

/*
Enter radius: 3.712
The circumference is: 23.32316416
The area is: 43.28779268096
 */