package model.car;

import enums.CarType;
import enums.Fuel;
import exceptions.CarExceptions;

public class Limousine extends PassengerCar {
    private boolean alcohol;

    public Limousine(CarType id, String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, int maxPassengers, int doors, boolean alcohol) throws CarExceptions {
        super(id, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors);
        this.alcohol = alcohol;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return "Limousine{" +
                "alcohol=" + alcohol +
                ", doors=" + doors +
                ", brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }
}
