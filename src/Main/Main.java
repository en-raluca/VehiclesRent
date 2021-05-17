package Main;

import data.DataCreator;
import data.DataReader;
import manager.ClientManager;
import manager.RentManager;
import manager.VehicleManager;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {



        DataCreator dataCreator = new DataCreator();
        List<Rent> listOfRent = dataCreator.createListeOfRent();

        List<Client> listOfClient = dataCreator.createListOfClients();

         DataReader dataReader = new DataReader();
        List<Car> carList = dataReader.readCarsFromFile();
        List<ElectricScooter> electricScooterList = dataReader.readElectricScooterFromFile();


        ClientManager clientManager = new ClientManager();
        clientManager.updateClientEmail(listOfClient, 1, "pinteaionutb@yahoo.com");
        System.out.println(clientManager.findClient(listOfClient, 1));
        System.out.println(clientManager.extractRentIdByClient(listOfClient, listOfRent));


        VehicleManager vehicleManager = new VehicleManager();
        System.out.println(vehicleManager.isAnyCarWithXNumberOfDorsandSeats(carList,4,5));
        System.out.println(vehicleManager.extractCarByColour(carList, Colour.BLUE));
        Map<Integer,List<String>> met =  vehicleManager.extractClientByVehicleID(carList, listOfClient, listOfRent);
        System.out.println(met);
        vehicleManager.updateNrOfkm(carList, 2, 250000);
        vehicleManager.updateAvailability(carList, 7, false);
        vehicleManager.updatePricePerDay(carList, 5, 43.19);
        System.out.println(vehicleManager.getCarListThatHasMoreKmThen(carList, 100000));
        System.out.println("Lista tuturor masinilor este " + carList);
        boolean vehicleMethodResult = vehicleManager.searchCarByFeature(carList, "ABS");
        System.out.println(vehicleMethodResult + "\n");
        boolean vehicleMethodResult1 = vehicleManager.isAnyCarWithXNumberOfDorsandSeats(carList, 2, 2);
        System.out.println(vehicleMethodResult1+"\n");
        boolean vehicleMethodResult2 = vehicleManager.isAnyCarElectric(carList);
        System.out.println(vehicleMethodResult2+"\n");
        boolean vehicleMethodResult3 = vehicleManager.isCarWithLessKm(carList, 200000);
        System.out.println(vehicleMethodResult3+"\n");
        System.out.println(vehicleManager.getCarListCheaperThen(carList, 10.54));
        System.out.println(vehicleManager.getCarListWithSameColour(carList, Colour.RED));
        System.out.println(vehicleManager.getCarListWithSameFeature(carList,"ABS"));


        RentManager rentManager = new RentManager();
        rentManager.updateIfRentedCarIsReturned(listOfRent, 1, true);
        System.out.println(rentManager.findRentByReservationId(listOfRent, "102"));
        boolean rentMethod1 = rentManager.checkIfCarIsRented(listOfRent, 7);
        System.out.println(rentMethod1);
        boolean rentMethod2 = rentManager.searchCarRentedMoreThenXDays(listOfRent, 14);
        System.out.println(rentMethod2);
        System.out.println(rentManager.getCarListAvailabile(carList));
        System.out.println(rentManager.getCarListNeverRented(carList,listOfRent));
        System.out.println(rentManager.getMostRentedCars(carList,listOfRent));
        System.out.println(rentManager.getTheClientWithMostsRents(listOfClient,listOfRent));
        System.out.println(rentManager.getTheLongestRent(listOfRent));
        System.out.println(rentManager.getMostExpensiveRent(listOfRent));


    }
}
