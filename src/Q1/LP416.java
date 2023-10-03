package Q1;

import java.util.*;
import java.lang.Math;

public class LP416 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double degrees = input.nextDouble();
        double pi = 3.1415926;
        double radians = degrees * pi / 180;
        double sin = Math.round((Math.sin(radians)) * 1000.0) / 1000.0;
        double cos = Math.round((Math.cos(radians)) * 1000.0) / 1000.0;
        double tan = Math.round((Math.tan(radians)) * 1000.0) / 1000.0;
        System.out.println("Sine: " + sin);
        System.out.println("Cosine: " + cos);
        System.out.println("Tangent: " + tan);
    }
}

/*
Enter angle in degrees: 30
Sine: 0.5
Cosine: 0.866
Tangent: 0.577
 */