package homework.shop;

import java.text.ParseException;

public class MainClass {
    public static void main(String[] args) throws ParseException {

        Customer ion = new Customer("Ion", 10, 5);


        FoodProduct drink = new FoodProduct("coca-cola", 10, 100, "teenager", "18/01/2020");

        PurchaseManager.processPurchase(drink, ion);
    }
}
