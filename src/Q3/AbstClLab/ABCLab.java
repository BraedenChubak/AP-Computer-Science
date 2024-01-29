package Q3.AbstClLab;

import java.util.Scanner;

public class ABCLab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        // Circle
        System.out.print("Enter circle radius: ");
        double r = kbd.nextDouble();
        Shape sh1 = new Circle(r);
        // Rectangle
        System.out.print("Enter height: ");
        double rh = kbd.nextDouble();
        System.out.print("Enter width: ");
        double rw = kbd.nextDouble();
        Shape sh2 = new Rectangle(rh, rw);
        // Triangle
        System.out.print("Enter base: ");
        double tb = kbd.nextDouble();
        System.out.print("Enter height: ");
        double th = kbd.nextDouble();
        Shape sh3 = new Triangle(th, tb);

        ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();

        ((Rectangle)sh2).printClass();
        sh2.calculateArea();
        ((Rectangle)sh2).calculatePerimeter();

        ((Triangle)sh3).printClass();
        sh3.calculateArea();
        ((Triangle)sh3).calculatePerimeter();
    }
}

/*
Enter circle radius: 2
Enter height: 3
Enter width: 4
Enter base: 5
Enter height: 6
Circle
Area: 12.566370614359172
Circumference: 12.566370614359172
Rectangle
Area: 12.0
Perimeter: 14.0
Triangle
Area: 15.0
Perimeter: 18.810249675906654
 */