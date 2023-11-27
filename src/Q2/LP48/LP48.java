package Q2.LP48;

import java.util.Scanner;

public class LP48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        System.out.print("Enter m: ");
        int m = input.nextInt();
        System.out.print("Enter X0: ");
        int x0 = input.nextInt();
        ClLP48 current = new ClLP48(a,c,m,x0);
        for (int lcv = 0; lcv < 10; lcv++) {
            System.out.println(current);
        }
    }
}
/*
Enter a: 1246
Enter c: 200
Enter m: 50
Enter X0: 12
(1246 * 12 + 200)  50 = 2
(1246 * 2 + 200)  50 = 42
(1246 * 42 + 200)  50 = 32
(1246 * 32 + 200)  50 = 22
(1246 * 22 + 200)  50 = 12
(1246 * 12 + 200)  50 = 2
(1246 * 2 + 200)  50 = 42
(1246 * 42 + 200)  50 = 32
(1246 * 32 + 200)  50 = 22
(1246 * 22 + 200)  50 = 12
 */