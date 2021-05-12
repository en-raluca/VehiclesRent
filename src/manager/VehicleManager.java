package manager;

import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleManager {
    //UPDATE
    public void updateNrOfkm(List<Vehicle> vehicleList, int vehicleId, int newKm){
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId() == vehicleId) {
                vehicle.setNumberOfKm(newKm);
            }
        }

    }
    public void updatePricePerDay(List<Vehicle> vehicleList, int vehicleId, int newPricePerDay){
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId() == vehicleId) {
                vehicle.setPricePerDay(newPricePerDay);
            }
        }

    }
    public void updateAvailability(List<Vehicle> vehicleList, int vehicleId, boolean newAvailability) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId()==vehicleId ) {
                vehicle.setIsAvalable(newAvailability);
            }
            else vehicle.setIsAvalable(newAvailability);

        }
    }
    //Find search
    public boolean searchCarByFeature(List<Car> carList, String feature){
        boolean result = false;
        for(Car car : carList){
            if(car.getFeatures().contains(feature)){
                result=true;
            }

        }
        return result;
    }

    public boolean isAnyCarWithXNumberOfDorsandSeats(List<Car> carList,int dorsNumeber, int seatsNumber){
        boolean result = false;
        for(Car car1 : carList){
            if(car1.getNumberOfDors()==dorsNumeber && car1.getNumberOfSeats()==seatsNumber){
                result=true;
            }
        }
        return result;
    }

    public boolean isAnyCarElectric(List<Car> carList){
        boolean result = false;
        for(Car car1 : carList){
            if(FuelType.ELECTRIC==car1.getFuelType()){
                result=true;
            }
        }
        return result;
    }

    public boolean isVehicleWithLessKm(List<Vehicle> vehicleList, int numberOfKm){
        boolean result = false;
        for(Vehicle vehicle : vehicleList){
            if(vehicle.getNumberOfKm()<=numberOfKm){
                result=true;
            }
        }
        return result;
    }

    //Fileter
    public List<Car> getCarListThatHasMoreKmThen(List<Car> carList, int numberOfKm){
        List<Car> resultList = new ArrayList<>();
        for(Car car : carList){
            if(car.getNumberOfKm()>numberOfKm){
                resultList.add(car);
            }
        }
        return resultList;
    }

    public List<Car> getCarListCheaperThen(List<Car> carList,double pricePerDay){
        List<Car> resultList = new ArrayList<>();
        for(Car car : carList){
            if(car.getPricePerDay()<pricePerDay){
                resultList.add(car);
            }
        }
        return resultList;
    }

    public List<Car> getCarListWithSameColour(List<Car> carList,Colour colour){
        List<Car> resultList = new ArrayList<>();
        for(Car car : carList){
            if(colour.equals(car.getColour())){
                resultList.add(car);
            }
        }
        return resultList;
    }

    public List<Car> getCarListWithSameFeature(List<Car> carList,String feature){
        List<Car> resultList = new ArrayList<>();
        for(Car car : carList){
                if(car.getFeatures().contains(feature)){
                    resultList.add(car);
                }
        }
        return resultList;
    }
    //Map

    public Map<Integer,List<String>> extractClientByVehicleID(List<Vehicle> vehicleList,List<Client> clientList, List<Rent> rentList){
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for(Vehicle vehicle : vehicleList){
            List<String> clientRent = new ArrayList<>();

                for(Rent rent : rentList){
                if(rent.getVehicleId()==(vehicle.getId())) {
                   int clientId= rent.getClientId();
                   for (Client client : clientList){
                       if(client.getId()==clientId){
                           clientRent.add(client.getName() + " " + client.getSurName());
                       }
                   }
                }
            }
            resultMap.put(vehicle.getId(), clientRent);
        }
        return resultMap;
    }

    public Map<Colour,List<Car>> extractCarByColour(List<Car> carList, Colour colour ){
        Map<Colour, List<Car> >resultMap = new HashMap<>();
        for(Car car: carList){
            List<Car> carListWithSameColour = new ArrayList<>();
            if(colour.equals(car.getColour())){
                carListWithSameColour.add(car);
            }
            resultMap.put(colour, carListWithSameColour);
        }
        return resultMap;
    }
}

