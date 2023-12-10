package actions;

import model.AbstractCar;

import java.util.ArrayList;
import java.util.Collection;

public class Finder {
    //����� �� �������� - ����� ������ ���������
    public static AbstractCar findAbstractCarByName(Collection<AbstractCar> abstractCars, String carName) {
        for (AbstractCar a : abstractCars) {
            if (a.getCarName().toUpperCase().equals(carName.toUpperCase())) return a;
        }
        return null;
    }


    //����� �� �������� - ����� ������
    public static Collection<AbstractCar> findAbstractCarListByName(Collection<AbstractCar> abstractCars, String carName) {
        Collection<AbstractCar> findCollection = new ArrayList<>();
        for (AbstractCar a : abstractCars) {
            if (a.getCarName().toUpperCase().equals(carName.toUpperCase()))
                findCollection.add(a);
        }
        return findCollection;
    }


    //����� �� �����
    public static Collection<AbstractCar> findAbstractCarListByBrand(Collection<AbstractCar> abstractCars, String carBrand) {
        Collection<AbstractCar> findCollection = new ArrayList<>();
        for (AbstractCar a : abstractCars) {
            if (a.getBrand().toUpperCase().equals(carBrand.toUpperCase()))
                findCollection.add(a);
        }
        return findCollection;
    }

    //����� ���� �� �������
    public static AbstractCar findAbstractCarByAcceleration(Collection<AbstractCar> abstractCars, double acceleration) {
        for (AbstractCar a : abstractCars) {
            if (a.getAcceleration() == acceleration)
                return a;
        }
        return null;
    }


    //����� �� ���� �������
    public static Collection<AbstractCar> findAbstractCarListByYearOfIssue(Collection<AbstractCar> abstractCars, String yearOfIssue) {
        Collection<AbstractCar> findCollection = new ArrayList<>();
        for (AbstractCar a : abstractCars) {
            if (a.getYearOfIssue().toUpperCase().equals(yearOfIssue.toUpperCase()))
                findCollection.add(a);
        }
        return findCollection;
    }

    //����� �� ���� ������� - �������� ��  min �� max (����� �������� � ������� min/max)
    public static Collection<AbstractCar> findAbstractCarListByPriceFromMinToMax(Collection<AbstractCar> abstractCars, double min, double max) {
        Collection<AbstractCar> findCollection = new ArrayList<>();
        for (AbstractCar a : abstractCars) {
            if (a.getPrice() > min || a.getPrice() < max)
                findCollection.add(a);
        }
        return findCollection;
    }


}
