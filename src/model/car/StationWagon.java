package model.car;

import enums.Fuel;
import exceptions.CarExceptions;

public class StationWagon extends PassengerCar {
    private double maxCarryingWeight;

    public StationWagon(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, int maxPassengers, int doors, double maxCarryingWeight) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel, maxPassengers, doors);
        this.maxCarryingWeight = maxCarryingWeight;
    }
}
