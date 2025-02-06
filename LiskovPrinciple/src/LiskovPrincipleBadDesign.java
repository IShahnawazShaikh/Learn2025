import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LiskovPrincipleBadDesign {

    static class MotorCycle extends Vehicle {

    }

    static class Car extends Vehicle {
        @Override
        public int numberOfEngine() {
            return 4;
        }
    }

    static class Bycycle extends Vehicle {
        @Override
        public Boolean hasEngine() {
            return null;  //This code breaks the behavior of the program and narrows down its capability.
        }
    }

    public static void main(String ...x) {
       List<Vehicle> vehicleList = Arrays.asList(
               new Car(),
               new MotorCycle(),
               new Bycycle()
       );

       for(Vehicle vehicle: vehicleList) {
           System.out.println(vehicle.hasEngine().toString());
           // It will throw Null Pointer exception beacuse Bycle has no engine and returning null
       }
    }
}
