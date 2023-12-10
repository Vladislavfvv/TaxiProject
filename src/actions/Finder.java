package actions;

import model.AbstractCar;

import java.util.ArrayList;
import java.util.Collection;

public class Finder {
    //поиск по названию - вывод первый найденный
    public static AbstractCar findAbstractCarByName(Collection<AbstractCar> abstractCars, String carName) {
        for (AbstractCar a : abstractCars) {
            if (a.getCarName().toUpperCase().equals(carName.toUpperCase())) return a;
        }
        return null;
    }


    //поиск по названию - вывод список
    public static Collection<AbstractCar> findAbstractCarListByName(Collection<AbstractCar> abstractCars, String carName) {
        Collection<AbstractCar> findCollection = new ArrayList<>();
        for (AbstractCar a : abstractCars) {
            if (a.getCarName().toUpperCase().equals(carName.toUpperCase()))
                findCollection.add(a);
        }
        return findCollection;
    }


    //поиск по марке
    public static Collection<AbstractCar> findAbstractCarListByBrand(Collection<AbstractCar> abstractCars, String carBrand) {
        Collection<AbstractCar> findCollection = new ArrayList<>();
        for (AbstractCar a : abstractCars) {
            if (a.getBrand().toUpperCase().equals(carBrand.toUpperCase()))
                findCollection.add(a);
        }
        return findCollection;
    }

    //поиск авто по разгону
    public static AbstractCar findAbstractCarByAcceleration(Collection<AbstractCar> abstractCars, double acceleration) {
        for (AbstractCar a : abstractCars) {
            if (a.getAcceleration() == acceleration)
                return a;
        }
        return null;
    }


    //поиск по году выпуска
    public static Collection<AbstractCar> findAbstractCarListByYearOfIssue(Collection<AbstractCar> abstractCars, String yearOfIssue) {
        Collection<AbstractCar> findCollection = new ArrayList<>();
        for (AbstractCar a : abstractCars) {
            if (a.getYearOfIssue().toUpperCase().equals(yearOfIssue.toUpperCase()))
                findCollection.add(a);
        }
        return findCollection;
    }

    //поиск по году выпуска - диапазон от  min до max (будем задавать с консоли min/max)
    public static Collection<AbstractCar> findAbstractCarListByPriceFromMinToMax(Collection<AbstractCar> abstractCars, double min, double max) {
        Collection<AbstractCar> findCollection = new ArrayList<>();
        for (AbstractCar a : abstractCars) {
            if (a.getPrice() > min || a.getPrice() < max)
                findCollection.add(a);
        }
        return findCollection;
    }


}
