import exceptions.CarExceptions;
import model.*;
import model.car.Cabriolet;

public class Main {
    public static void main(String[] args) throws CarExceptions {
        System.out.println("Hello world!");

        AbstractCar car = new Cabriolet("Toyota", "Camry", "2023", 5.5, 20000,"DIESEL",  2, 2, true);

        System.out.println(car);
    }
}