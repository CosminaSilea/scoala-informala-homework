package vehicles;

import vehicles.dacia.Logan;
import vehicles.seat.Leon;

public class MainVehicle {

    public static void main(String[] args) {

        Car car1 = new Logan(20, "322123445");

        Car car2= new Leon(6, "54546434");

        System.out.println(car1);
        System.out.println(car2 );


        car1.start();

        car1.shiftGear(2);
        car1.drive(4);
        car1.drive(10);
        car1.start();

        car1.getAvailableFuel();
        car2.start();
        car2.drive(100);
        car2.shiftGear(3);
        car2.getAvailableFuel();
        car2.stop();



    }
}
