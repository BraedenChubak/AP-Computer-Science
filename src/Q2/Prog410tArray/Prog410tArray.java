package Q2.Prog410tArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410tArray {
    public static void main(String[] args) {
        try {
            Cl410t[] survey1 = new Cl410t[25];
            int count1 = 0;
            int id = 0;
            int income = 0;
            int members = 0;

            Scanner input = new Scanner(new File("Langdat/survey.dat"));
            while (input.hasNext()) {
                id = input.nextInt();
                income = input.nextInt();
                members = input.nextInt();
                Cl410t fam1 = new Cl410t(id, income, members);
                survey1[count1] = fam1;
                count1++;
            }

            Cl410t[] survey2 = new Cl410t[25];
            int count2 = 0;

            Scanner input2 = new Scanner(new File("Langdat/survey2.dat"));
            while (input2.hasNext()) {
                id = input2.nextInt();
                income = input2.nextInt();
                members = input2.nextInt();
                Cl410t fam2 = new Cl410t(id, income, members);
                survey2[count2] = fam2;
                count2++;
            }

            Cl410t[] totalsurvey = new Cl410t[50];

            int maincount = 0;
            for (int lcv = 0; lcv < count1; lcv++) {
                totalsurvey[lcv] = survey1[lcv];
                maincount++;
            }
            for (int lcv = 0; lcv < count2; lcv++) {
                totalsurvey[maincount] = survey2[lcv];
                maincount++;
            }

            for (int lcv = 0; lcv < maincount; lcv++) {
                for (int lcv2 = 0; lcv2 < maincount-1; lcv2++) {
                    if (totalsurvey[lcv2].getMyID() > totalsurvey[lcv2+1].getMyID()) {
                        Cl410t temp = totalsurvey[lcv2];
                        totalsurvey[lcv2] = totalsurvey[lcv2+1];
                        totalsurvey[lcv2+1] = temp;
                    }
                }
            }

            double averageIncome = 0;
            for (int lcv = 0; lcv < maincount; lcv++) {
                averageIncome += totalsurvey[lcv].getMyIncome();
            }
            averageIncome /= (double)maincount;

            int povertycount = 0;
            for (int lcv = 0; lcv < maincount; lcv++) {
                if (totalsurvey[lcv].getMyIncome() < 3750 + 750 * (totalsurvey[lcv].getMyMembers()-2)) {
                    povertycount++;
                }
            }
            double povertyPercent = povertycount * 100.0 / (double)maincount;

            for (int lcv = 0; lcv < maincount; lcv++) {
                System.out.println(totalsurvey[lcv]);
            }
            System.out.printf("\nHouseholds exceeding an average income of $ %.2f", averageIncome);
            System.out.println();
            for (int lcv = 0; lcv < maincount; lcv++) {
                if (totalsurvey[lcv].getMyIncome() > averageIncome) {
                    System.out.println(totalsurvey[lcv]);
                }
            }
            System.out.printf("\nPercent of households below poverty level = %.2f", povertyPercent);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
1041	12180	4
1062	13240	3
1085	19700	3
1327	19800	2
1483	22458	8
1900	17000	2
2065	19700	2
2112	18125	7
2345	15623	2
2497	12500	2
3097	20000	8
3210	3200	6
3221	10500	4
3323	13000	5
3600	6500	5
3601	11970	2
4423	16400	3
4480	23400	5
4521	18210	4
4725	8900	3
5476	6000	1
5555	15000	2
6217	10000	2
6587	25000	4
6789	8000	2
8901	13000	3
9280	6200	1

Households exceeding an average income of $ 14281.70
1085	19700	3
1327	19800	2
1483	22458	8
1900	17000	2
2065	19700	2
2112	18125	7
2345	15623	2
3097	20000	8
4423	16400	3
4480	23400	5
4521	18210	4
5555	15000	2
6587	25000	4

Percent of households below poverty level = 3.70
 */