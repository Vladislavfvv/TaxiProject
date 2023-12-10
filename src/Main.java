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

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try{
            AbstractCar toyota = new Cabriolet("Toyota", "Camry", "2023", 5.5, 20000,"DIESEL", 7.5 , 2, 2, true);
            AbstractCar landRover = new Jeep("Land Rover", "Defender", "2020", 15, 35000, "GAS", 8, 5, 4, true);
            AbstractCar lamborghini = new SportCar("Lamborghini", "Urus", "2022", 14.1, 250000, "Gasoline", 3.5, 2, 2, 305);
            System.out.println(toyota);
            System.out.println(landRover);
            /*DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy");
            LocalDate localDate = LocalDate.parse("2023", formatter1);
            System.out.println(localDate);*/
            List<AbstractCar> carList  = new ArrayList<>();
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
            ObjectSerialization.writeToFile("carList.txt", carList);
            System.out.println("-------------------------------***----------------------------------");
            List<AbstractCar> newAC = ObjectSerialization.readFromFile("carList.txt");
            printListOfCars(newAC);

            MyFileReader.parseFile("ListOfCars.txt");
        } catch (CarExceptions ex){
            ex.logException();
        }
    }

    public static void printListOfCars(Collection<AbstractCar> abstractCars){
        for (AbstractCar ac: abstractCars) {
            System.out.printf("Brand: %s, name: %s, year: %s, consumption: %.2f, price: %.2f",
                    ac.getBrand(), ac.getCarName(), ac.getYearOfIssue(), ac.getFuelConsumption(), ac.getPrice());
            System.out.println("\n");
        }
    }
}