package Q1.Prog213fCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fCl {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/prog213f.txt"));
            int kwh;
            double cost;

            while (input.hasNext()) {
                kwh = input.nextInt();
                if (kwh == -999) {
                    break;
                }

                Cl213f elec = new Cl213f(kwh);
                elec.calc();
                cost = (double) Math.round(elec.getCost() * 100.0) / 100.0;
                System.out.println("The cost of " + kwh + " kwh is $" + cost);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The cost of 1338 kwh is $93.66
The cost of 9631 kwh is $521.55
The cost of 13561 kwh is $682.44
 */