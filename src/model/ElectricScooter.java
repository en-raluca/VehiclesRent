package model;

public class ElectricScooter extends Vehicle{
    public String model;
    public double batteryLevel;

    public ElectricScooter(int id, double pricePerDay, int numberOfKm, boolean isAvailable, Colour colour, String model, double batteryLevel) {
        super(id, pricePerDay, numberOfKm, isAvailable, colour);
        this.model=model;
        this.batteryLevel=batteryLevel;

    }
    public void setModel(String model){this.model=model;}
    public String getModel(){return model;}

    public void setBatteryLevel(double batteryLevel){this.batteryLevel=batteryLevel;}
    public double getBatteryLevel(){return batteryLevel;}


    //        return "The car with ID: " + id +" has " + colour+ " colour "+", has:"+numberOfKm+"km" + ", and costs: " + pricePerDay + " per Day "
//                + ", is available " + isAvailable ;
    @Override
    public String toString(){
        return "The electric scooter " + model +"with ID: " + getId() +" has " + getColour()+ " colour "+", has:"+getNumberOfKm()+"km" + ", and costs: "
                + getPricePerDay() + " per Day " + ",has " + batteryLevel +"% battery" + ", is available " + isAvailable();
    }
}
