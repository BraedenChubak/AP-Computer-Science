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
Employee Number 1001
Hours 34.50 Rate 4.50 Shift Factor 1.25
	Current			   YTD
Gross Pay  155.25    1056.10
Withholding  18.63
FICA  9.39
Net Pay   127.23
---------------------------
Employee Number 1002
Hours 25.00 Rate 3.25 Shift Factor 1.00
	Current			   YTD
Gross Pay  81.25    3970.00
Withholding  0.00
FICA  4.92
Net Pay   76.33
---------------------------
Employee Number 1003
Hours 30.00 Rate 4.00 Shift Factor 1.00
	Current			   YTD
Gross Pay  120.00    12485.50
Withholding  9.60
FICA  7.26
Net Pay   103.14
---------------------------
Employee Number 1004
Hours 38.50 Rate 5.25 Shift Factor 1.50
	Current			   YTD
Gross Pay  202.13    15587.40
Withholding  30.32
FICA  12.23
Net Pay   159.58
---------------------------
Employee Number 1005
Hours 40.00 Rate 6.25 Shift Factor 1.00
	Current			   YTD
Gross Pay  250.00    17188.50
Withholding  37.50
FICA  8.38
Net Pay   204.12
---------------------------
Employee Number 1006
Hours 48.00 Rate 8.95 Shift Factor 1.50
	Current			   YTD
Gross Pay  429.60    19109.40
Withholding  75.18
FICA  0.00
Net Pay   354.42
---------------------------
Employee Number 1007
Hours 35.00 Rate 5.00 Shift Factor 1.50
	Current			   YTD
Gross Pay  175.00    15600.00
Withholding  21.00
FICA  10.59
Net Pay   143.41
---------------------------

 */