package Q1.Prog209aCl;

public class Cl209a {
    public int totalnums;
    public int currentnum;
    public int overnums;
    public int undernums;

    public Cl209a(int num) {
        totalnums = 0;
        currentnum = num;
        overnums = 0;
        undernums = 0;
    }

    public void calc() {
        totalnums++;
        if (currentnum >= 500) { overnums++; }
        else { undernums++; }
    }

    public int getTotalnums() { return totalnums; }
    public int getOvernums() { return overnums; }
    public int getUndernums() { return undernums; }
}
