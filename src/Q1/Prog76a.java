package Q1;

import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a digit you hate: ");
        int num = input.nextInt();

        int num2 = num * 9;
        int num3 = num2 * 12345679;

        System.out.println(num);
        System.out.println("X 9");
        System.out.println("------------");
        System.out.println(num2);
        System.out.println("X 12345679");
        System.out.println("------------");
        System.out.println(num3);
        System.out.println("Surprise!!!");
    }
}

/*
Enter a digit you hate: 6
6
X 9
------------
54
X 12345679
------------
666666666
Surprise!!!
 */