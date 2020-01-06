package sciit.homework.functions.ex2;

import java.util.Scanner;

import static sciit.homework.functions.ex1.CalculateMax.getMax;
import static sciit.homework.functions.ex2.ConvertionFahrenheitToCelsius.convertFahrenheitToCelsius;

public class BodyTemperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your body temperature in Fahrenheit");
        double bodyTempF = sc.nextDouble();

        double bodyTempC = convertFahrenheitToCelsius(bodyTempF);
        System.out.println("Your body temperature in Celsius degree is " + bodyTempC);

        double maxTemp = getMax(bodyTempC, 37);

        if (maxTemp == bodyTempC) {
            System.out.println("You are ill");
        }

    }
}
