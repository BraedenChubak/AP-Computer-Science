package Q1;

import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter kilowatts used: ");
        int kwh = input.nextInt();

        double basecharge = Math.round((kwh * 0.0475) * 100.0) / 100.0;
        double surcharge = Math.round((basecharge * 0.1) * 100.0) / 100.0;
        double tax = Math.round((basecharge * 0.03) * 100.0) / 100.0;
        double total = Math.round((basecharge + surcharge + tax) * 100.0) / 100.0;
        double latetotal = Math.round((total * 1.04) * 100.0) / 100.0;

        System.out.println();
        System.out.println("Kilowatts used:  " + kwh);
        System.out.println("Base Rate:  " + kwh + " at $0.0475 per kw = $" + basecharge);
        System.out.println("Surcharge (10%):  $" + surcharge);
        System.out.println("City Tax (3%):  $" + tax);
        System.out.println();
        System.out.println("If on time, pay this amount:  $" + total);
        System.out.println("If late, pay this amount:  " + latetotal);
    }
}

/*
Enter kilowatts used: 993

Kilowatts used:  993
Base Rate:  993 at $0.0475 per kw = $47.17
Surcharge (10%):  $4.72
City Tax (3%):  $1.42

If on time, pay this amount:  $53.31
If late, pay this amount:  55.44
 */
