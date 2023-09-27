package Q1;

import java.util.*;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner cool = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mytext = cool.nextLine().toLowerCase().trim();
        int unicount = mytext.length();

        for (int lcv = 0; lcv < mytext.length(); lcv++) {
            for (int lcv2 = lcv + 1; lcv2 < mytext.length(); lcv2++) {
                String c = mytext.substring(lcv, lcv+1);
                String c2 = mytext.substring(lcv2, lcv2+1);

                if (c.equals(c2)) {
                    unicount--;
                    mytext = mytext.substring(0,lcv2) + mytext.substring(lcv2+1,mytext.length());
                    lcv = 0;
                }
            }
        }
        System.out.println("the # of unique characters is: " + unicount);
        System.out.println(mytext);
    }
}
