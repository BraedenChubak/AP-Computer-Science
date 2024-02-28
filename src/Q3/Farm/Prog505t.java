package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t"));

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
                for (int lcv = 0; lcv < numcows; lcv++) {
                    int hWeight = input.nextInt();
                    int hHay = input.nextInt();
                    int hCorn = input.nextInt();
                    int rides = input.nextInt();
                    double costRide = input.nextDouble();
                    horses.add(new Horse("☹", hWeight, hCorn, hHay, rides, costRide));
                }
            }

            Farm farm = new Farm(horses, cows, haybales, corncobs, haycost, corncost);
            double income = farm.farmIncome();
            System.out.println("The income of the farm is: $" + income);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
