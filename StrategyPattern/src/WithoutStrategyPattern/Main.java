package WithoutStrategyPattern;

public class Main {
    public static void main(String ...x) {
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        SportsVehicle sportsVehicle = new SportsVehicle();
        PassengerVehicle passengerVehicle = new PassengerVehicle();
        offRoadVehicle.drive();
        sportsVehicle.drive();
        passengerVehicle.drive();
    }
}
