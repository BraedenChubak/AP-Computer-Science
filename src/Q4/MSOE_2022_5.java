package Q4;

import java.util.ArrayList;
import java.util.Scanner;

public class MSOE_2022_5 {
    public static void main(String[] args) {
        ArrayList<Integer> shells = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of shells: ");
        int numShells = input.nextInt();
        for (int lcv = 0; lcv < numShells; lcv++) {
            shells.add(input.nextInt());
        }
        ArrayList<Integer> buckets = new ArrayList<>();
        buckets.add(0);
        int count = 1;
        for (int shell : shells) {
            if (buckets.get(count-1) + shell > 100) {
                boolean foundBucket = false;
                for (int lcv = 0; lcv < count; lcv++) {
                    if (buckets.get(lcv) + shell <= 100) {
                        buckets.set(lcv, buckets.get(lcv) + shell);
                        foundBucket = true;
                        break;
                    }
                }
                if (!foundBucket) {
                    buckets.add(shell);
                    count++;
                }
            } else {
                buckets.set(count-1, buckets.get(count-1) + shell);
            }
            for (int bucket : buckets) {
                System.out.print(bucket + " ");
            }
            System.out.println();
        }
        System.out.println("you need " + count + " buckets");
    }
}
