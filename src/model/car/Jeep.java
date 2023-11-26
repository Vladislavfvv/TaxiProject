package model.car;

import enums.Fuel;
import exceptions.CarExceptions;

public class Jeep extends PassengerCar {
    private boolean allRoad;

    public Jeep(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, int maxPassengers, int doors, boolean allRoad) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel, maxPassengers, doors);
        this.allRoad = allRoad;
    }
}
