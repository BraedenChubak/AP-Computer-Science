package Q1;

import java.util.*;

public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int length = 1;
        int digit = 0;
        int mult = 10;
        int total = 0;
        while (mult < num) {
            mult *= 10;
            length++;
        }
        for (int lcv = 0; lcv < length; lcv++) {
            mult /= 10;
            digit = num / mult;
            num -= digit * mult;
            total += digit;
        }
        System.out.println("The sum of the digits is: " + total);
    }
}

/*
Enter a positive integer: 839275
The sum of the digits is: 34
 */