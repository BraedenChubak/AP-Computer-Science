package Q1;

import java.util.*;

public class LP49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int)Math.floor(Math.random() *(20 - 1 + 1) + 1);
        System.out.print("Pick a number between 1 and 20: ");
        int num = input.nextInt();
        System.out.println("Computer's number: " + random);
        System.out.println("Your number: " + num);
        if (num == random) System.out.println("Good job!");
        else System.out.println("Better luck next time!");
    }
}

/*
Pick a number between 1 and 20: 8
Computer's number: 2
Your number: 8
Better luck next time!
 */