package Q3;

public class Prog152aRecursive {
    public static int theThing(int num) {
        if (num < 9669) {
            return num + theThing(num+3);
        }
        else { return num; }
    }

    public static void main(String[] args) {
        System.out.println("the sum of multiples of 3 from 3 to 9669 is: " + theThing(3));
    }
}
/*
the sum of multiples of 3 from 3 to 9669 is: 15586428
 */