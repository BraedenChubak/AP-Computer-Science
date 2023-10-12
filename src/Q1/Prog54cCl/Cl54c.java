package Q1.Prog54cCl;

public class Cl54c {
    private double radius;
    private double pi;
    private double circum;
    private double area;

    public Cl54c (double rad) {
        radius = rad;
        pi = 3.14159;
        circum = 0;
        area = 0;
    }

    public void calc() {
        circum = 2 * radius * pi;
        area = pi * Math.pow(radius, 2);
    }

    public double getCircum() { return circum; }
    public double getArea() { return area; }
}
