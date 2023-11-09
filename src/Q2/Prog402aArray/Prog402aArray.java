package Q2.Prog402aArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402aArray {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prg402a.dat"));

            int ID = 0;
            int score = 0;
            double avg = 0;

            Cl402a[] list = new Cl402a[100];
            int count = 0;

            while (input.hasNext()) {
                ID = input.nextInt();
                score = input.nextInt();
                avg += score;
                list[count] = new Cl402a(ID, score, 0);
                count++;
            }

            avg = avg / (double)count;

            for (int lcv = 0; lcv < count; lcv++) {
                list[lcv] = new Cl402a(list[lcv].getMyID(), list[lcv].getMyScore(), avg);
            }

            for (int lcv = 0; lcv < count; lcv++) {
                list[lcv].calc();
            }

            System.out.println("ID     Score     Diff");
            for (int lcv = 0; lcv < count; lcv++) {
                System.out.println(list[lcv]);
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
ID     Score     Diff
115     257     14.38
123     253     10.38
116     246     3.38
113     243     0.38
112     239     -3.62
104     239     -3.62
110     238     -4.62
218     243     0.38
208     242     -0.62
222     223     -19.62
223     230     -12.62
213     229     -13.62
207     228     -14.62
203     224     -18.62
305     265     22.38
306     262     19.38
311     256     13.38
325     246     3.38
321     245     2.38
323     245     2.38
301     242     -0.62
 */
