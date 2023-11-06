package SPC23;

import java.util.*;

public class tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        double b = input.nextInt();
        double n = input.nextInt();
        double Δx = (b - a) / (double)n;
        double Sum = 0;
        for (int lcv = 0; lcv < n; lcv++) {
            Sum += Math.pow(a + lcv * Δx, 2);
        }
        System.out.println(Math.round(Δx * Sum * 1000) / 1000.0);
    }
}
