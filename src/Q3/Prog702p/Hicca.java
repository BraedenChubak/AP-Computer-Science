package Q3.Prog702p;

public class Hicca extends Animal {
    private double myFur;

    public Hicca(String name, String word, double fur) {
        super(name, word);
        myFur = fur;
    }

    public double getFur() { return myFur; }
}
