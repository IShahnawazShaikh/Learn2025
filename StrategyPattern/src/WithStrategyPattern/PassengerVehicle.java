package WithStrategyPattern;

import WithStrategyPattern.strategy.NormalStrategy;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle() {
        super(new NormalStrategy());
    }
}
