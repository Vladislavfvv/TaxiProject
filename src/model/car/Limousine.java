package model.car;

import enums.Fuel;
import exceptions.CarExceptions;

public class Limousine extends PassengerCar {
    private boolean alcohol;
    public Limousine(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, int maxPassengers, int doors, boolean alcohol) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel, maxPassengers, doors);
        this.alcohol = alcohol;
    }
}
