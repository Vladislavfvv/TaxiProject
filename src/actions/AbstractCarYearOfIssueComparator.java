package actions;

import model.AbstractCar;

import java.util.Comparator;

public class AbstractCarYearOfIssueComparator implements Comparator<AbstractCar> {
    @Override
    public int compare(AbstractCar a, AbstractCar b){
        return b.getYearOfIssue().compareTo(a.getYearOfIssue());
    }
}
