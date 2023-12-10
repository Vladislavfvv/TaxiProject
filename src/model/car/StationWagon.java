package model.car;

import enums.CarType;
import exceptions.CarExceptions;
import model.AbstractCar;

public class StationWagon extends PassengerCar {

    private double maxCarryingWeight;

    public StationWagon(CarType id, String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, int maxPassengers, int doors, double maxCarryingWeight) throws CarExceptions {
        super(id, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors);
        this.maxCarryingWeight = maxCarryingWeight;
    }



    public double getMaxCarryingWeight() {
        return maxCarryingWeight;
    }

    public void setMaxCarryingWeight(double maxCarryingWeight) {
        this.maxCarryingWeight = maxCarryingWeight;
    }

    @Override
    public String toString() {
        return "StationWagon{" +
                "maxCarryingWeight=" + maxCarryingWeight +
                ", doors=" + doors +
                ", brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }


}
