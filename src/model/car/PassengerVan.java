package model.car;

import enums.Fuel;
import exceptions.CarExceptions;

public class PassengerVan extends PassengerCar {


    public PassengerVan(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, int maxPassengers, int doors) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel, maxPassengers, doors);
    }
}
