package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<Animal>();

            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cowRows = input.nextInt();
            int cowPens = input.nextInt();

            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int milk = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    Cow wow = new Cow(name, weight, milk, cornEaten, hayEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = input.nextInt();
            int horsePens = input.nextInt();

            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    int rides = input.nextInt();
                    double rideCost = input.nextDouble();
                    Horse boris = new Horse(name, weight, hayEaten, cornEaten, rides, rideCost);
                    animals.add(boris);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            double farmProfit = 0;
            int totalWeight = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                totalWeight += animals.get(lcv).getWeight();
                if (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow)animals.get(lcv);
                    farmProfit += (cow.value(cornCost, hayCost));
                }
                else if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse)animals.get(lcv);
                    farmProfit += (horse.value(cornCost, hayCost));
                }
            }
            System.out.println("The income of the day is $" + farmProfit);
            System.out.println("The total weight of all animals is " + totalWeight + " lbs");

            if (hay >= 0 && corn >= 0) { System.out.println("There is enough food for the day"); }
            else { System.out.println("Your farm does NOT have enough food"); }

            double maxCowValue = Double.MIN_VALUE;
            int maxCowIndex = -1;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow)animals.get(lcv);
                    double cowValue = (cow.value(hayCost, cornCost));
                    if (cowValue > maxCowValue) {
                        maxCowValue = cowValue;
                        maxCowIndex = lcv;
                    }
                }
            }

            System.out.printf("Cow %s makes the least money\n", animals.get(maxCowIndex).getName());

            double minHorseValue = Double.MAX_VALUE;
            int minHorseIndex = -1;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse)animals.get(lcv);
                    double horseValue = (horse.value(hayCost, cornCost));
                    if (horseValue < minHorseValue) {
                        minHorseValue = horseValue;
                        minHorseIndex = lcv;
                    }
                }
            }

            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The income of the day is $191.93
The total weight of all animals is 32790 lbs
There is enough food for the day
Cow Barb makes the least money
Horse MarkMark makes the least money
 */