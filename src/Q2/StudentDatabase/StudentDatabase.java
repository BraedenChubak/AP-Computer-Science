package Q2.StudentDatabase;

import java.util.*;

public class StudentDatabase {
    public static int indexofStu(ArrayList<Student> db, int id) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getId() == id) {
                index = lcv;
            }
        }
        return index;
    }

    public static int indexofStu(ArrayList<Student> db, String last) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getLastName().equals(last)) {
                index = lcv;
            }
        }
        return index;
    }

    public static void printStu(Student stu) {
        System.out.printf("%s\t%s\t%d\t%.2f\n", stu.getFirstName(), stu.getLastName(), stu.getId(), stu.getGPA());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<>();

        while (true) {  // for (;;) also works but it's cursed
            System.out.println("\nStudent Menu:\n");
            System.out.println("1 - Add new student");
            System.out.println("2 - Display all students");
            System.out.println("3 - Search for student (by ID)");
            System.out.println("4 - Search for student (by last name)");
            System.out.println("5 - Modify a student's GPA");
            System.out.println("6 - Remove student (by ID)");
            System.out.print("7 - Exit\n\nPlease enter your choice: ");
            int c = input.nextInt();

            if (c == 1) {
                System.out.print("Enter first name: ");
                String first = input.next();
                System.out.print("Enter last name: ");
                String last = input.next();
                System.out.print("Enter ID: ");
                int id = input.nextInt();
                System.out.print("Enter GPA: ");
                double gpa = input.nextDouble();
                Student st = new Student(first, last, id, gpa);
                db.add(st);
            }
            else if (c == 2) {
                System.out.println("First\tLast\tID\tGPA");
                for (Student stu : db) {
                    printStu(stu);
                }
            }
            else if (c == 3) {
                System.out.println("Enter ID: ");
                int id = input.nextInt();
                int index = indexofStu(db, id);
                if (index != -1) {
                    printStu(db.get(index));
                }
                else {
                    System.out.println("No student found");
                }
            }
            else if (c == 4) {
                System.out.println("Enter last name: ");
                String last = input.next();
                int index = indexofStu(db, last);
                if (index != -1) {
                    printStu(db.get(index));
                }
                else {
                    System.out.println("No student found");
                }
            }
            else if (c == 5) {
                System.out.println("Enter ID: ");
                int id = input.nextInt();
                int index = indexofStu(db, id);
                if (index == -1) {
                    System.out.println("No student was found");
                }
                else {
                    System.out.println("Enter the new GPA: ");
                    double gpa = input.nextDouble();
                    db.get(index).setGPA(gpa);
                    System.out.println("GPA updated successfully!");
                }
            }
            else if (c == 6) {
                System.out.println("Enter ID: ");
                int id = input.nextInt();
                int index = indexofStu(db, id);
                if (index == -1) {
                    System.out.println("No student was found");
                }
                else db.remove(index);
            }
            else if (c == 7) {
                return;
            }
        }
    }
}

/*
Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by ID)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by ID)
7 - Exit

Please enter your choice: 1
Enter first name: Jacob
Enter last name: Slinde
Enter ID: 1
Enter GPA: 3.8

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by ID)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by ID)
7 - Exit

Please enter your choice: 1
Enter first name: Braeden
Enter last name: Chubak
Enter ID: 2
Enter GPA: 4.0

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by ID)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by ID)
7 - Exit

Please enter your choice: 4
Enter last name:
Chubak
Braeden	Chubak	2	4.00

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by ID)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by ID)
7 - Exit

Please enter your choice: 3
Enter ID:
1
Jacob	Slinde	1	3.80

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by ID)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by ID)
7 - Exit

Please enter your choice: 5
Enter ID:
1
Enter the new GPA:
3.5
GPA updated successfully!

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by ID)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by ID)
7 - Exit

Please enter your choice: 6
Enter ID:
2

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by ID)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by ID)
7 - Exit

Please enter your choice: 2
First	Last	ID	GPA
Jacob	Slinde	1	3.50

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by ID)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by ID)
7 - Exit

Please enter your choice: 7
 */