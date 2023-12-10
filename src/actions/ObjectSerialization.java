package actions;

import model.AbstractCar;
import model.TaxiStation;

import java.io.*;
import java.util.Collection;
import java.util.ArrayList;

public class ObjectSerialization {

    public static void writeToFile(String fileName, Collection<? extends AbstractCar> abstractCars) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
           oos.writeObject(abstractCars);
            System.out.println("Object saved!");
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<AbstractCar> readFromFile(String filename){
        ArrayList<AbstractCar> abstractCars = new ArrayList<>();
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))){
            abstractCars = (ArrayList<AbstractCar>) objectInputStream.readObject();
        }catch(IOException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return abstractCars;
    }


}
