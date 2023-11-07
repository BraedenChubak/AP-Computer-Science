package Q2.Prog214bArray;

import Q2.Prog213fArray.Cl213f;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214bArray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214b.txt"));

            int empNum = 0;
            double YTD = 0.0;
            double base = 0.0;
            double shift = 0.0;
            double hours = 0.0;

            Cl214b[] list = new Cl214b[100];
            int count = 0;

            while (input.hasNext()) {
                empNum = input.nextInt();
                YTD = input.nextDouble();
                base = input.nextDouble();
                shift = input.nextDouble();
                hours = input.nextDouble();

                Cl214b worker = new Cl214b(empNum, YTD , base, shift, hours);
                list[count] = worker;
                count++;
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
