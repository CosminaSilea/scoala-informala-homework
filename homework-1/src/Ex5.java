//Input 2 values:  start  and  finish, then display the numbers from start to finish.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number");
        int nr1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("insert another number");
        int nr2 = sc.nextInt();

        if (nr1 > nr2) {
            int a = nr1;
            nr1 = nr2;
            nr2 = a;
        }

        int numbers = displayNumbersFromNr1toNr2(nr1, nr2);
        System.out.println(numbers);

    }

    public static int displayNumbersFromNr1toNr2(int nr1, int nr2) {
        int nextNr = nr1;
        while (nextNr < nr2) {
            System.out.println(nextNr);
            nextNr = nextNr + 1;
        }
        return nr2;


    }
}