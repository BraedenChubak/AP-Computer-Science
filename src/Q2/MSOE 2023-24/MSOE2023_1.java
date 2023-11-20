package Q2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String racer1 = input.nextLine();
        String racer2 = input.nextLine();
        boolean busCrashed = false;
        boolean carCrashed = false;
        boolean busIs1 = false;

        // checking which is bus
        for (int lcv = 0; lcv < racer1.length(); lcv++) {
            if (racer1.substring(lcv,lcv+1).equals("b")) {
                busIs1 = true;
            }
        }

        // checking racer1 for crash
        for (int lcv = 0; lcv < racer1.length(); lcv++) {
            if (busIs1) {
                if (racer1.substring(lcv,lcv+1).equals("s")) {
                    if (lcv != racer1.length()-1) { busCrashed = true; }
                }
            } else {
                if (racer1.substring(lcv,lcv+1).equals("r")) {
                    if (lcv != racer1.length()-1) { carCrashed = true; }
                }
            }
        }

        // checking racer2 for crash
        for (int lcv = 0; lcv < racer2.length(); lcv++) {
            if (busIs1) {
                if (racer2.substring(lcv,lcv+1).equals("r")) {
                    if (lcv != racer2.length()-1) { carCrashed = true; }
                }
            } else {
                if (racer2.substring(lcv,lcv+1).equals("s")) {
                    if (lcv != racer2.length()-1) { busCrashed = true; }
                }
            }
        }

        if (carCrashed && busCrashed) { System.out.println("scratch"); }
        else if (carCrashed && !busCrashed) { System.out.println("bus wins"); }
        else if (!carCrashed && busCrashed) { System.out.println("car wins"); }
        else if (busIs1) {
            if (racer1.length() > racer2.length()) { System.out.println("bus wins"); }
            else if (racer1.length() < racer2.length()) { System.out.println("car wins"); }
            else { System.out.println("tie"); }
        }
        else {
            if (racer1.length() > racer2.length()) { System.out.println("car wins"); }
            else if (racer1.length() < racer2.length()) { System.out.println("bus wins"); }
            else { System.out.println("tie"); }
        }
    }
}