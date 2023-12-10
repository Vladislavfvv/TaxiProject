package actions;

import model.AbstractCar;

import java.util.Comparator;

public class AbstractCarComparatorByFuelConsumptionDesc implements Comparator<AbstractCar> {
    @Override
    public int compare(AbstractCar o1, AbstractCar o2) {
        if(o1.getFuelConsumption() > o2.getFuelConsumption()) return -1;
        if(o1.getFuelConsumption() < o2.getFuelConsumption()) return 1;
        return 0;
    }
}
