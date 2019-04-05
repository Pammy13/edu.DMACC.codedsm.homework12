package truck;

import static truck.Vehicle.processVehicle;

public class Runner {
    public static void main( String[] args ) {
        processVehicle(new Truck());
    }

    public static void processVehicle(Truck v){
        v.drive(10);
    }
}
