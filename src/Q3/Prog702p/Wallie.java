package Q3.Prog702p;

public class Wallie extends Animal {
    private int mySteps;

    public Wallie(String name, String word, int steps) {
        super(name, word);
        mySteps = steps;
    }

    public int getSteps() { return mySteps; }
}
