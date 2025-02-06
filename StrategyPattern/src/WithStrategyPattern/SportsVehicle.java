package WithStrategyPattern;
import WithStrategyPattern.strategy.SpecialStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SpecialStrategy());
    }

}
