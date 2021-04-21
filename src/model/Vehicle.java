package model;

public class Vehicle {
    private int id;
    private double pricePerDay;
    private int numberOfKm;
    private boolean isAvailable;
    private Colour colour;

    public Vehicle(int id, double pricePerDay, int numberOfKm, boolean isAvailable, Colour colour){
        this.id=id;
        this.pricePerDay=pricePerDay;
        this.numberOfKm=numberOfKm;
        this.isAvailable=isAvailable;
        this.colour=colour;
    }
    public void setId (int id){this.id=id;}
    public int getId(){return id;}

    public void setPricePerDay (double pricePerDay){this.pricePerDay=pricePerDay;}
    public double getPricePerDay(){return pricePerDay;}

    public void setNumberOfKm (int numberOfKm){this.numberOfKm=numberOfKm;}
    public int getNumberOfKm(){return numberOfKm;}

    public void setIsAvalable (boolean isAvailable){this.isAvailable=isAvailable;}
    public boolean isAvailable(){return isAvailable;}

    public void setColour (Colour colour){this.colour=colour;}
    public Colour getColour(){return colour;}


    @Override
    public int hashCode() {
        int prime = 31;
        int result = prime * id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Vehicle vehicle = (Vehicle) o;
        if(vehicle.getId()==this.id){
            return true;
        }
        else return false;
    }
    @Override
    public String toString(){
        return "The vehicle with ID: " + id +" has " + colour+ " colour "+", has:"+numberOfKm+"km" + ", and costs: " + pricePerDay + " per Day "
                + ", is available " + isAvailable ;
    }
}
