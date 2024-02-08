package Q3.Prog702q;

import Q3.Prog702p.Animal;
import Q3.Prog702p.Beeper;
import Q3.Prog702p.Hicca;
import Q3.Prog702p.Wallie;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog702q.txt"));

            List<Vehicle> list = new ArrayList<Vehicle>();

            while (input.hasNext()) {
                int num = input.nextInt();
                String name = input.next();
                int tires = input.nextInt();
                double value = 50000;
                if (num == 1) {
                    value = input.nextDouble();
                    Vehicle mcqueen = new Vehicle(name, tires, value); // literally nothing extra for cars, no subclass needed
                    list.add(mcqueen);
                }
                else if (num == 2) {
                    int miles = input.nextInt();
                    Vehicle mater = new Truck(name, tires, value, miles);
                    list.add(mater);
                }
                else if (num == 3) {
                    String city = input.next();
                    Vehicle filmore = new Bus(name, tires, value, city);
                    list.add(filmore);
                }
            }

            System.out.println("The total number of vehicles is: " + list.size());
            double totVal = 0;
            double carVal = 0;
            String longCity = "";
            double badTruck = Integer.MAX_VALUE;
            String badTruckName = "";
            int carTires = 0;
            int truckTires = 0;
            int busTires = 0;

            for (Vehicle v : list) {
                totVal += v.getValue();
                if (v instanceof Truck) { // Truck stuff
                    truckTires += v.getTire();
                    if (v.getValue() < badTruck) {
                        badTruck = v.getValue();
                        badTruckName = v.getName();
                    }
                }
                else if (v instanceof Bus) { // Bus stuff
                    busTires += v.getTire();
                    if (((Bus)v).getCity().length() > longCity.length()) {
                        longCity = ((Bus)v).getCity();
                    }
                }
                else { // Car stuff
                    carVal += v.getValue();
                    carTires += v.getTire();
                }
            }

            System.out.println("The total value of cars is: $" + carVal);
            System.out.println("The total value of vehicles is: $" + totVal);
            System.out.println("The longest home city for a bus is: " + longCity);
            System.out.println("The most worthless truck is " + badTruckName + " worth $" + badTruck);
            System.out.println("The total number of car tires is: " + carTires);
            System.out.println("The total number of truck tires is: " + truckTires);
            System.out.println("The total number of bus tires is: " + busTires);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
The total number of vehicles is: 13
The total value of cars is: $33950.0
The total value of vehicles is: $428199.75
The longest home city for a bus is: Minneapolis
The most worthless truck is Fred worth $18750.0
The total number of car tires is: 15
The total number of truck tires is: 95
The total number of bus tires is: 69
 */