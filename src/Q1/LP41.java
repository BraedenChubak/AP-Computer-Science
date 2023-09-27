package Q1;

import java.util.*;

public class LP41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of copies printed: ");
        int copies = input.nextInt();
        double ppc = 0;
        double price = 0;

        if (copies <= 99) ppc = 0.3;
        else if (copies <= 499) ppc = 0.28;
        else if (copies <= 749) ppc = 0.27;
        else if (copies <= 1000) ppc = 0.26;
        else ppc = 0.25;

        price = ppc * copies;
        System.out.println("The price per copy is: $" + ppc);
        System.out.print("The total price is: $" + price);
    }
}

/*
Enter amount of copies printed: 1001
The price per copy is: $0.25
The total price is: $250.25
 */