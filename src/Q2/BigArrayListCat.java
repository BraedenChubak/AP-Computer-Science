package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class BigArrayListCat {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            ArrayList<Cat> cats = new ArrayList<Cat>();

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats.add(new Cat(name, weight, age, cost));
            }


//          Print out all the cats (there is no toString() available)

            System.out.println("1. All the cats:");
            System.out.println("Name\tWeight\tAge\tCost");
            for(Cat cat : cats) {
                System.out.printf("%s\t%f\t%d\t%f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
            }

//          Print the name of the 3rd cat.

            System.out.println("\n2. The third cat is named: " + cats.get(2).getName());

//          The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.

            cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight() + 10);
            System.out.println("\n3. The updated weight is: " + cats.get(cats.size()-1).getWeight());

//          The cat named Rascal died. Find that cat and remove it from the list.
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getName().equals("Rascal")) {
                    cats.remove(lcv);
                }
            }

//          A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.
            cats.add(1, new Cat("Angel", 3.6, 1, 25.99));

//          A new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list.
            cats.add(new Cat("Gimpy", 14.3, 10, 29.99));

//          Print the updated list with a for-each loop
            System.out.println("7. All the cats (again):");
            System.out.println("Name\tWeight\tAge\tCost");
            for(Cat cat : cats) {
                System.out.printf("%s\t%f\t%d\t%f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
            }

//          Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.
            Cat third = cats.get(2);
            cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));
            cats.add(third);

//          Switch the 2nd and 4th cats.

            Cat second = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, second);

//          Print the names of the cats on the list.

            System.out.println("7. Every cat's name is: ");
            for(Cat cat : cats) {
                System.out.print(cat.getName() + "\t");
                System.out.println();
            }

//          Remove all cats under $26. Print the costs of each cat remaining on the list.


//          All cats heavier than 15 pounds need to go on a diet <--  no for-each this time.
//          Print the names of the cats being put on a diet.
            System.out.println("\n12. The cats being put on a diet are: ");
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                Cat cat = cats.get(lcv);
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
