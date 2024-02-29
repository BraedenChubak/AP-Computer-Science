package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat"));

            int haybales = input.nextInt();
            double haycost = input.nextDouble();
            int corncobs = input.nextInt();
            double corncost = input.nextDouble();
            int numcows = input.nextInt();
            ArrayList<Cow> cows = new ArrayList<>();
            ArrayList<Horse> horses = new ArrayList<Horse>();

            while (input.hasNext()) {
                for (int lcv = 0; lcv < numcows; lcv++) {
                    int cWeight = input.nextInt();
                    int milk = input.nextInt();
                    int cHay = input.nextInt();
                    int cCorn = input.nextInt();
                    cows.add(new Cow("Cowow", cWeight, milk, cCorn, cHay));
                }

                int numhorses = input.nextInt();
                for (int lcv = 0; lcv < numhorses; lcv++) {
                    int hWeight = input.nextInt();
                    int hHay = input.nextInt();
                    int hCorn = input.nextInt();
                    int rides = input.nextInt();
                    double costRide = input.nextDouble();
                    horses.add(new Horse("☹", hWeight, hCorn, hHay, rides, costRide));
                }
            }
//          The program should report the income of the day,
            Farm farm = new Farm(horses, cows, haybales, corncobs, haycost, corncost);
            double income = farm.farmIncome();
            System.out.println("The income of the farm is: $" + income);

//          Report the cost of feeding the animals for a day
            farm.feedAllAnimals();
            int corncobs2 = farm.getMyNumCorn();
            int haybales2 = farm.getMyNumCorn();
            double foodcost = ((corncobs - corncobs2) * corncost) + ((haybales - haybales2) * haycost);
            System.out.println("The cost of feeding the animals for a day is: $" + foodcost);

//          It should determine if there is enough food to feed all the animals, if so, feed all the animals and report how many bales of hay and cobs of corn are left in the barn.  If there is not enough food for ALL the animals, none of the animals get fed ☹ - report that there is insufficient food to feed the animals and request an immediate shipment of hay and corn for the amount of needed of each.
            if (corncobs2 < 0 || haybales2 < 0) {
                if (0 > haybales2 && 0 > corncobs2) { System.out.println("There isn't enough corn OR hay to feed the animals, you need to order " + (-1 * corncobs2) + " corn cobs and " + (haybales2 - haybales) + " hay bales!"); }
                else if (0 > haybales2) { System.out.println("There is not enough hay to feed the animals, you need to order " + (-1 * haybales2) + " hay bales!"); }
                else { System.out.println("There is not enough corn to feed the animals, you need to order " + (-1 * corncobs2) + " corn cobs!"); }
            }
            else System.out.println("There's enough food to feed the animals!");

//          report the cumulative weight of all animals.
            System.out.println("The total weight of all animals is: " + farm.getWeight() + " pounds!");

//          Sell off the 3 cows that generate the lowest amount of milk.
            for (int lcv = 0; lcv < 3; lcv++) {
                Cow lowestCow = cows.get(0);
                for (int lcv2 = 0; lcv < cows.size(); lcv++) {
                    double lowestMilk = Integer.MAX_VALUE;
                    if (cows.get(lcv2).getMilk() < lowestMilk) {
                        lowestCow = cows.get(lcv2);
                        lowestMilk = lowestCow.getMilk();
                    }
                }
                System.out.println("Sold off 3 cows!");
                cows.remove(lowestCow);
            }

//          Sell off the two horses that generate the lowest amount of ride income.
            for (int lcv = 0; lcv < 2; lcv++) {
                Horse lowestHorse = horses.get(0);
                for (int lcv2 = 0; lcv < horses.size(); lcv++) {
                    double lowestRides = Integer.MAX_VALUE;
                    if (horses.get(lcv2).getRides() * horses.get(lcv2).getRideCost() < lowestRides) {
                        lowestHorse = horses.get(lcv2);
                        lowestRides = lowestHorse.getRides();
                    }
                }
                System.out.println("Sold off 2 horses!");
                cows.remove(lowestHorse);
            }
//          Change the first cow.   The cow has a weight of 1250, followed by 80 pounds of milk produced per day, followed by the number of 3 hay bales eaten each day, followed by 4 corncobs eaten each day.
            cows.set(1, new Cow("Cowow", 1250, 80, 3, 4));

//          Report the total number of cows and horses on the farm.
            System.out.println("There are " + cows.size() + " cows and " + horses.size() + " horses on the farm!");

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
