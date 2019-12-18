import java.util.Scanner;
// Check if a number is palindrome (e.g. 1221, 34143).

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a number");
        int nr = sc.nextInt();

        int invNr = invertNumber(nr);

        if (invNr == nr) {
            System.out.println("The number " + nr + " is palindrome");
        } else {
            System.out.println("The number " + nr + " is not palindorme");
        }

    }

    public static int invertNumber(int nr1) {
        int nr2 = nr1;
        int inv = 0;
        while (nr2 != 0) {
            int rest = nr2 % 10;
            inv = inv * 10 + rest;
            nr2 = nr2 / 10;
        }
        return inv;
    }
}
