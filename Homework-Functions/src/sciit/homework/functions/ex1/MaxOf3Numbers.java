package sciit.homework.functions.ex1;

import java.util.Scanner;

import static sciit.homework.functions.ex1.CalculateMax.getMax;

public class MaxOf3Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the first number");
        int nr1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insert the second number");
        int nr2 = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Insert the third number");
        int nr3 = sc.nextInt();

        double maxOfTwo = getMax(nr1, nr2);

        if (maxOfTwo > nr3) {
            System.out.println("The maximum number is " + maxOfTwo);
        } else {
            System.out.println("The maximum number is " + nr3);
        }
    }
}
