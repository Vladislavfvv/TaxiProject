package actions;

import enums.CarType;
import enums.Fuel;
import exceptions.CarExceptions;
import model.*;
import model.car.*;
import model.truck.CargoVan;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyFileReader {
    public static Collection<AbstractCar> parseFile(String filePath) {
        Collection<AbstractCar> firstCarList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            br.readLine();//для пропуска 1-й строки
            while ((line = br.readLine()) != null) {
                // Split the line into one object++
                String[] parts = line.split(", ");

                // Extract data from parts and create a new object
                String carType = parts[0];
                String brand = String.valueOf(parts[1].split(", ")[0]);
                String carName = String.valueOf(parts[2].split(", ")[0]);
                String yearOfIssue = String.valueOf(parts[3].split(", ")[0]);
                double fuelConsumption = Double.parseDouble(parts[4].split(", ")[0]);
                double price = Double.parseDouble(parts[5].split(", ")[0]);
                String fuel = String.valueOf(parts[6].split(", ")[0]);
                double acceleration = Double.parseDouble(parts[7].split(", ")[0]);

                //depends on CarType-id create AbstractCar
                CarType carTypeForSwitch = CarType.valueOf(carType.toUpperCase());

                if (carTypeForSwitch.equals(CarType.SPORTCAR)) {
                    int maxPassengers = Integer.parseInt(parts[8].split(", ")[0]);
                    int doors = Integer.parseInt(parts[9].split(", ")[0]);
                    int maxSpeed = Integer.parseInt(parts[10].split(", ")[0]);
                    // Create a new Car object and add it to the list
                    AbstractCar abstractCar = new SportCar(CarType.SPORTCAR, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors, maxSpeed);
                    firstCarList.add(abstractCar);//add in list
                }
                else if (carTypeForSwitch.equals(CarType.CABRIOLET)) {
                    int maxPassengers = Integer.parseInt(parts[8].split(", ")[0]);
                    int doors = Integer.parseInt(parts[9].split(", ")[0]);
                    boolean roof = Boolean.parseBoolean(parts[10].split(", ")[0]);
                    // Create a new Car object and add it to the list
                    AbstractCar abstractCar = new Cabriolet(CarType.CABRIOLET, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors, roof);
                    firstCarList.add(abstractCar);//add in list
                }
                else if (carTypeForSwitch.equals(CarType.JEEP)) {
                    int maxPassengers = Integer.parseInt(parts[8].split(", ")[0]);
                    int doors = Integer.parseInt(parts[9].split(", ")[0]);
                    boolean allRoad = Boolean.parseBoolean(parts[10].split(", ")[0]);
                    // Create a new Car object and add it to the list
                    AbstractCar abstractCar = new Jeep(CarType.JEEP, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors, allRoad);
                    firstCarList.add(abstractCar);//add in list
                }
                else if (carTypeForSwitch.equals(CarType.LIMOUSINE)) {
                    int maxPassengers = Integer.parseInt(parts[8].split(", ")[0]);
                    int doors = Integer.parseInt(parts[9].split(", ")[0]);
                    boolean alcohol = Boolean.parseBoolean(parts[10].split(", ")[0]);
                    // Create a new Car object and add it to the list
                    AbstractCar abstractCar = new Limousine(CarType.LIMOUSINE, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors, alcohol);
                    firstCarList.add(abstractCar);//add in list
                }
                else if (carTypeForSwitch.equals(CarType.PASSANGERVAN)) {
                    int maxPassengers = Integer.parseInt(parts[8].split(", ")[0]);
                    int doors = Integer.parseInt(parts[9].split(", ")[0]);
                    boolean carTrunkAvailible = Boolean.parseBoolean(parts[10].split(", ")[0]);
                    // Create a new Car object and add it to the list
                    AbstractCar abstractCar = new PassengerVan(CarType.PASSANGERVAN, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors, carTrunkAvailible);
                    firstCarList.add(abstractCar);//add in list
                }
                else if (carTypeForSwitch.equals(CarType.STATIONWAGON)) {
                    int maxPassengers = Integer.parseInt(parts[8].split(", ")[0]);
                    int doors = Integer.parseInt(parts[9].split(", ")[0]);
                    double maxCarryingWeight = Double.parseDouble(parts[10].split(", ")[0]);
                    // Create a new Car object and add it to the list
                    AbstractCar abstractCar = new StationWagon(CarType.STATIONWAGON, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors, maxCarryingWeight);
                    firstCarList.add(abstractCar);//add in list
                }
                else if (carTypeForSwitch.equals(CarType.CARGOVAN)) {
                    double maxCarryingWeight = Double.parseDouble(parts[8].split(", ")[0]);
                    // Create a new Car object and add it to the list
                    AbstractCar abstractCar = new CargoVan(CarType.CARGOVAN, brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxCarryingWeight);
                    firstCarList.add(abstractCar);//add in list
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (CarExceptions | IOException e) {
            throw new RuntimeException(e);
        }
        return firstCarList;
    }


}
