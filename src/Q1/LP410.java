package Q1;

import java.util.*;

public class LP410 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangular Prism");
        System.out.print("Enter length: ");
        int length = input.nextInt();
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();
        int RecPrismVol = length * width * height;
        System.out.println("The volume is: " + RecPrismVol);

        System.out.println("Sphere");
        System.out.print("Enter radius: ");
        int diam = input.nextInt();
        diam *= 2;
        double pi = 3.14159;
        double SphereVol = (pi * Math.pow(diam, 3) / 6.0);
        System.out.println("The volume is: " + SphereVol);

        System.out.println("Cube");
        System.out.print("Enter length of one side: ");
        int sidelength = input.nextInt();
        int CubeVol = (int)Math.pow(sidelength, 3);
        System.out.println("The volume is: " + CubeVol);
    }
}

/*
Rectangular Prism
Enter length: 3
Enter width: 4
Enter height: 5
The volume is: 60
Sphere
Enter radius: 3
The volume is: 113.09724
Cube:
Enter length of one side: 4
The volume is: 64
 */