package model.car;

import enums.Fuel;
import exceptions.CarExceptions;

public class Jeep extends PassengerCar {
    private boolean allRoad;

    public Jeep(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, int maxPassengers, int doors, boolean allRoad) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors);
        this.allRoad = allRoad;
    }

    public boolean isAllRoad() {
        return allRoad;
    }

    public void setAllRoad(boolean allRoad) {
        this.allRoad = allRoad;
    }

    @Override
    public String toString() {
        return "Jeep{" +
                "allRoad=" + allRoad +
                ", doors=" + doors +
                ", brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }
}
