package Q1;

import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int limit = input.nextInt();

        System.out.print("Enter the vehicle speed: ");
        int speed = input.nextInt();

        int fine = 20 + ((speed-limit) * 5);

        System.out.println("The fine is: $" + fine + ".00");
    }
}

/*
Enter the speed limit: 30
Enter the vehicle speed: 44
The fine is: $90.00
 */