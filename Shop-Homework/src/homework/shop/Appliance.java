package homework.shop;

public class Appliance extends ElectronicProduct {

    public Appliance(String name, double price, int quantity, String age, int guaranteePeriod) {
        super(name, price, quantity, age, guaranteePeriod);
        super.guaranteePeriod = 6;
    }

    /**
     * @return 105% of the price if the quantity is less than 50, if not return the normal price
     */
    public double getPrice() {

        if (super.getQuantity() < 50)
            return super.getPrice() * 1.05;
        return super.getPrice();

    }
}


