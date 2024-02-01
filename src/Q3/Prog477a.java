package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog477a.dat"));
            int[] womenGrades = new int[5];
            int[] menGrades = new int[5];
            while (input.hasNext()) {
                int gender = input.nextInt();
                int grade = input.nextInt();
                if (gender == 1) {
                    menGrades[grade-1]++;
                }
                if (gender == 2) {
                    womenGrades[grade-1]++;
                }
            }
            int menTotal = 0;
            int womenTotal = 0;
            for (int lcv = 0; lcv < 5; lcv++) {
                menTotal += menGrades[lcv];
                womenTotal += womenGrades[lcv];
            }
            int trueTotal = menTotal + womenTotal;

            System.out.println("Grade\tMen\tWomen\tTotal");
            System.out.printf("A\t\t%d\t%d\t\t%d\n", menGrades[0], womenGrades[0], menGrades[0]+womenGrades[0]);
            System.out.printf("B\t\t%d\t%d\t\t%d\n", menGrades[1], womenGrades[1], menGrades[1]+womenGrades[1]);
            System.out.printf("C\t\t%d\t%d\t\t%d\n", menGrades[2], womenGrades[2], menGrades[2]+womenGrades[2]);
            System.out.printf("D\t\t%d\t%d\t\t%d\n", menGrades[3], womenGrades[3], menGrades[3]+womenGrades[3]);
            System.out.printf("F\t\t%d\t%d\t\t%d\n", menGrades[4], womenGrades[4], menGrades[4]+womenGrades[4]);
            System.out.println("-----------------------------");
            System.out.printf("Totals\t%d\t%d\t\t%d", menTotal, womenTotal, trueTotal);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Grade	Men	Women	Total
A		2	4		6
B		4	4		8
C		4	7		11
D		2	3		5
F		3	0		3
-----------------------------
Totals	15	18		33
 */