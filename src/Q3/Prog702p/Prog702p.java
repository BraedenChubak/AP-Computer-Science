package Q3.Prog702p;

import Q3.Prog701g.Admin;
import Q3.Prog701g.Person;
import Q3.Prog701g.Student;
import Q3.Prog701g.Teacher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat"));

            List<Animal> list = new ArrayList<Animal>();

            int num = input.nextInt();
            while (num != 99) {
                String name = input.next();
                String word = input.next();
                if (num == 1) {
                    double fur = input.nextDouble();
                    Animal bob = new Hicca(name, word, fur);
                    list.add(bob);
                }
                else if (num == 2) {
                    int steps = input.nextInt();
                    Animal steve = new Wallie(name, word, steps);
                    list.add(steve);
                }
                else if (num == 3) {
                    String extraWord = input.next();
                    Animal jon = new Beeper(name, word, extraWord);
                    list.add(jon);
                }
                num = input.nextInt();
            }

            double totFur = 0;
            int hiccaCnt = 0;
            int totSteps = 0;
            double avgLength = 0;
            int beeperCnt = 0;

            for (Animal a : list) {
                if (a instanceof Hicca) {
                    totFur += ((Hicca)a).getFur();
                    hiccaCnt++;
                    System.out.println("Hicca's name is: " + a.getName());
                    System.out.println("Its favorite word is: " + a.getWord());
                    System.out.println("Its fur is worth: " + ((Hicca)a).getFur() + '\n');
                }
                if (a instanceof Wallie) {
                    totSteps += ((Wallie)a).getSteps();
                    System.out.println("Wallie's name is: " + a.getName());
                    System.out.println("Its favorite word is: " + a.getWord());
                    System.out.println("It has taken: " + ((Wallie)a).getSteps() + " steps\n");
                }
                if (a instanceof Beeper) {
                    avgLength += ((Beeper)a).getExtraWord().length();
                    beeperCnt++;
                    System.out.println("Beeper's name is: " + a.getName());
                    System.out.println("Its favorite word is: " + a.getWord());
                    System.out.println("Its extra word is: " + ((Beeper)a).getExtraWord());
                }
            }

            String allWords = "";
            for (Animal b : list) {
                if (b instanceof Beeper) {
                    allWords += ((Beeper)b).getExtraWord().toLowerCase();
                }
            }

            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int[] lettercount = new int[26];
            for (int lcv = 0; lcv < lettercount.length; lcv++) {
                lettercount[lcv] = 0;
            }

            for (int lcv = 0; lcv < allWords.length(); lcv++) {
                for (int letter = 0; letter < alphabet.length(); letter++) {
                    if (allWords.substring(lcv,lcv+1).equals(alphabet.substring(letter, letter+1))) {
                        lettercount[letter]++;
                    }
                }
            }






        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
