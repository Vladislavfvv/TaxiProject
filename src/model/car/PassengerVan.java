package model.car;

import enums.Fuel;
import exceptions.CarExceptions;

public class PassengerVan extends PassengerCar {

    public PassengerVan(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, int maxPassengers, int doors) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors);
    }

    @Override
    public String toString() {
        return "PassengerVan{" +
                "doors=" + doors +
                ", brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }
}
