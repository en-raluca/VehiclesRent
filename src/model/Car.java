package model;

import java.util.List;

public class Car extends Vehicle implements Discountable{
    private String registrationPlate;
    private String type;
    private String model;
    private GearType gearType;
    private List<String> features;
    private int numberOfSeats;
    private int numberOfDors;
    private boolean isElectric;
    private FuelType fuelType;



    public Car(int id, double pricePerDay, int numberOfKm, boolean availability, Colour colour,
                String registrationPlate, String type, String model, GearType gearType, List<String> features, int numberOfSeats,
               int numberOfDors, boolean isElectric, FuelType fuelType) {
        super(id, pricePerDay, numberOfKm, availability, colour);
        this.registrationPlate=registrationPlate;
        this.type=type;
        this.model=model;
        this.gearType=gearType;
        this.features=features;
        this.numberOfSeats=numberOfSeats;
        this.numberOfDors=numberOfDors;
        this.isElectric=isElectric;
        this.fuelType=fuelType;
    }
    public void setRegistrationPlate(String registrationPlate){this.registrationPlate=registrationPlate;}
    public String getRegistrationPlate(){return registrationPlate;}

    public void setType(String type){this.type=type;}
    public String getType(){return type;}

    public void setModel(String model){this.model=model;}
    public String getModel(){return model;}

    public void setGearType (GearType gearType){this.gearType=gearType;}
    public GearType getGearType(){return gearType;}

    public void setFeatures(List<String> features){this.features=features;}
    public List<String> getFeatures(){return features;}

    public void setNumberOfSeats(int numberOfSeats){this.numberOfSeats=numberOfSeats;}
    public int getNumberOfSeats(){return numberOfSeats;}

    public void setNumberOfDors(int numberOfDors){this.numberOfDors=numberOfDors;    }
    public int getNumberOfDors(){return numberOfDors;}

    public void setIsElectric(boolean isElectric){this.isElectric=isElectric;}
    public boolean getIsElectric(){return isElectric;}

    public void setFuelType(FuelType fuelType){this.fuelType=fuelType;}
    public FuelType getFuelType(){return fuelType;}

    @Override
    public String toString(){
       return "The car " + model+" " + type + " with the ID " + getId() +" has " + getColour()+ " colour "+", has:"+getNumberOfKm()+"km"
               + ", and costs: " + getPricePerDay() + " EURO per Day "+ ", with the registration plate "+registrationPlate + ", has "+
               numberOfSeats +" seats and " + numberOfDors +" dors, is " + gearType + ", is electric " + isElectric
            + ", and the fuel type is " + fuelType + " ,features "+features+  "\n";
    }

    @Override
    public void applyDiscount(int percent) {
        double newPrice;
        double actualPrice = getPricePerDay();
        newPrice = actualPrice - (actualPrice * percent /100);
        setPricePerDay(newPrice);
    }
}
