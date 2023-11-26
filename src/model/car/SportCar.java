package model.car;

import enums.Fuel;
import exceptions.CarExceptions;

public class SportCar extends PassengerCar {

    private double maxSpeed;

    public SportCar(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, int maxPassengers, int doors, double maxSpeed) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel, maxPassengers, doors);
        this.maxSpeed = maxSpeed;
    }
}
