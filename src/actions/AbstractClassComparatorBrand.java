package actions;

import model.AbstractCar;

import java.util.Comparator;

public class AbstractClassComparatorBrand implements Comparator<AbstractCar> {
    @Override
    public int compare(AbstractCar o1, AbstractCar o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
