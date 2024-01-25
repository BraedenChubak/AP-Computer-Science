package Q3.Prog702p;

public class Animal implements names {
    private String myname;
    private String favWord;

    public Animal(String name, String word) {
        myname = name;
        favWord = word;
    }

    public String getName() { return myname; }

    public String getWord() { return favWord; }
}
