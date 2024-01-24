package Q3.Prog701g;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog701g {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat"));
            List<Person> list = new ArrayList<Person>();

            int num = input.nextInt();
            while (num != 99) {
                String f = input.next();
                String l = input.next();
                if (num == 1) {
                    double gpa = input.nextDouble();
                    Person kyle = new Student(f, l, gpa);
                    list.add(kyle);
                }
                else if (num == 2) {
                    int numStu = input.nextInt();
                    Person szelogowski = new Teacher(f, l, numStu);
                    list.add(szelogowski);
                }
                else if (num == 3) {
                    String favWord = input.next();
                    Person bob = new Admin(f, l, favWord);
                    list.add(bob);
                }
                num = input.nextInt();
            }

            double tot = 0;
            double cnt = 0;
            int totstus = 0;
            String large = "";
            String small = "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL";

            for (Person x : list) {
                if (x instanceof Student) {
                    tot += ((Student)x).getGpa();
                    cnt++;
                }
                if (x instanceof Teacher) {
                    totstus += ((Teacher)x).getStudents();
                }
                if (x instanceof Admin) {
                    String word = ((Admin)x).getFavw();
                    if (word.length() > large.length()) {
                        large = word;
                    }
                    if (word.length() < small.length()) {
                        small = word;
                    }
                }
            }

            System.out.printf("Average student GPA: %.2f\n", tot/cnt);
            System.out.println("Total number of students taught by teachers: " + totstus);
            System.out.println("Smallest favorite Admin word: " + small);
            System.out.println("Largest favorite Admin word: " + large);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Average student GPA: 3.06
Total number of students taught by teachers: 316
Smallest favorite Admin word: done
Largest favorite Admin word: coolbeans
 */