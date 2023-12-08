package Q2.Prog215h;

public class Cl215h {
    private double s1;
    private double s2;
    private double s3;
    private double s4;
    private double s5;
    private double s6;
    private double s7;
    private double s8;
    private double avg;

    public Cl215h(double score1, double score2, double score3, double score4, double score5, double score6, double score7, double score8) {
        s1 = score1;
        s2 = score2;
        s3 = score3;
        s4 = score4;
        s5 = score5;
        s6 = score6;
        s7 = score7;
        s8 = score8;
        avg = 0;
    }

    public void calc() {
        double[] temp = new double[]{s1, s2, s3, s4, s5, s6, s7, s8};
        double min = s1;
        double max = s1;
        for (int lcv = 0; lcv < temp.length; lcv++) {
            if (min > temp[lcv]) {
                min = temp[lcv];
            }
            if (max < temp[lcv]) {
                max = temp[lcv];
            }
        }
        avg = (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 - min - max) / 6.0;
    }

    public String toString() {
        return String.format("%.1f %.1f %.1f %.1f %.1f %.1f %.1f %.1f = %.2f", s1, s2, s3, s4, s5, s6, s7, s8, avg);
    }
}