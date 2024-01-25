package Q3.Prog702p;

public class Beeper extends Animal {
    private String extraWord;

    public Beeper(String name, String word, String word2) {
        super(name, word);
        extraWord = word2;
    }

    public String getExtraWord() { return extraWord; }
}
