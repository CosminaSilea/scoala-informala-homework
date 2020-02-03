package homework.shop;

public class ElectronicProduct extends Product {

    public int guaranteePeriod;

    /**
     *
     * @param guaranteePeriod the guarantee period of the product
     */
    public ElectronicProduct(String name, double price, int quantity, String ageRestriction, int guaranteePeriod) {
        super(name, price, quantity, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }


    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}


