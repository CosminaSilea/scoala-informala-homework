package homework.shop;


public class FoodProduct extends Product implements Expirable {

    public String expirationDate;

    /**
     * @param expirationDate the expiration date of the food product, the date of the expiration
     *                       must have the format dd/MM/yyyy
     *
     */
    public FoodProduct(String name, double price, int quantity, String ageRestriction, String expirationDate) {
        super(name, price, quantity, ageRestriction);
        this.expirationDate = expirationDate;
    }

  /*
    public double getPriceExpireIn15day(String expirationDate) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Date expDateFormat = sdf1.parse(expirationDate);

        DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // I don't know how to add 15 days to the expiration day. I wanted to add 15 to the expiration day
        // to check if it is equal to the current day and if it equal it means that the product will expired in 15 day
        // and to return 70% of the price.

        if (expDateFormat.equals(currentDate){
            return super.getPrice() * 0.7;
        }
        return getPrice();

    }
    */

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
