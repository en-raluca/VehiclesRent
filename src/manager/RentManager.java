package manager;

import model.Car;
import model.Client;
import model.Rent;

import java.util.*;

public class RentManager {
    //Update
    public void updateIfRentedCarIsReturned(List<Rent> rentList){
          for (Rent rent : rentList){
            if(rent.isReturned()){
                rent.setReturned(true);
            }
            else rent.setReturned(false);
        }

    }
    //Find Search
    public Rent findRentByReservationId(List<Rent> rentList, String reservationId){
        Rent rent = null;
        for(Rent rent1 : rentList){
            if(rent1.getReservationId().equals(reservationId)){
                rent=rent1;
            }
        }
    return rent;
    }

    public boolean checkIfCarisRented(List<Rent> rentList, int vehicleID){

        boolean isRented = false;
        for (Rent rent1 : rentList){
            if (rent1.getVehicleId() == vehicleID && !rent1.isReturned()) {
                isRented = true;
                break;
            }
        }
        return isRented;
    }

    public boolean searchCarRentedMoreThenXDays(List<Rent> rentList, int xDays) {

        boolean result = false;
        for (Rent rent1 : rentList){
            if (rent1.getDaysNumber() > xDays) {
                result = true;
                break;
            }
        }
        return result;
    }

    //Filter
    public List<Car> getCarListAvailabile(List<Car> carList){
        List<Car> resultList = new ArrayList<>();
        for(Car c : carList){
            if(c.isAvailable()){
                resultList.add(c);
            }
        }
        return resultList;
    }

    public  List<Car> getCarListNeverRented(List<Car> carList, List<Rent> rentList){
        List<Car> resultList = new ArrayList<>();
        for(Car car : carList){
            boolean wasFound=false;
            for(Rent rent : rentList){
                if (rent.getVehicleId() == (car.getId())) {
                    wasFound = true;
                    break;
                }
            }
            if(!wasFound){
                resultList.add(car);
            }
        }
    return resultList;
    }

    public List<Car> getMostRentedCar(List<Car> carList, List<Rent> rentList) {
        List<Car> resultList = new ArrayList<>();
        for (Car car : carList) {
            Map<Car, Integer> countCars = new HashMap<>();
            for (Rent rent : rentList) {
                if (rent.getVehicleId() == car.getId()) {
                    int count = 0;
                    if (countCars.get(car.getId()) == null) {
                        count = 1;
                    } else {
                        count = countCars.get(car.getId()) + 1;
                    }
                    countCars.put(car, count);
                    countCars.entrySet().stream().sorted(Map.Entry.comparingByValue());

                }
            }

        }

    }

    public List<Client> getTheClientWithMostsRents(){

    }

    public List<Rent> getTheLongestRent(){

    }

    public List<Rent> getMostExpensiveRent(List<Rent> rentList){
        List<Rent> rentList1 = new ArrayList<>();

        for(Rent rent : rentList){


        }
    }

}
