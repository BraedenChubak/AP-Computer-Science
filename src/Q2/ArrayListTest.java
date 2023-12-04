package Q2;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<WrapperType>

        for (int lcv = 0; lcv < 100; lcv++) {
            int rand = (int)(Math.random() * 100) + 1;
            list.add(rand);
        }

        for (int lcv = 0; lcv < list.size(); lcv += 2) {
            System.out.print(list.get(lcv) + " ");
        }
        System.out.println();

        System.out.println("Does list contain 50? " + list.contains(50));
        System.out.println("Index of 50: " + list.indexOf(50));

        list.add(2, 999);
        list.set(0, 123);

        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/*
83 34 26 77 50 2 41 58 94 70 86 80 40 85 63 98 73 53 5 16 78 19 22 39 53 14 80 12 69 39 68 94 29 67 72 95 70 89 45 81 2 20 44 11 74 58 85 74 23 50 
Does list contain 50? true
Index of 50: 8
123 27 999 34 43 26 34 77 69 50 33 2 16 41 3 58 14 94 82 70 99 86 44 80 9 40 27 85 79 63 7 98 79 73 9 53 36 5 67 16 18 78 84 19 93 22 33 39 63 53 54 14 88 80 5 12 31 69 32 39 54 68 65 94 33 29 16 67 50 72 58 95 1 70 67 89 85 45 2 81 11 2 27 20 22 44 45 11 65 74 1 58 57 85 21 74 79 23 99 50 15
*/
