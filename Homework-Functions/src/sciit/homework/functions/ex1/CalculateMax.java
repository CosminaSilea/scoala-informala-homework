package sciit.homework.functions.ex1;

public class CalculateMax {
    public static void main(String[] args) {

    }

    public static double getMax(double nr1, double nr2) {
        double maxNr = 0;
        if (nr1 > nr2) {
            maxNr = nr1;
        } else {
            maxNr = nr2;
        }
        return maxNr;
    }
}
