package Q1;

import java.util.*;

public class LP55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int length = 1;
        int digit = 0;
        int mult = 10;
        while (mult < num) {
            mult *= 10;
            length++;
        }
        for (int lcv = 0; lcv < length; lcv++) {
            mult /= 10;
            digit = num / mult;
            num -= digit * mult;
            System.out.println(digit);
        }

    }
}

/*
Enter a positive integer: 982753
9
8
2
7
5
3
 */