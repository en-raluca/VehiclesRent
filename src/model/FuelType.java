package model;

public enum FuelType {
    PETROL("Petrol"),
    DIESEL("Diesel"),
    HYBRID("Hybrid"),
    ELECTRIC("Electric");

    private String fuelType;
    FuelType(String fuelType){this.fuelType=fuelType;}
    public String getFuelType(){return fuelType;}
}
