package Q2.Prog215i;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215i.txt"));
            ArrayList<Cl215i> cars = new ArrayList<>();
            double average = 0;

            while (input.hasNext()) {
                int ID = input.nextInt();
                double gallons = input.nextDouble();
                double miles = input.nextDouble();
                if (gallons != 0) {
                    Cl215i car = new Cl215i(ID, gallons, miles);
                    car.calc();
                    average += car.getMPG();
                    cars.add(car);
                }
            }
            average /= cars.size();

            for (int lcv = 0; lcv < cars.size(); lcv++) {
                for (int lcv2 = 0; lcv2 < cars.size()-1; lcv2++) {
                    if (cars.get(lcv2).getID() > cars.get(lcv2+1).getID()) {
                        Cl215i temp = cars.get(lcv2);
                        cars.set(lcv2, cars.get(lcv2+1));
                        cars.set(lcv2+1, temp);
                    }
                }
            }

            double minMpg = cars.get(0).getMPG();
            int minID = cars.get(0).getID();
            double maxMpg = cars.get(0).getMPG();
            int maxID = cars.get(0).getID();
            for (int lcv = 0; lcv < cars.size(); lcv++) {
                if (minMpg > cars.get(lcv).getMPG()) {
                    minMpg = cars.get(lcv).getMPG();
                    minID = cars.get(lcv).getID();
                }
                if (maxMpg < cars.get(lcv).getMPG()) {
                    maxMpg = cars.get(lcv).getMPG();
                    maxID = cars.get(lcv).getID();
                }
            }

            System.out.println("Vehicle\tMiles]tGallons\tMPG");
            for (int lcv = 0; lcv < cars.size(); lcv++) {
                System.out.println(cars.get(lcv));
            }
            System.out.println("\nMPG Statistics:");
            System.out.println("Best:\t\t" + maxID);
            System.out.println("Worst:\t\t" + minID);
            System.out.println("Average:\t\t" + average);
            System.out.println("# of Vehicles:\t" + cars.size());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
