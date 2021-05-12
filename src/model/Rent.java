package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Rent {
    private String reservationId;
    private int clientId;
    private int vehicleId;
    private int daysNumber;
    private LocalDateTime startDate;
    private double totalPrice;
    private LocalDateTime reservationDate;
    private boolean isReturned;

    public Rent(String reservationId, int clientId , int vehicleId, int daysNumber, LocalDateTime startDate, double totalPrice, LocalDateTime reservationDate, boolean isReturned) {
        this.reservationId = reservationId;
        this.clientId = clientId;
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

    public int getClientId() {
        return clientId;
    }

    public void setClient(int clientId) {
        this.clientId = clientId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public void setDaysNumber(int daysNumber) {
        this.daysNumber = daysNumber;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
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
        return "The reservation with ID " + reservationId  +  " client ID: " + clientId  +
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
