package Q2.LP314;

public class ClLP314 {
    int nyA;
    int nyM;
    int njA;
    int njM;
    int ctA;
    int ctM;
    int totalA;
    int totalM;
    int total;
    double percentA;
    double percentM;

    public ClLP314(int yA, int yM, int jA, int jM, int tA, int tM) {
        nyA = yA;
        nyM = yM;
        njA = jA;
        njM = jM;
        ctA = tA;
        ctM = tM;
        totalA = 0;
        totalM = 0;
        total = 0;
        percentA = 0;
        percentM = 0;
    }

    public void calc() {
        totalA = nyA + njA + ctA;
        totalM = nyM + njM + ctM;
        total = totalA + totalM;
        percentA = 100 * totalA / (double)total;
        percentM = 100 * totalM / (double)total;
    }

    public String toString() {
        return String.format("Candidate\t\tVotes\tPercentage\nAubrey\t\t%d\t%.2f\nMartinez\t%d\t%.2f", totalA, percentA, totalM, percentM);
    }
}
