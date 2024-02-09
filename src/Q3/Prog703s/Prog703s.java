package Q3.Prog703s;

import Q3.Prog702q.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog703s.txt"));
            List<Computer> list = new ArrayList<Computer>();
            int greenGold = 0;
            int ver7 = 0;
            int code5 = 0;

            while (input.hasNext()) {
                int type = input.nextInt();
                String name = input.next();
                int num = input.nextInt();
                double val = input.nextDouble();
                if (type == 1) {
                    String color = input.next();
                    Computer timCook = new Apple(name, num, val, color);
                    list.add(timCook);
                    if (color.equals("Green") || color.equals("Gold")) { greenGold++; }
                }
                else if (type == 2) {
                    double ver = input.nextDouble();
                    Computer billGates = new Windows(name, num, val, ver);
                    list.add(billGates);
                    if (ver == 7.0) { ver7++; }
                }
                else if (type == 3) {
                    int code = input.nextInt();
                    Computer linusTorvalds = new Linux(name, num, val, code);
                    list.add(linusTorvalds);
                    if (code % 10 == 5) { code5++; }
                }

            }
            System.out.println("The number of Apple computers that are Green or Gold is: " + greenGold);
            System.out.println("The number of Windows computers on version 7.0 is: " + ver7);
            System.out.println("The number of Linux computers with a code that ends in 5 is: " + code5);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The number of Apple computers that are Green or Gold is: 1
The number of Windows computers on version 7.0 is: 2
The number of Linux computers with a code that ends in 5 is: 4
 */