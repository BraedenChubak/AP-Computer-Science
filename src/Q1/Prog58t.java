package Q1;

import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount charged: $");
        double charge = input.nextDouble();

        System.out.print("Enter amount received: $");
        double recieved = input.nextDouble();

        double change = recieved - charge;
        double change2 = change % 1;
        int dollars = (int)change - (int)change2;
        double quarters = change2 % 0.25;
        quarters = (change2 - quarters) * 4;
        change2 -= (quarters/4);
        double dimes = change2 % 0.1;
        dimes = (change2 - dimes) * 10;
        change2 -= (dimes/10);
        double nickels = change2 % 0.05;
        nickels = (change2 - nickels) * 20;
        change2 -= (nickels/20);
        double pennies = change2 * 100;



        System.out.println("Amount due: $" + change);
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + (int)quarters);
        System.out.println("Dimes: " + (int)dimes);
        System.out.println("Nickels: " + (int)nickels);
        System.out.println("Pennies: " + (int)pennies);

    }
}

/*
Enter amount charged: $125.32
Enter amount received: $140
Amount due: $14.680000000000007
Dollars: 14
Quarters: 2
Dimes: 1
Nickels: 1
Pennies: 3
 */
