package Q1;
import java.util.*;

public class Prog52aInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length: ");
        int length = input.nextInt();
        System.out.println();

        System.out.print("Please enter width: ");
        int width = input.nextInt();
        System.out.println();

        int area = length * width;
        int perim = 2 * length + 2 * width;

        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perim);
    }
}

/*
Please enter length: 143

Please enter width: 82

Area is: 11726
Perimeter is: 450
 */