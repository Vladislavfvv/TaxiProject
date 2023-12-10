package model.car;


import enums.CarType;
import exceptions.CarExceptions;
import model.AbstractCar;

public abstract class PassengerCar extends AbstractCar {
    private int maxPassengers;
    protected int doors;

    public PassengerCar(CarType id, String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, int maxPassengers, int doors) throws CarExceptions {
        super(id, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration);
        this.maxPassengers = maxPassengers;
        this.doors = doors;
    }
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }



    @Override
    public String toString() {
        return super.toString() +
                ", maxPassengers:" + maxPassengers +
                ", doors:" + doors;
    }
}
