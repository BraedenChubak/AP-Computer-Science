package Q1.Prog213eCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213eCl {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/prog213e.txt"));
            int age = 0;
            int total = 0;
            int group1 = 0;
            int group2 = 0;
            int group3 = 0;
            int group4 = 0;
            int group5 = 0;

            while (input.hasNext()) {
                age = input.nextInt();
                Cl213e cl = new Cl213e(age);
                cl.calc();
                total++;
                group1 += cl.getGroup1();
                group2 += cl.getGroup2();
                group3 += cl.getGroup3();
                group4 += cl.getGroup4();
                group5 += cl.getGroup5();
            }
            Cl213e w = new Cl213e(0);
            w.calc2(group1, group2, group3, group4, group5, total);
            double percent1 = w.getPercent1();
            double percent2 = w.getPercent2();
            double percent3 = w.getPercent3();
            double percent4 = w.getPercent4();
            double percent5 = w.getPercent5();
            System.out.println("<20\t\t"+group1+"\t"+percent1);
            System.out.println("20-39\t"+group2+"\t"+percent2);
            System.out.println("40-59\t"+group3+"\t"+percent3);
            System.out.println("60-79\t"+group4+"\t"+percent4);
            System.out.println(">79\t\t"+group5+"\t"+percent5);


        } catch (IOException e) {
            System.out.println("Can't find data file!");
            }
        }
    }
/*
<20		5	21.73913043478261
20-39	5	21.73913043478261
40-59	8	34.78260869565217
60-79	3	13.043478260869565
>79		2	8.695652173913043
 */