package sciit.homework.functions.ex5;

import java.util.Arrays;
import java.util.Scanner;

import static sciit.homework.functions.ex4.AverageCalculation.insertNrInArray;

public class DuplicateRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long is the array");
        int arrLength = sc.nextInt();

        int[] arrNumbers = insertNrInArray(arrLength);
        System.out.println(Arrays.toString(arrNumbers));

        Arrays.sort(arrNumbers);


        int[] finalArray = removeDuplicate(arrNumbers);
        System.out.println(Arrays.toString(finalArray));

    }

    public static int[] removeDuplicate(int[] arrayNumbers) {
        int j = 0;
        // I check how many duplicates there are in the array and
        // and I put the value in the variable duplicates
        int duplicates = 0;
        int arrLength = arrayNumbers.length;
        for (int i = 0; i < arrLength - 1; i++) {

            if (arrayNumbers[i] == arrayNumbers[i + 1]) {
                duplicates++;

            }

        }
        int newArrLength = arrLength - duplicates;
        int[] newArray = new int[newArrLength];

        int y = 0;
        int x = 1;
        // i compare every number in the array with the next one to see if it is the same
        // for this to work the array must be sorted
        while (x < arrLength) {
            if (arrayNumbers[y] != arrayNumbers[x]) {
                newArray[j] = arrayNumbers[y];
                j++;
            }
            x++;
            y++;
        }
        // the last value in the old array cannot be compared to the next values so
        // i moved the values from the old array to the new array
        newArray[newArrLength - 1] = arrayNumbers[arrLength - 1];

        return newArray;
    }
}
