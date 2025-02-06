import java.util.Arrays;
import java.util.List;

public class LiskovPrincipleGoodDesign {
    static class Vehicle {
        public int numberOfWheel() {
            return 2;
        }
    }

    static class EngineVehicle extends Vehicle {
        public Boolean hasEngine() {
            return true;
        }
    }
    static class MotorCycle extends EngineVehicle {

    }

    static class Car extends EngineVehicle {
        public int numberOfWheel() {
            return 4;
        }
    }

    static class Bicycle extends Vehicle {

    }

    public static void main(String ...x) {
        /***
         *  Example -1
         */
        System.out.println("Example -1");
        List<Vehicle> vehicleList = Arrays.asList(
                new Car(),
                new MotorCycle(),
                new Bicycle()
        );

        for(Vehicle vehicle: vehicleList) {
            System.out.println(vehicle.numberOfWheel());
        }

        /***
         *  Example -2
         */

        System.out.println("Example -2");
        List<EngineVehicle> engineVehicleList = Arrays.asList(
                new Car(),
                new MotorCycle()
        );

        for(EngineVehicle vehicle: engineVehicleList) {
            System.out.println(vehicle.numberOfWheel()+" "+vehicle.hasEngine());
        }

    }
}
