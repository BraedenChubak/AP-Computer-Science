package Q1.Prog93aCl;

import java.util.Scanner;

public class Prog93aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter kwh used: ");
        int kwh = input.nextInt();
        Cl93a electric = new Cl93a(kwh);
        electric.calc();
        System.out.println(electric);
    }
}

/*
Enter kwh used: 993
KWH:  993
Base Rate:  47.167500000000004
Surcharge:  4.71675
CityT:  1.415025
Amount Due:  53.299275
Late Due:  55.431246
 */