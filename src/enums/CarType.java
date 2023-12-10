package enums;

public enum CarType {
    CABRIOLET("Cabriolet"),
    JEEP("Jeep"),
    LIMOUSINE("Limousine"),
    PASSANGERVAN("Minivan"),
    SPORTCAR("Sport car"),
    STATIONWAGON("Universal(SW)"),
    CARGOVAN("Truck multibus");

    private String nameBrand;

    CarType(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getNameBrand() {
        return nameBrand;
    }

}
