package Q3;

import java.util.Scanner;

public class Prog162aRecursive {
    public static int factLoop(int n) {
        int product = 1;
        for (int lcv = 1; lcv <= n; lcv++) {
            product *= lcv;
        }
        return product;
    }

    public static int factRevLoop(int n) {
        int product = 1;
        for (int lcv = n; lcv > 0; lcv--) {
            product *= lcv;
        }
        return product;
    }

    public static int factorial(int n) {
        if (n <= 1) { return 1; }      // Base/Ending case
        return n * factorial(n-1);  // Recursive case
    }

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keys.nextInt();
        while (num != 0) {
            int fact = factorial(num);
            System.out.println(num + "! = " + fact);
            System.out.print("Enter a number: ");
            num = keys.nextInt();
        }
    }
}
/*
Enter a number: 5
5! = 120
Enter a number: 8
8! = 40320
Enter a number: 2
2! = 2
Enter a number: 7
7! = 5040
Enter a number: 0
 */