package Main;

import data.DataCreator;
import data.DataReader;
import data.DataWriter;
import model.*;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(15, 75.56, 125636, true, Colour.BLACK);
        Client client1 = new Client("Pintea", "Bogdan", "1871229453189", 1, "Cluj-Napoca,Strada Rasaritului, nr 2",
                "0740881807","pinteabogdan@gmail.com",true);
        //1, 22.49, 105789, true, BLACK, CJ03PNT, AUDI, A6, MANUAL, AC; ESP; ABS; Leather seats; Backup camera, 5, 4, false, DIESEL
        Car car = new Car(1, 22.49, 105789, true,Colour.BLACK,"CJ03PNT","Audi","A6",GearType.MANUAL,
                Arrays.asList("AC; ESP; ABS; Leather seats; Backup camera"), 5,4,false, FuelType.DIESEL);

        String stringDate5 = "29/12/2021 12:00:00";
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate5 = LocalDateTime.parse(stringDate5, dtf5);
        Rent rent5 = new Rent("105", 4, 15, 6, startDate5, 79.85, ldt, true);
        DataWriter dw = new DataWriter();

        dw.generateRentFile(rent5,vehicle, client1,car );

        DataCreator dataCreator = new DataCreator();
        List<Rent> listOfRent = dataCreator.createListeOfRent();

        List<Client> listOfClient = dataCreator.createListOfClients();

        System.out.println(listOfRent);
        System.out.println(listOfClient);

        DataReader dataReader = new DataReader();
        List<Car> carList = dataReader.readCarsFromFile();
        List<ElectricScooter> electricScooterList = dataReader.readElectricScooterFromFile();

        System.out.println(carList);
        System.out.println(electricScooterList);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.addAll(carList);
        vehicleList.addAll(electricScooterList);

        System.out.println(vehicleList);


    }
}
