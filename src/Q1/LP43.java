package Q1;

import java.util.*;

public class LP43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of eggs bought: ");
        int eggs = input.nextInt();
        int dozen = eggs / 12;
        int extraeggs = eggs - (dozen * 12);
        double ppd = 0;
        double cost = 0;

        if (eggs < 48) {
            ppd = 0.5;
        }
        else if (eggs < 72) {
            ppd = 0.45;
        }
        else if (eggs < 72) {
            ppd = 0.4;
        }
        else if (eggs < 132) {
            ppd = 0.35;
        }
        else ppd = 0.3;

        cost = (dozen * ppd) + (extraeggs * ppd / 12);

        System.out.println("The cost of your eggs is: $" + cost);

    }
}
/*
Enter number of eggs bought: 18
The cost of your eggs is: $0.75
 */