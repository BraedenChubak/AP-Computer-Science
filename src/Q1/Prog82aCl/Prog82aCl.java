package Q1.Prog82aCl;

import java.util.*;

public class Prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed limit: ");
        int limit = input.nextInt();
        System.out.print("Enter the car speed: ");
        int speed = input.nextInt();

        Cl82a radar = new Cl82a(limit, speed);
        radar.calc();

        int fine = radar.getFine();
        System.out.println("Fine-----------------$" + fine + ".00");
    }
}
/*
Enter the speed limit: 25
Enter the car speed: 43
Fine-----------------$110.00
 */
