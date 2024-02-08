package Q3.Prog703s;

public class Linux extends Computer {
    private int code;

    public Linux(String n, int num, double v, int cod) {
        super(n, num, v);
        code = cod;
    }

    public int getCode() { return code; }
}
