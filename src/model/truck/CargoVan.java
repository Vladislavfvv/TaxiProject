package model.truck;

import enums.Fuel;
import exceptions.CarExceptions;

public class CargoVan extends Van{
    private double maxCarryingWeight;


    public CargoVan(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double maxCarryingWeight) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel);
        this.maxCarryingWeight = maxCarryingWeight;
    }
}
