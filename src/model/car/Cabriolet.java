package model.car;

import enums.Fuel;
import exceptions.CarExceptions;

public class Cabriolet extends PassengerCar {

    private boolean roof;

    public Cabriolet(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, int maxPassengers, int doors, boolean roof) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel, maxPassengers, 2);
        this.roof = roof;
    }


}
