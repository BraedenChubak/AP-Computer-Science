package Q3.Farm;

import java.util.ArrayList;

public class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public Farm(ArrayList<Horse> horses, ArrayList<Cow> cows, int hay, int corn, double hayCost, double cornCost) {
        myHorses = horses;
        myCows = cows;
        myNumHayBales = hay;
        myNumCorn = corn;
        myHayCost = hayCost;
        myCornCost = cornCost;
    }

    private boolean feedCows() {
        int hayNeeded = 0;
        int cornNeeded = 0;
        for (Cow cow : myCows) {
            hayNeeded += cow.getNumHayBales();
            cornNeeded += cow.getNumCorn();
        }
        if (hayNeeded <= myNumHayBales && cornNeeded <= myNumCorn) {
            myNumHayBales -= hayNeeded;
            myNumCorn -= cornNeeded;
            return true;
        }
        return false;
    }

    private boolean feedHorses() {
        int hayNeeded = 0;
        int cornNeeded = 0;
        for (Horse horse : myHorses) {
            hayNeeded += horse.getNumHayBales();
            cornNeeded += horse.getNumCorn();
        }
        if (hayNeeded <= myNumHayBales && cornNeeded <= myNumCorn) {
            myNumHayBales -= hayNeeded;
            myNumCorn -= cornNeeded;
            return true;
        }
        return false;
    }

    public boolean feedAllAnimals() {
        int hayNeeded = 0;
        int cornNeeded = 0;
        for (Cow cow : myCows) {
            hayNeeded += cow.getNumHayBales();
            cornNeeded += cow.getNumCorn();
        }
        for (Horse horse : myHorses) {
            hayNeeded += horse.getNumHayBales();
            cornNeeded += horse.getNumCorn();
        }
        if (hayNeeded <= myNumHayBales && cornNeeded <= myNumCorn) {
            myNumHayBales -= hayNeeded;
            myNumCorn -= cornNeeded;
            return true;
        }
        return false;
    }

    private double cowIncome(double perPound) {
        int totalmilk = 0;
        for (Cow cow : myCows) {
            totalmilk += cow.getMilk();
        }
        return totalmilk * perPound;
    }

    private double horseIncome() {
        int horseprofit = 0;
        for (Horse horse : myHorses) {
            horseprofit += horse.getRides() * horse.getRideCost();
        }
        return horseprofit;
    }


}

