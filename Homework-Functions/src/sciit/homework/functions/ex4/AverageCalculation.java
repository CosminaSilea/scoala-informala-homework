package sciit.homework.functions.ex4;

import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How long is the array");
        int arrLength = sc.nextInt();

        int[] numbersArr = insertNrInArray(arrLength);
        int average = calculateAverage(numbersArr);
        System.out.println("The average is " + average);
    }


    public static int[] insertNrInArray(int arrayLength) {
        int[] arrNumbers = new int[arrayLength];
        int i = 0;

        for (i = 0; i < arrayLength; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert a number in the array");
            arrNumbers[i] = sc.nextInt();

        }
        return arrNumbers;
    }

    public static int calculateAverage(int[] arrNumbers) {
        int sum = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            sum = sum + arrNumbers[i];
        }
        int averageVal = sum / arrNumbers.length;
        return averageVal;
    }

}
