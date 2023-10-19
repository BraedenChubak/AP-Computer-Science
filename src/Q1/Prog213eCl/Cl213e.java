package Q1.Prog213eCl;

public class Cl213e {
    private int age;
    private int group1;
    private int group2;
    private int group3;
    private int group4;
    private int group5;
    private int total;
    private double percent1;
    private double percent2;
    private double percent3;
    private double percent4;
    private double percent5;

    public Cl213e(int num) {
        age = num;
        group1 = 0;
        group2 = 0;
        group3 = 0;
        group4 = 0;
        group5 = 0;
        total = 0;
    }

    public void calc() {
        if (age < 20) group1++;
        else if (age < 40) group2++;
        else if (age < 60) group3++;
        else if (age < 80) group4++;
        else group5++;
        total++;
    }

    public void calc2(int g1, int g2, int g3, int g4, int g5, int tot) {
        percent1 = (double)100 * g1 / tot;
        percent2 = (double)100 * g2 / tot;
        percent3 = (double)100 * g3 / tot;
        percent4 = (double)100 * g4 / tot;
        percent5 = (double)100 * g5 / tot;
    }

    public int getGroup1() { return group1; }
    public int getGroup2() { return group2; }
    public int getGroup3() { return group3; }
    public int getGroup4() { return group4; }
    public int getGroup5() { return group5; }
    public int getTotal() { return total; }
    public double getPercent1() { return percent1; }
    public double getPercent2() { return percent2; }
    public double getPercent3() { return percent3; }
    public double getPercent4() { return percent4; }
    public double getPercent5() { return percent5; }
}
