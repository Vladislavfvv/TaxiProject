package model.car;

import enums.CarType;
import exceptions.CarExceptions;

public class PassengerVan extends PassengerCar {

    private boolean carTrunkAvailible;

    public PassengerVan(CarType id, String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, int maxPassengers, int doors, boolean carTrunkAvailible) throws CarExceptions {
        super(id, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors);
        this.carTrunkAvailible = carTrunkAvailible;
    }

    public boolean isCarTrunkAvailible() {
        return carTrunkAvailible;
    }

    public void setCarTrunkAvailible(boolean carTrunkAvailible) {
        this.carTrunkAvailible = carTrunkAvailible;
    }

    @Override
    public String toString() {
        return "PassengerVan{" +
                "carTrunkAvailible=" + carTrunkAvailible +
                ", doors=" + doors +
                ", carType=" + carType +
                ", brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }
}
