package Q1;

import java.util.*;

public class LP42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight of package (kg): ");
        int kg = input.nextInt();
        System.out.print("Enter length of package (cm): ");
        int ln = input.nextInt();
        System.out.print("Enter width of package (cm): ");
        int wd = input.nextInt();
        System.out.print("Enter height of package (cm): ");
        int ht = input.nextInt();

        boolean toobig;
        if (ln * wd * ht > 100000) toobig = true;
        else toobig = false;
        boolean tooheavy;
        if (kg > 27) tooheavy = true;
        else tooheavy = false;

        if (toobig && !tooheavy) System.out.println("Package too large");
        if (!toobig && tooheavy) System.out.println("Package too heavy");
        if (toobig && tooheavy) System.out.println("Package too large and too heavy");
        else System.out.println("Package okay for shipping!");
    }
}

/*
Enter weight of package (kg): 32
Enter length of package (cm): 59
Enter width of package (cm): 153
Enter height of package (cm): 98
Package too large and too heavy
 */