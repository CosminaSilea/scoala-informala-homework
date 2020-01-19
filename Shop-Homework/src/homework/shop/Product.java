package homework.shop;

public class Product implements Buyable {

    /**
     * AGE_RESTRICTION_NONE  the product does not have a restriction, any customer can buy it
     * AGE_RESTRICTION_TEENAGER the customer must be at least teenager (above 12 years) to buy the product
     * AGE_RESTRICTION_ADULT only customer with age above 18 can buy the product
     */
    public static final String AGE_RESTRICTION_NONE = "none";
    public static final String AGE_RESTRICTION_TEENAGER = "teenager";
    public static final String AGE_RESTRICTION_ADULT = "adult";


    private String name;
    private double price;
    private int quantity;
    private String ageRestriction;

    /**
     *
     * @param name the name of the product
     * @param price the price of the product
     * @param quantity the product quantities that are in stock
     * @param ageRestriction the age restriction of the product, can be: none, teenager or adult
     */
    public Product(String name, double price, int quantity, String ageRestriction) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.ageRestriction = ageRestriction;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;

    }
}
