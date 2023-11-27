package Q2;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BigArray2 {
    public static void printCat(Cat cat) {
        System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            Cat[] cats = new Cat[50];
            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats[lcv] = new Cat(name, weight, age, cost);
            }

            //  Print out all the cats (there is no toString() available)
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv = 0; lcv < numCats; lcv++) {
                printCat(cats[lcv]);
            }

            //  Print the name of the 3rd cat.
            System.out.println("\n2. The Third cat is named: " + cats[2].getName());

            //  The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.
            cats[numCats-1].setWeight(cats[numCats-1].getWeight() + 10);
            System.out.println("3. The updated weight is: " + cats[numCats-1].getWeight());

            //  The cat named Rascal died. Find that cat and remove it from the list.
            int rascalIndex = 0;
            for (int lcv = 0; lcv < numCats; lcv++) {
                if (cats[lcv].getName().equals("Rascal")) {
                    rascalIndex = lcv;
                }
            }
            for (int lcv = rascalIndex; lcv < numCats-1; lcv++) {
                cats[lcv] = cats[lcv+1];
            }
            numCats--;

            //  A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.
            // for (int lcv = numCats + 1; lcv-->1;)
            for (int lcv = numCats; lcv > 1; lcv--) {
                cats[lcv] = cats[lcv-1];
            }
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
            numCats++;

            //  A new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list.
            cats[numCats] = new Cat("Gimpy", 14.3, 10, 29.99);
            numCats++;

            //  Print the updated list with a for-each loop
            System.out.println("\n7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                if (cat != null) {
                    printCat(cat);
                }
            }

            //  Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.
            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;

            //  Switch the 2nd and 4th cats.
            temp = cats[1];
            cats[1] = cats[3];
            cats[3] = temp;

            //  Print the names of the cats on the list.
            System.out.println("\n10. The names of all the cats currently are: ");
            for (Cat cat : cats) {
                if (cat != null) {
                    System.out.print(cat.getName() + "\t");
                }
            }

            //  Remove all cats under $26. Print the costs of each cat remaining on the list.
            int i = 0;
            // for (int i = 0; i < numCats)
            while (i < numCats) {
                if (cats[1].getCost() < 26) {
                    for (int j = i; j < numCats - 1; j++) {
                        cats[j] = cats[j + 1];
                    }
                    numCats--;
                } else {
                    i++;
                }
            }

            System.out.println("\n11. The cats that cost $26 or more cost: ");
            for (int lcv = 0; lcv < numCats; lcv++) {
                System.out.print(cats[lcv].getCost() + "\t");
            }
            System.out.println();

            //  All cats heavier than 15 pounds need to go on a diet <--  no for-each this time.  Print the names of the cats being put on a diet.
            System.out.println("\n12. The cats going on a diet are:");
            for (int lcv = 0; lcv < numCats; lcv++) {
                Cat cat = cats[lcv];
                if (cat.getWeight() > 15) {
                    System.out.print(cat.getName() + "\t");
                }
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
1. All the cats:
Name	Weight	Age	Cost
Inky	15.69	2	35.79
Panda	14.3	6	15.03
Rascal	21.1	21	0.0
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	17.2	10	37.57

2. The Third cat is named: Rascal
3. The updated weight is: 27.2

7. The updated list is:
Name	Weight	Age	Cost
Inky	15.69	2	35.79
Angel	3.6	1	25.99
Panda	14.3	6	15.03
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	27.2	10	37.57
Gimpy	14.3	10	29.99

10. The names of all the cats currently are:
Inky	Blacky	Sugar	Angel	Taffy	Toby	Gimpy	Panda
11. The cats that cost $26 or more cost:
35.79	26.89	33.25	25.99	56.89	37.57	29.99	15.03

12. The cats going on a diet are:
Inky	Sugar	Taffy	Toby
 */
