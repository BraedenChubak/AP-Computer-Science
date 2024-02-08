package Q3.Prog703s;

public class Apple extends Computer {
    private String color;

    public Apple(String n, int num, double v, String c) {
        super(n, num, v);
        color = c;
    }

    public String getColor() { return color; }
}
