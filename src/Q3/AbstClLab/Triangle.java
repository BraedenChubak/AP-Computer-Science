package Q3.AbstClLab;

public class Triangle extends NotCircle{
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public void setHeight(double h) { height = h; }
    public void setWidth(double w) { base = w; }
    public double getHeight() { return height; }
    public double getWidth() { return base; }

    public void calculateArea() {
        System.out.println("Area: " + (0.5 * height * base));
    }

    public void calculateCircumference() {
        double hype = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)); // Math.hypot(base, height)
        System.out.println("Perimeter: " + (hype + base + height));
    }

    public void calculatePerimeter() {
        this.calculateCircumference();
    }
}
