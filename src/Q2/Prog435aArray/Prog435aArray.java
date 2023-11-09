package Q2.Prog435aArray;

import Q2.Prog402aArray.Cl402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435aArray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog435a.dat"));

            int type = 0;
            int gate = 0;

            Cl435a[] list = new Cl435a[100];
            int count = 0;

            while (input.hasNext()) {
                type = input.nextInt();
                gate = input.nextInt();
                list[count] = new Cl435a(type, gate);
                count++;
            }

            for (int lcv = 0; lcv < count; lcv++) {
                list[lcv].calc();
            }

            System.out.println("Car Type\tBase Toll\tFactor\tCost");
            for (int lcv = 0; lcv < count; lcv++) {
                System.out.println(list[lcv]);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
Car Type	Base Toll	Factor	Cost
Compact Car  		1.35	1.00	$ 1.35
Small Car  		2.50	1.30	$ 3.25
Mid Size Car  		4.10	1.60	$ 6.56
Full Size Car  		5.50	2.00	$ 11.00
Truck  		2.00	2.40	$ 4.80
16 Wheeler  		3.25	2.70	$ 8.78
Compact Car  		4.80	1.00	$ 4.80
Small Car  		6.00	1.30	$ 7.80
Mid Size Car  		1.35	1.60	$ 2.16
Full Size Car  		2.50	2.00	$ 5.00
Truck  		4.10	2.40	$ 9.84
16 Wheeler  		5.50	2.70	$ 14.85
Compact Car  		6.00	1.00	$ 6.00
Small Car  		1.35	1.30	$ 1.76
Mid Size Car  		2.00	1.60	$ 3.20
Full Size Car  		2.50	2.00	$ 5.00
Truck  		3.25	2.40	$ 7.80
16 Wheeler  		4.10	2.70	$ 11.07
 */