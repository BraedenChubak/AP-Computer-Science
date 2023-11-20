import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String directions = input.nextLine();
        String[] splitDirections = directions.split(", ");
        String[] splitDirectionDistance = new String[2];  // one for distance one for direction
        String currentDirection = "";
        double stepsNorth = 0;
        double stepsEast = 0;
        double minNorth = 0;
        double minEast = 0;
        double maxNorth = 0;
        double maxEast = 0;
        for (int lcv = 0; lcv < splitDirections.length-1; lcv++) {
            currentDirection = splitDirections[lcv];
            if (Character.isLetter(currentDirection.charAt(currentDirection.length()-2))) {
                splitDirectionDistance[0] = currentDirection.substring(0, currentDirection.length()-2);
                splitDirectionDistance[1] = currentDirection.substring(currentDirection.length()-2);
            }
            else {
                splitDirectionDistance[0] = currentDirection.substring(0, currentDirection.length()-1);
                splitDirectionDistance[1] = currentDirection.substring(currentDirection.length()-1);
            }
            splitDirectionDistance[1] = splitDirectionDistance[1].toUpperCase();
            if (splitDirectionDistance[1].equals("N")) {
                stepsNorth += Integer.valueOf(splitDirectionDistance[0]);
            }
            if (splitDirectionDistance[1].equals("E")) {
                stepsEast += Integer.valueOf(splitDirectionDistance[0]);
            }
            if (splitDirectionDistance[1].equals("S")) {
                stepsNorth -= Integer.valueOf(splitDirectionDistance[0]);
            }
            if (splitDirectionDistance[1].equals("W")) {
                stepsEast -= Integer.valueOf(splitDirectionDistance[0]);
            }
            if (splitDirectionDistance[1].equals("NE")) {
                double temp = 0;
                temp = Math.sqrt(Math.pow(Integer.valueOf(splitDirectionDistance[0]), 2) / 2);
                stepsNorth += temp;
                stepsEast += temp;
            }
            if (splitDirectionDistance[1].equals("SE")) {
                double temp = 0;
                temp = Math.sqrt(Math.pow(Integer.valueOf(splitDirectionDistance[0]), 2) / 2);
                stepsNorth -= temp;
                stepsEast += temp;
            }
            if (splitDirectionDistance[1].equals("NW")) {
                double temp = 0;
                temp = Math.sqrt(Math.pow(Integer.valueOf(splitDirectionDistance[0]), 2) / 2);
                stepsNorth += temp;
                stepsEast -= temp;
            }
            if (splitDirectionDistance[1].equals("SW")) {
                double temp = 0;
                temp = Math.sqrt(Math.pow(Integer.valueOf(splitDirectionDistance[0]), 2) / 2);
                stepsNorth -= temp;
                stepsEast -= temp;
            }
        }
        minNorth = 0.62 * stepsNorth;
        maxNorth = 0.68 * stepsNorth;
        minEast = 0.62 * stepsEast;
        maxEast = 0.68 * stepsEast;
        System.out.printf("Dig in the area (%.2f N, %.2f E) to (%.2f N, %.2f E)", minNorth, minEast, maxNorth, maxEast);
    }
}