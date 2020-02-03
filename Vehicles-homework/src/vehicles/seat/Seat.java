package vehicles.seat;

import vehicles.Car;

public class Seat extends Car {

    public Seat( float availableFuel, int tireSize, String chassisNumber) {
        super(60, "diesel", 6, 5.6, availableFuel, tireSize, chassisNumber);
    }
}
