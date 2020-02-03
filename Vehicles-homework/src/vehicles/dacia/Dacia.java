package vehicles.dacia;

import vehicles.Car;

public class Dacia extends Car {

    public Dacia( float availableFuel, int tireSize,  String chassisNumber) {
        super(50, "diesel", 6, 6.7, availableFuel, tireSize, chassisNumber);
    }
}

