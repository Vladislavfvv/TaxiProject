package enums;

public enum Fuel {
    GASOLINE("Bad fuel"),
    GAS("Bad fuel"),
    ELECTRICITY("Free fuel"),
    DIESEL("Diesel fuel"),
    HYDROGEN("Вest fuel");

    private String description;

    Fuel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static boolean isValid(String fuel){
        try{
            Fuel.valueOf(fuel.toUpperCase());
            return true;
        }
        catch (IllegalArgumentException | NullPointerException ex){
            return false;
        }
    }

    public String toString(){
        return  this.name() + ": " + this.description;
    }

    public static Fuel fromString(String value){
        for (Fuel f: Fuel.values()) {
            if(f.name().equalsIgnoreCase(value))
                return f;
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in Fuel enum");
    }

}
