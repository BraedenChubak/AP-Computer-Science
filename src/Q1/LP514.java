package Q1;

import java.util.*;

public class LP514 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many times do you want to roll the dice? ");
        int rolls = input.nextInt();
        int d1 = 0;
        int d2 = 0;
        int sum = 0;
        System.out.println("Dice 1\tDice 2\tTotal");
        for (int lcv = 0; lcv < rolls; lcv++) {
            d1 = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
            d2 = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
            sum = d1 + d2;
            System.out.println(d1+"\t"+d2+"\t"+sum);
        }
    }
}

/*
How many times do you want to roll the dice? 12
Dice 1	Dice 2	Total
1	6	7
5	6	11
6	5	11
2	5	7
3	3	6
1	6	7
4	4	8
2	1	3
1	1	2
4	4	8
5	2	7
6	4	10
 */