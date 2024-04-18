import java.util.*;

// This is for the "Count and Say" problem for team Craig B

public class countAndSayCraigB {
    public static String countAndSay(int n) {
        if (n == 1) { return "1"; }
        String lastn = countAndSay(n-1); // Recursive part of problem
        String curDigit = lastn.substring(0,1);
        int curCount = 1;
        String output = "";
        for (int lcv = 1; lcv < lastn.length(); lcv++) {
            if (lastn.substring(lcv,lcv+1).equals(curDigit)) {
                curCount++;
            } else {
                output += curCount;
                output += curDigit;
                curDigit = lastn.substring(lcv,lcv+1);
                curCount = 1;
            }
        }
        output += curCount;
        output += curDigit;
        return output;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(countAndSay(n));
    }
}