package Q1;
import java.util.*;

public class Prog54a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the car model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter miles driven: ");
        int miles = keyboard.nextInt();

        System.out.print("Enter gallons used: ");
        int gallons = keyboard.nextInt();

        double mpg = miles / (double)gallons;
        System.out.println("MPG used by " + model + " is " + mpg + " m/g");
    }
}

/*
Enter the car model: Ford Focus
Enter miles driven: 376
Enter gallons used: 19
MPG used by Ford Focus is 19.789473684210527 m/g
 */
