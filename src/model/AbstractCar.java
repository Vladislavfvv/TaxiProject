package model;

import enums.Fuel;
import exceptions.CarExceptions;
import interfaces.DataValidatable;
import exceptions.CarExceptions;
import java.io.Serializable;

public abstract class AbstractCar implements Serializable {
    protected String brand;
    protected String carName;
    protected String yearOfIssue;
    protected double fuelConsumption;
    protected double price;
    private Fuel fuel;



    public AbstractCar(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel) throws CarExceptions {
        this.brand = brand;
        this.carName = carName;
        this.yearOfIssue = yearOfIssue;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        setFuel(fuel);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) throws CarExceptions {
        if(brand == null || brand.trim().isEmpty() || brand.length() < 2)
            throw new CarExceptions("Wrong name value", this);
        this.brand = brand.substring(0,1).toUpperCase() + brand.substring(1);
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) throws CarExceptions {
        if(carName == null || carName.trim().isEmpty() || carName.length() < 2)
            throw new CarExceptions("Wrong name value", this);
        this.carName = carName.substring(0,1).toUpperCase() + carName.substring(1);
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fuel getFuel() {
        return this.fuel;
    }

    public void setFuel(String fuel) {
        if(!Fuel.isValid(fuel))
            throw new IllegalArgumentException("Invalid fuel provided");
        //this.fuel = Fuel.valueOf(fuel);
        this.fuel = Fuel.fromString(fuel);
    }

    @Override
    public String toString() {
        return  "brand:" + getBrand() +
                ", carName:" + getCarName() +
                ", yearOfIssue:" + getYearOfIssue() +
                ", fuelConsumption:" + getFuelConsumption() +
                ", price:" + getPrice() +
                ", fuel:" + getFuel();
    }
}
