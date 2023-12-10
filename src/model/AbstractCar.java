package model;

import enums.CarType;
import enums.Fuel;
import exceptions.CarExceptions;
import java.io.Serializable;

public abstract class AbstractCar extends AbstractEntity<CarType> implements Serializable {
    protected String brand;//Марка
    protected String carName;//Модель
    //protected String idCar; //номер автомобиля для учета
    protected String yearOfIssue;//Год выпуска
    protected double fuelConsumption;//Расход топлива (в литрах на 100 км).
    protected double price;//Стоимость (в долларах)
    private Fuel fuel;//type of fuel
    private double acceleration; //from 0 to 100 km/h


    public AbstractCar(){
    }

    public AbstractCar(String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration) throws CarExceptions {

        this.brand = brand;
        this.carName = carName;
        this.yearOfIssue = yearOfIssue;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        setFuel(fuel);
        this.acceleration = acceleration;
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

    public void setFuelConsumption(double fuelConsumption) throws CarExceptions {
        if(fuelConsumption < 0)
            throw new CarExceptions("Wrong fuel consumption", this);
        this.fuelConsumption = fuelConsumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws CarExceptions{
        if(price <= 0)
            throw new CarExceptions("Wrong price", this);
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

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) throws CarExceptions {
        if(acceleration <= 0) throw new CarExceptions("Wrong acceleration value", this);
        this.acceleration = acceleration;
    }



    @Override
    public String toString() {
        return "AbstractCar{" +
                "brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", fuel=" + fuel +
                ", acceleration=" + acceleration +
                '}';
    }


}
