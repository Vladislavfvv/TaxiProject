package actions;

import enums.Fuel;
import exceptions.CarExceptions;
import model.*;
import model.car.Cabriolet;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {
    public static List<AbstractCar> parseFile(String filePath) {
        List<AbstractCar> firstCarList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            br.readLine();//для пропуска 1-й строки
            while ((line = br.readLine()) != null) {
                // Split the line into one object
                String[] parts = line.split(", ");

                // Extract data from parts and create a new object
                String brand = parts[0];
                String carName = String.valueOf(parts[1].split(", ")[0]);
                String yearOfIssue = String.valueOf(parts[2].split(", ")[0]);
                double fuelConsumption = Double.parseDouble(parts[3].split(", ")[0]);
                double price = Double.parseDouble(parts[4].split(", ")[0]);
                String fuel = String.valueOf(parts[5].split(", ")[0]);
                double acceleration = Double.parseDouble(parts[6].split(", ")[0]);
                int maxPassengers = Integer.parseInt(parts[7].split(", ")[0]);
                int doors = Integer.parseInt(parts[8].split(", ")[0]);
                boolean roof = Boolean.parseBoolean(parts[3].split(", ")[0]);


                // Create a new Car object and add it to the list
                AbstractCar person = new Cabriolet(brand, carName, yearOfIssue, fuelConsumption, price, fuel, acceleration, maxPassengers, doors, roof);
                //String brand, String carName, String yearOfIssue, double fuelConsumption, double price, String fuel, double acceleration, int maxPassengers, int doors, boolean roof
                firstCarList.add(person);
            }
        }  catch (CarExceptions e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return firstCarList;
    }


}
