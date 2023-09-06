package Q1;

import java.util.Scanner;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter num1: ");
        int num1 = input.nextInt();

        System.out.print("Please enter num2: ");
        int num2 = input.nextInt();

        System.out.print("Please enter num3: ");
        int num3 = input.nextInt();

        System.out.print("Please enter num4: ");
        int num4 = input.nextInt();
        System.out.println();

        int sum = num1 + num2 + num3 + num4;
        double avg = sum / 4.0;

        System.out.println("The sum of the four numbers is: " + sum);
        System.out.println("The average of the four numbers is: " + avg);
    }
}
/*
Please enter num1: 5
Please enter num2: 6
Please enter num3: 7
Please enter num4: 8

The sum of the four numbers is: 26
The average of the four numbers is: 6.5
 */
