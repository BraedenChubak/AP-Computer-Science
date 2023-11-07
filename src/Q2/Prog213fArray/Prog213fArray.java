package Q2.Prog213fArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fArray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat"));

            Cl213f[] list = new Cl213f[1000];
            int count = 0;

            while (input.hasNext()) {
                int kwh = input.nextInt();

                if (kwh != -999) {
                    Cl213f yikes = new Cl213f(kwh);
                    list[count] = yikes;
                    count++;
                }
            }

            for (int lcv = 0; lcv < count; lcv++) {
                list[lcv].calc();
            }

            for (int lcv = 0; lcv < count; lcv++) {
                System.out.println(list[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
The Cost of 1338 KWH is $93.66
The Cost of 9631 KWH is $521.55
The Cost of 13561 KWH is $682.44
 */