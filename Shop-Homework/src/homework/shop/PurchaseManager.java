package homework.shop;

import static homework.shop.Product.AGE_RESTRICTION_ADULT;
import static homework.shop.Product.AGE_RESTRICTION_TEENAGER;

/**
 * this class contains the processPurchase method that handles purchases
 */
public class PurchaseManager {

    public static void processPurchase(Product product, Customer customer) {
        /**
         * check if the product is in stock
         */
        if (product.getQuantity() < 1) {
            System.out.println("The product is out of stock");
        }
        /**
         * check if the customer has enough money to buy the product
         */
        if (customer.getBalance() < product.getPrice()) {
            System.out.println("You don't have enough money to buy this product");
        }

        /**
         *
         * if the customer has the age under 12 years and the product has as age restriction Teenager
         * the customer will not be able to buy the product
         */
        if (customer.getAge() < 12 && product.getAgeRestriction().equals(AGE_RESTRICTION_TEENAGER)) {
            System.out.println("You are to young too buy this product");
        }

         /**
          *if the customer has the age under 18 year cannot buy products that have the age restriction Adult
         */
        if (customer.getAge() < 18 && product.getAgeRestriction().equals(AGE_RESTRICTION_ADULT)) {
            System.out.println("You are to young too buy this product");

        }

    }
}
