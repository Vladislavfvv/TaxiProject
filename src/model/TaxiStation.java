package model;

import actions.AbstractCarComparatorByFuelConsumptionASC;
import actions.AbstractCarYearOfIssueComparator;

import java.util.*;

public class TaxiStation {
    private List<AbstractCar> listAbstractCar;
    private Map<String, AbstractCar> mapAbstractCar;
    private SortedSet<AbstractCar> sortedSetCars;


    public TaxiStation(){
        listAbstractCar = new ArrayList<>();
        mapAbstractCar = new HashMap<>();
        AbstractCarComparatorByFuelConsumptionASC abstractCarComparatorByFuelConsumption = new AbstractCarComparatorByFuelConsumptionASC();
        sortedSetCars = new TreeSet<AbstractCar>(abstractCarComparatorByFuelConsumption);//добавил в конструктор чтобы автоматом сортировал по топлиму
    }

    public List<AbstractCar> getListAbstractCar() {
        return listAbstractCar;
    }

    public Map<String, AbstractCar> getMapAbstractCar() {
        return mapAbstractCar;
    }

    public SortedSet<AbstractCar> getSortedSetCars() {
        return sortedSetCars;
    }

    public void displayAllCars(){
        System.out.println("All cars in park:");
        for (AbstractCar car:listAbstractCar) {
            System.out.println(car);
        }
    }

    public void addCar(AbstractCar abstractCar){
        listAbstractCar.add(abstractCar);
        System.out.println("Car has been added");
    }

    public void removeCar(){

    }

    //4. Сортировка автомобилей по расходу топлива:
    public void sortCarsByYearOfIssue(){
        Collections.sort(listAbstractCar, new AbstractCarYearOfIssueComparator());
    }

    //3. Подсчет стоимости автопарка
public double taxiStationVehicleCost(){
        double sum = 0.0;
    for (AbstractCar a: sortedSetCars) {
        sum += a.getPrice();
    }
    return sum;
}

//5. Поиск автомобиля по параметрам скорости:


}
