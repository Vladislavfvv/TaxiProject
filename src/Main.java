import actions.AbstractCarComparatorByFuelConsumptionASC;
import actions.AbstractCarComparatorByFuelConsumptionDesc;
import actions.MyFileReader;
import actions.ObjectSerialization;
import exceptions.CarExceptions;
import model.*;
import model.car.Cabriolet;
import model.car.Jeep;
import model.car.SportCar;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import static enums.CarType.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
            AbstractCar toyota = new Cabriolet(CABRIOLET, "Toyota", "Camry", "2023", 5.5, 20000, "DIESEL", 7.5, 2, 2, true);
            AbstractCar landRover = new Jeep(JEEP, "Land Rover", "Defender", "2020", 15, 35000, "GASOLINE", 8, 5, 4, true);
            AbstractCar lamborghini = new SportCar(SPORTCAR, "Lamborghini", "Urus", "2022", 14.1, 250000, "Gasoline", 3.5, 2, 2, 305);
            //AbstractCar lamborghini2 = new SportCar();
            System.out.println(toyota);
            System.out.println(landRover);
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy");
            LocalDate localDate = LocalDate.parse("2023", formatter1);
            System.out.println(localDate);
            List<AbstractCar> carList = new ArrayList<>();
            TaxiStation taxiStation = new TaxiStation();
            taxiStation.addCar(toyota);
            taxiStation.addCar(landRover);
            taxiStation.addCar(lamborghini);
            taxiStation.displayAllCars();
            System.out.println("--------------***-------------------");
            //List<AbstractCar> myCarsList = taxiStation.
            taxiStation.sortCarsByYearOfIssue();
            taxiStation.displayAllCars();


            carList.add(toyota);
            carList.add(lamborghini);
            carList.add(landRover);
            ObjectSerialization.writeToFile("carList.txt", carList);*/
        System.out.println("-------------------------------***----------------------------------");
        List<AbstractCar> newAC = ObjectSerialization.readFromFile("carList.txt");
        printListOfCars(newAC);

        Collection<AbstractCar> ac = MyFileReader.parseFile("ListOfCars.txt");
        printListOfCars(ac);

        System.out.println("-------------------------------Sort Increasing----------------------------------");
        AbstractCarComparatorByFuelConsumptionASC abstractCarComparatorByFuelConsumption = new AbstractCarComparatorByFuelConsumptionASC();
        Collection<AbstractCar> sortedSetCars = new TreeSet<AbstractCar>(abstractCarComparatorByFuelConsumption);
        sortedSetCars.addAll(ac);
        printListOfCars(sortedSetCars);

        System.out.println("-------------------------------sort decreasing----------------------------------");
        AbstractCarComparatorByFuelConsumptionDesc abstractCarComparatorByFuelConsumptionDesc = new AbstractCarComparatorByFuelConsumptionDesc();
        Collection<AbstractCar> sortedSetCars2 = new TreeSet<AbstractCar>(abstractCarComparatorByFuelConsumptionDesc);
        sortedSetCars2.addAll(sortedSetCars);
        printListOfCars(sortedSetCars2);


    }

    public static void printListOfCars(Collection<AbstractCar> abstractCars) {
        System.out.println("All taksopark:");
        for (AbstractCar ac : abstractCars) {
            System.out.printf("Brand: %s, name: %s, year: %s, consumption: %.2f, price: %.2f",
                    ac.getBrand(), ac.getCarName(), ac.getYearOfIssue(), ac.getFuelConsumption(), ac.getPrice());
            System.out.println();
        }
    }
}