package model.car;

import enums.Fuel;
import exceptions.CarExceptions;

public class Cabriolet extends PassengerCar {

    private boolean roof;

    public Cabriolet(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, int maxPassengers, int doors, boolean roof) throws CarExceptions {
        super(brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors);
        this.roof = roof;
    }

    public Cabriolet(String yearOfIssue, double fuelConsumption, double price, Fuel fuel, double acceleration, int maxPassengers, int doors) {
        super();
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roof=" + roof +
                ", doors=" + doors +
                ", brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }
}
