package Q2;

import java.util.*;

public class MSOE20163 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter thickness of the lens: ");
        double d = input.nextDouble();
        System.out.print("Enter radius of the first surface (positive): ");
        double r1 = input.nextDouble();
        System.out.print("Enter radius of the first surface (negative): ");
        double r2 = input.nextDouble();
        System.out.print("Enter refractive index of the material: ");
        double n = input.nextDouble();
        double f = 1 / ((n - 1) * ((1/r1)-1/r2+(d*(n-1)/(n * r1 * r2))));
        System.out.println("The focal length of the lens is " + f);
    }
}

/*
Enter thickness of the lens: 5
Enter radius of the first surface (positive): 4
Enter radius of the first surface (negative): -4
Enter refractive index of the material: 2
The focal length of the lens is 2.909090909090909
 */