package Q2.Prog214c;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214c.dat"));
            ArrayList<Cl214c> customers = new ArrayList<>();

            while (input.hasNext()) {
                String grade = input.next();
                double gallons = input.nextDouble();
                String wash = input.next();
                Cl214c current = new Cl214c(grade, gallons, wash);
                customers.add(current);
            }

            for (int lcv = 0; lcv < customers.size(); lcv++) {
                customers.get(lcv).calc();
                System.out.println(customers.get(lcv));
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
15.0 P gallons:	$22.19
Car Wash? false:	$0.00
Total:	$22.19

21.4 R gallons:	$29.08
Car Wash? true:	$0.00
Total:	$29.08

7.5 H gallons:	$10.72
Car Wash? true:	$2.00
Total:	$12.72

17.9 R gallons:	$24.33
Car Wash? true:	$0.60
Total:	$24.93
 */