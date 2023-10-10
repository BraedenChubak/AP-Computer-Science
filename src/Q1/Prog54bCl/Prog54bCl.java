package Q1.Prog54bCl;

import java.util.*;

public class Prog54bCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter num3: ");
        int num3 = input.nextInt();
        System.out.print("Enter num4: ");
        int num4 = input.nextInt();

        Cl54b nice = new Cl54b(num1, num2, num3, num4);
        nice.calc();

        int sum = nice.getSum();
        double avg = nice.getAvg();

        System.out.println("Your sum is: " + sum);
        System.out.println("Your avg is: " + avg);

    }
}

/*
Enter num1: 421
Enter num2: 547
Enter num3: 322
Enter num4: 965
Your sum is: 2255
Your avg is: 563.75
 */