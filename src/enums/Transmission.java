package enums;

public enum Transmission {
    Mechanic,
    Automatic,
    Hybrid;



    public static boolean isValid(String fuel){
        try{
            Fuel.valueOf(fuel.toUpperCase());
            return true;
        }
        catch (IllegalArgumentException | NullPointerException ex){
            return false;
        }
    }
}
