package main;

public class MainClass {
    public static void main(String[] args) {

        Calculator calculator1 = new Calculator(7,9,10);

       System.out.println("The maximum number is " + calculator1.getMax());
       System.out.println("The minimum number is " + calculator1.getMin());
        System.out.println("Is A positive " + calculator1.isAPositive());

        System.out.println("The average is" + calculator1.getAverage());



    }
}
