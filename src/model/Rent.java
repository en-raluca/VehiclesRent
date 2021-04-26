package model;

import java.util.Date;

public class Rent {
    private String reservationId;
    private Client client;
    private String vehicleId;
    private int daysNumber;
    private Date startDate;
    private double totalPrice;
    private Date reservationDate;
    private boolean isReturned;

    public Rent(String reservationId, Client client, String vehicleId, int daysNumber, Date startDate, double totalPrice, Date reservationDate, boolean isReturned) {
        this.reservationId = reservationId;
        this.client = client;
        this.vehicleId = vehicleId;
        this.daysNumber = daysNumber;
        this.startDate = startDate;
        this.totalPrice = totalPrice;
        this.reservationDate = reservationDate;
        this.isReturned = isReturned;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public void setDaysNumber(int daysNumber) {
        this.daysNumber = daysNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    @Override
    public String toString() {
        return "The reservation with ID " + reservationId  +  " by client: " + client  +
                ", of the vehicle ID: " + vehicleId + ", with the numeber of days: " + daysNumber  +", starting from: " + startDate +
                ", total cost; " + totalPrice + ", day of the reservation  " +  reservationDate +", is returned: "+isReturned;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = prime * reservationId.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Rent rent = (Rent) o;
        if(rent.getReservationId()==this.reservationId){
            return true;
        }
        else return false;
    }
}
