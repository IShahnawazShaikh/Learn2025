package WithStrategyPattern;

import WithStrategyPattern.strategy.SpecialStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SpecialStrategy());
    }
}
