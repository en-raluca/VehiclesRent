package manager;

import model.Car;
import model.Client;
import model.Rent;

import java.util.*;

public class RentManager {
    //Update

    public void updateIfRentedCarIsReturned(List<Rent> rentList, int vehicleID, boolean newStatusOfTheCar) {
        for (Rent rent : rentList) {
            if (rent.getVehicleId() == vehicleID) {
                rent.setReturned(newStatusOfTheCar);
            }
        }
    }

    //Find Search
    public List<Rent> findRentByReservationId(List<Rent> rentList, String reservationId) {
        List<Rent> resultList = new ArrayList<>();
        for (Rent rent : rentList) {
            if (rent.getReservationId().equals(reservationId)) {
                resultList.add(rent);
            }
        }
        return rentList;
    }

    public boolean checkIfCarIsRented(List<Rent> rentList, int vehicleID) {

        boolean isRented = false;
        for (Rent rent1 : rentList) {
            if (rent1.getVehicleId() == vehicleID && !rent1.isReturned()) {
                isRented = true;
                break;
            }
        }
        return isRented;
    }

    public boolean searchCarRentedMoreThenXDays(List<Rent> rentList, int xDays) {

        boolean result = false;
        for (Rent rent1 : rentList) {
            if (rent1.getDaysNumber() > xDays) {
                result = true;
                break;
            }
        }
        return result;
    }

    //Filter
    public List<Car> getCarListAvailabile(List<Car> carList) {
        List<Car> resultList = new ArrayList<>();
        for (Car c : carList) {
            if (c.isAvailable()) {
                resultList.add(c);
            }
        }
        return resultList;
    }

    public List<Car> getCarListNeverRented(List<Car> carList, List<Rent> rentList) {
        List<Car> resultList = new ArrayList<>();
        for (Car car : carList) {
            boolean wasFound = false;
            for (Rent rent : rentList) {
                if (rent.getVehicleId() == (car.getId())) {
                    wasFound = true;
                    break;
                }
            }
            if (!wasFound) {
                resultList.add(car);
            }
        }
        return resultList;
    }

    public List<Car> getMostRentedCars(List<Car> carList, List<Rent> rentList) {
        List<Car> resultList = new ArrayList<>();
        Map<Car, Integer> carsMap = new HashMap<>();
        for (Car car : carList) {
            for (Rent rent : rentList) {
                if (rent.getVehicleId() == car.getId()) {
                    if (carsMap.containsKey(car)) {
                        int actualNr = carsMap.get(car);
                        int newNr = actualNr + 1;
                        carsMap.put(car, newNr);
                    } else {
                        carsMap.put(car, 1);
                    }
                }
            }
        }
        int max = 1;
        for (Integer i : carsMap.values()) {
            if (i > max) {
                max = i;
            }
        }
        for (Car car : carsMap.keySet()) {
            int rentNr = carsMap.get(car);
            if (rentNr == max) {
                resultList.add(car);
            }
        }
        return resultList;
    }

    public List<Client> getTheClientWithMostsRents(List<Client> clientList, List<Rent> rentList) {
        List<Client> resultList = new ArrayList<>();
        Map<Client, Integer> clientMap = new HashMap<>();
        for (Client client : clientList) {
            for (Rent rent : rentList) {
                if(client.getId()==rent.getClientId()){
                    if(clientMap.containsKey(client)){
                        int actualNr = clientMap.get(client);
                        int newNr = actualNr+1;
                        clientMap.put(client, newNr);
                    }
                    else {
                        clientMap.put(client, 1);
                    }
                }
            }
        }
        int max=1;
        for(Integer i : clientMap.values()) {
            if(i>max){
                max=i;
            }
        }
        for(Client client : clientMap.keySet()){
            int rentNr = clientMap.get(client);
            if(rentNr == max){
                resultList.add(client);
            }
        }
        return resultList;
        }


    public List<Rent> getTheLongestRent(List<Rent> rentList) {
        List<Rent> resultList = new ArrayList<>();
        int maxNrDays = 0;
        for (Rent rent : rentList) {
            if (rent.getDaysNumber() > maxNrDays) {
                maxNrDays = rent.getDaysNumber();
            }
        }
        for (Rent rent : rentList) {
            if (rent.getDaysNumber() == maxNrDays) {
                resultList.add(rent);
            }
        }
        return resultList;
    }

    public List<Rent> getMostExpensiveRent(List<Rent> rentList) {
        List<Rent> resultList = new ArrayList<>();
        double maxPricePerRent = 0;
        for (Rent rent : rentList) {
            if (rent.getTotalPrice() > maxPricePerRent) {
                maxPricePerRent = rent.getTotalPrice();
            }
        }
        for (Rent rent : rentList) {
            if (rent.getTotalPrice() == maxPricePerRent) {
                resultList.add(rent);
            }
        }
        return resultList;

    }


    //Remove/Add
    public void addARent(List<Rent> rentList, Rent rent){
        rentList.add(rent);
    }

}
