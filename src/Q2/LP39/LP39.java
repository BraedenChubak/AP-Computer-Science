package Q2.LP39;

import java.util.Scanner;

public class LP39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        int by = input.nextInt();
        System.out.print("Month: ");
        int bm = input.nextInt();
        System.out.print("Day: ");
        int bd = input.nextInt();
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        int ty = input.nextInt();
        System.out.print("Month: ");
        int tm = input.nextInt();
        System.out.print("Day: ");
        int td = input.nextInt();
        ClLP39 sleepy = new ClLP39(by, bm, bd, ty, tm, td);
        sleepy.calc();
        System.out.println("You have been alive for " + sleepy.getDaysAlive() + " days");
        System.out.println("You have slept for " + sleepy.getHoursSlept() + " hours");
    }
}

/*
Enter your birthdate:
Year: 1997
Month: 2
Day: 12
Enter today's date:
Year: 2012
Month: 8
Day: 3
You have been alive for 5646 days
You have slept for 45168 hours
 */