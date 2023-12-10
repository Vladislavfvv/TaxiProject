package model.car;

import enums.CarType;
import enums.Fuel;
import exceptions.CarExceptions;

public class SportCar extends PassengerCar {

    private double maxSpeed;

    public SportCar(CarType id, String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, int maxPassengers, int doors, double maxSpeed) throws CarExceptions {
        super(id, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) throws CarExceptions{
        if (maxSpeed <= 200 || maxSpeed > 500) throw new CarExceptions("This is not a sportCar", this);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                ", doors=" + doors +
                ", brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }
}
