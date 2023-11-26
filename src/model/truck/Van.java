package model.truck;

import enums.Fuel;
import exceptions.CarExceptions;
import model.AbstractCar;

public abstract class Van extends AbstractCar {

    public Van(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel)  throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel);
    }


}
