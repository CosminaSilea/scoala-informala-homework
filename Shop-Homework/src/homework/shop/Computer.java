

package homework.shop;

public class Computer extends ElectronicProduct {
    /**

     * @param guaranteePeriod for the computers the guarantee period is 24 months
     */
    public Computer(String name, double price, int quantity, String ageRestriction, int guaranteePeriod) {
        super(name, price, quantity, ageRestriction, guaranteePeriod);
        super.guaranteePeriod = 24;
    }

    /**
     *
     * @return the 95% of the price if the quantity is over 1000 and if not return the normal price
     */
    public double getPrice(){
        if(getQuantity() > 10000)
            return super.getPrice() *0.95;
        return super.getPrice();
    }
}
