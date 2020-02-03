package vehicles;

public class Car extends Vehicles {

    private int fuelTankSize;
    private String fuelType;
    private int gears;
    private Double consumptionPer100Km;
    private float availableFuel;
    private int tireSize;
    private String chassisNumber;

    public Car(int fuelTankSize, String fuelType, int gears, Double consumptionPer100Km, float availableFuel, int tireSize, String chassisNumber) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = availableFuel;
        this.tireSize = tireSize;
        this.chassisNumber = chassisNumber;
    }

    /**
     * method to define the behavior that a car can be driven for N kms in different gears
     *
     * @param gear gear of the car
     * @return the method should return the number of kilometers
     */

    public int shiftGear(int gear) {
        int nrKms = 10;
        return nrKms;

    }

    /**
     * method that calculates the consumption of the car in cruising more
     */
    public void consumptionPer100Km() {

    }

    /**
     * consumption during start stop of the car
     */
    public void consumptionStartStop(){

    }

    /**
     * method that reset the consumption stats on every start
     */
    public void resetConsumptionAfterStart(){

    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getGears() {
        return gears;
    }

    public Double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public int getTireSize() {
        return tireSize;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setAvailableFuel(float availableFuel) {
        this.availableFuel = availableFuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelTankSize=" + fuelTankSize +
                ", fuelType='" + fuelType + '\'' +
                ", gears=" + gears +
                ", consumptionPer100Km=" + consumptionPer100Km +
                ", availableFuel=" + availableFuel +
                ", tireSize=" + tireSize +
                ", chassisNumber='" + chassisNumber + '\'' +
                '}';
    }
}
