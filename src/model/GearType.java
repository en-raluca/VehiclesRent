package model;

public enum GearType {
    MANUAL("Manual"),
    AUTOMATIC("Automatic");

    private String gearType;
    GearType(String gearType){this.gearType=gearType;}
    public String getGearType(){return gearType;}
}
