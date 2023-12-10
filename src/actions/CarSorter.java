package actions;

import model.AbstractCar;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class CarSorter {
//���������� �� ������� ������� �����������
    public static Collection<AbstractCar> byConsumptionUp(Collection<AbstractCar> abstractCarCollection){
        SortedSet<AbstractCar> abstractCarSortedSet = new TreeSet<>(new AbstractCarComparatorByFuelConsumptionASC());
        abstractCarSortedSet.addAll(abstractCarCollection);
        return abstractCarSortedSet;
    }

    //���������� �� ������� ������� ��������
    public static Collection<AbstractCar> byConsumptionDown(Collection<AbstractCar> abstractCarCollection){
        SortedSet<AbstractCar> abstractCarSortedSet = new TreeSet<>(new AbstractCarComparatorByFuelConsumptionASC());
        abstractCarSortedSet.addAll(abstractCarCollection);
        return abstractCarSortedSet;
    }
}
