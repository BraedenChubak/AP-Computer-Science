package Q1.Prog88aCl;

import java.util.*;

public class Prog88aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        Cl88a list = new Cl88a(num1, num2);
        list.calc();
        System.out.println("Sum: " + list.getMysum());
        System.out.println("Diff: " + list.getMydiff());
        System.out.println("Product: " + list.getMyprod());
        System.out.println("Average: " + list.getMyAvg());
        System.out.println("Abs Diff: " + list.getMyabs());
        System.out.println("Max: " + list.getMymax());
        System.out.println("Min: " + list.getMymin());
    }
}

/*
Enter num1: 13
Enter num2: 20
Sum: 33
Diff: -7
Product: 260
Average: 16.5
Abs Diff: 7
Max: 20
Min: 13
 */