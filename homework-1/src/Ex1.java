//Calculate the sum of the first 100 numbers higher than 0.
public class Ex1 {
    public static void main(String[] args) {
        int sumNumbers = sumFirst100Nr();
        System.out.println("The sum is " + sumNumbers);
    }

    public static int sumFirst100Nr() {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}