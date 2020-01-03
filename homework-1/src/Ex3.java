import java.util.Scanner;
/* Input the dimensions of a rectangle(Length, Width) and display area and perimeter.
Produce an error message if the length or width are negative. */

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the length of the rectangle");
        double length = sc.nextDouble();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Insert the width of the rectangle");
        double width = sc1.nextDouble();

        double area = calculateArea(length, width);
        System.out.println("The area of the rectangle is " + area + ".");

        double perim = calculatePerimeter(length, width);
        System.out.println("The perimeter of the rectangle is " + perim + ".");
    }

    public static double calculateArea(double lengthValue, double widthValue) {
        double area = 0;
        if ((lengthValue < 0) || (widthValue < 0)) {
            System.out.println("Error");
        } else {
            area = lengthValue * widthValue;

        }
        return area;
    }

    public static double calculatePerimeter(double lengthValue, double widthValue) {
        double perimeter = 0;
        if ((lengthValue < 0) || (widthValue < 0)) {
            System.out.println("Error");
        } else {
            perimeter = 2 * (lengthValue + widthValue);
        }
        return perimeter;
    }
}
