package homework.shop;

public class Customer {

    private String name;
    private int age;
    private double balance;

    /**
     *
     * @param name name of the customer
     * @param age the age of the customer
     * @param balance represents the money that the customer has
     */

    public Customer(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    /**
     * I created only getters for the parameters and not setters because these are not values that will not be set externally
     * but they will be define initially in the constructor and then they will remain the same
     */
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }
}



