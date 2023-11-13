package Q2;

import java.util.*;

public class MSOE20162 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side length A: ");
        double sideA = input.nextDouble();
        System.out.println("Enter side length C: ");
        double sideC = input.nextDouble();
        System.out.println("Enter angle measure A (in degrees): ");
        double angleA = input.nextDouble();
        double angleC = Math.asin(Math.sin(angleA)*sideC/sideA);
        double angleC2 = 180 - angleC;
        System.out.print(angleC + " degrees");
        if (angleA + angleC2 < 180) { System.out.println("and " + angleC2 + " degrees"); }
    }
}
