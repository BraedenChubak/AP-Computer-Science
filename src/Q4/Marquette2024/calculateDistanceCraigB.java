import java.util.*;

// This is for the "Find the Distance" problem from team Craig B

public class calculateDistanceCraigB {
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return distance;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your x1 value: ");
        int x1 = input.nextInt();
        System.out.print("Enter your y1 value: ");
        int y1 = input.nextInt();
        System.out.print("Enter your x2 value: ");
        int x2 = input.nextInt();
        System.out.print("Enter your y2 value: ");
        int y2 = input.nextInt();
        System.out.println("\nThe distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + calculateDistance(x1, y1, x2, y2));
    }
}
