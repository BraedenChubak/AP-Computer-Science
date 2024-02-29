package Q3.Prog295c;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog295c {
    public static void main(String[] args) {
        try {
            Scanner input1 = new Scanner(new File("Langdat/merge1.dat"));
            Scanner input2 = new Scanner(new File("Langdat/merge2.dat"));
            String ss1 = input1.next();
            String temp1 = input1.next();
            String tc1 = temp1.substring(0,1);
            String cc1 = temp1.substring(1,2);
            int dc1 = Integer.parseInt(temp1.substring(2,3));

            String ss2 = input2.next();
            String temp2 = input2.next();
            String tc2 = temp2.substring(0,1);
            String cc2 = temp2.substring(1,2);
            int dc2 = Integer.parseInt(temp2.substring(2,3));

            System.out.println("Social #\tClass\tType\tDept");
            while (input1.hasNext() || input2.hasNext()) {
                if (ss1.compareTo(ss2) < 0) {
                    System.out.println(ss1 + "\t" + cc1 + "\t\t" + tc1 + "\t\t" + dc1);
                    if (input1.hasNext()) {
                        ss1 = input1.next();
                        temp1 = input1.next();
                        tc1 = temp1.substring(0, 1);
                        cc1 = temp1.substring(1, 2);
                        dc1 = Integer.parseInt(temp1.substring(2, 3));
                    }
                    else { ss1 = "999999999999999999999999999999999999"; }
                }
                else if (ss1.compareTo(ss2) > 0) {
                    System.out.println(ss2 + "\t" + cc2 + "\t\t" + tc2 + "\t\t" + dc2);
                    if (input2.hasNext()) {
                        ss2 = input2.next();
                        temp2 = input2.next();
                        tc2 = temp2.substring(0, 1);
                        cc2 = temp2.substring(1, 2);
                        dc2 = Integer.parseInt(temp2.substring(2, 3));
                    }
                    else { ss2 = "999999999999999999999999999999999999"; }
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Social #	Class	Type	Dept
000-00-0001	B		A		1
111-11-1111	B		A		1
123-45-6789	F		C		5
222-22-2227	L		D		9
321-01-2345	B		A		1
357-86-4219	F		C		5
411-52-9485	L		D		9
432-23-3489	B		A		1
514-98-1234	B		A		1
514-98-5555	F		C		5
521-96-8743	F		C		5
522-77-8765	F		C		5
522-77-8766	F		C		5
522-77-8767	F		C		5
525-25-2525	B		A		1
531-45-9260	F		C		5
538-11-1234	L		D		9
539-12-1235	L		D		9
540-13-1236	L		D		9
 */