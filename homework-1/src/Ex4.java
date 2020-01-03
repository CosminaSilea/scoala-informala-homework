
//Input 3 numbers, and display the biggest.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the first number.");
        int firstNr = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insert the second number.");
        int secondNr = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Insert the third number.");
        int thirdNr = sc.nextInt();

        int maxNumber = checkMax(firstNr, secondNr,thirdNr);
        System.out.println("The maximum number is " + maxNumber);

    }

    public static int checkMax(int nr1, int nr2, int nr3) {
        int maxNr = 0;
        if ((nr1 > nr2) && (nr1 > nr3)) {
            maxNr = nr1;
        } else {
            if ((nr2 > nr1) && (nr2 > nr3)) {
                maxNr = nr2;
            } else {
                maxNr = nr3;
            }
        }
        return maxNr;
    }
}
