package Q1;

public class Prog166f {
    public static void main(String[] args) {
        int num = 99;
        int pairs = 0;
        int total = 0;
        int oddone = 0;
        while (num < 110) {
            num ++;
            if (num % 2 == 1) {
                pairs = num + 1;
                oddone = (num / 2) + 1;
                total = (pairs * (num / 2)) + oddone;
            }
            else {
                pairs = num + 1;
                total = (pairs * (num / 2));
            }
            System.out.println("The sum of the numbers from 1 to " + num + " is " + total);
        }
    }
}

/*
The sum of the numbers from 1 to 100 is 5050
The sum of the numbers from 1 to 101 is 5151
The sum of the numbers from 1 to 102 is 5253
The sum of the numbers from 1 to 103 is 5356
The sum of the numbers from 1 to 104 is 5460
The sum of the numbers from 1 to 105 is 5565
The sum of the numbers from 1 to 106 is 5671
The sum of the numbers from 1 to 107 is 5778
The sum of the numbers from 1 to 108 is 5886
The sum of the numbers from 1 to 109 is 5995
The sum of the numbers from 1 to 110 is 6105
 */