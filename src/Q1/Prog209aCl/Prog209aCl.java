package Q1.Prog209aCl;

import Q1.Prog213bCl.Cl213b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209aCl {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215a.txt"));
            int num;
            int totalnums = 0;
            int overnums = 0;
            int undernums = 0;

            while (input.hasNext()) {
                num = input.nextInt();
                Cl209a hooray = new Cl209a(num);
                hooray.calc();
                totalnums += hooray.getTotalnums();
                overnums += hooray.getOvernums();
                undernums += hooray.getUndernums();
            }
            System.out.println("The total # of numbers is: " + totalnums);
            System.out.println("The # of numbers greater than or equal to 500 is: " + overnums);
            System.out.println("The # of numbers less than 500 is: " + undernums);
            }
        catch (IOException e) {
            System.out.println("Can't find data file!");

        }
        }
}
