package model.truck;

import enums.CarType;
import enums.Fuel;
import exceptions.CarExceptions;
import model.AbstractCar;

public class CargoVan extends Van{
    private double maxCarryingWeight;

    public CargoVan(CarType id, String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, double maxCarryingWeight) throws CarExceptions {
        super(id, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration);
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
        return "CargoVan{" +
                "maxCarryingWeight=" + maxCarryingWeight +
                ", brand='" + brand + '\'' +
                ", carName='" + carName + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", price=" + price +
                '}';
    }
@Override
    public int compare(AbstractCar a, AbstractCar b){
        return a.getBrand().compareTo(b.getBrand());
}
}
