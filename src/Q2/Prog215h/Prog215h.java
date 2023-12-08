package Q2.Prog215h;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215h.txt"));
            ArrayList<Cl215h> judges = new ArrayList<Cl215h>();
            while (input.hasNext()) {
                double s1 = input.nextDouble();
                double s2 = input.nextDouble();
                double s3 = input.nextDouble();
                double s4 = input.nextDouble();
                double s5 = input.nextDouble();
                double s6 = input.nextDouble();
                double s7 = input.nextDouble();
                double s8 = input.nextDouble();
                Cl215h athlete = new Cl215h(s1, s2, s3, s4, s5, s6, s7, s8);
                judges.add(athlete);
            }
            for (int lcv = 0; lcv < judges.size(); lcv++) {
                judges.get(lcv).calc();
                System.out.println(judges.get(lcv));
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
8.4 9.1 8.5 8.4 9.1 8.7 8.8 9.1 = 8.77
7.0 7.0 7.0 7.0 7.0 7.0 7.0 7.0 = 7.00
8.0 7.9 8.0 8.0 8.0 8.0 8.0 8.1 = 8.00
6.1 7.1 8.1 8.1 8.2 8.2 7.2 6.2 = 7.48
7.2 7.7 7.8 8.8 7.5 6.3 9.2 7.3 = 7.72
6.8 6.9 7.3 8.8 6.7 7.7 7.9 6.3 = 7.22
 */