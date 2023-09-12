package Q1;

import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first time: ");
        int time1 = input.nextInt();

        System.out.print("Enter second time: ");
        int time2 = input.nextInt();

        int hour1 = time1/100;
        int hour2 = time2/100;
        int hours = hour2 - hour1;

        int min1 = time1 - (hour1*100);
        int min2 = time2 - (hour2*100);

        int mins = min2 - min1;

        System.out.println("The difference between these times is " + hours + " hours and " + mins + " minutes.");

    }
}

/*
Enter first time: 425
Enter second time: 1242
The difference between these times is 8 hours and 17 minutes.
 */
