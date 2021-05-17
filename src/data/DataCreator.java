package data;

import model.Car;
import model.Client;
import model.Colour;
import model.Rent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DataCreator {
    public List<Client> createListOfClients(){
        List<Client> clientList = new ArrayList<>();
        Client client1 = new Client("Pintea", "Bogdan", "1871229453189", 1, "Cluj-Napoca,Strada Rasaritului, nr 2",
                "0740881807","pinteabogdan@gmail.com",true);
        Client client2 = new Client("Pintea", "Madalina", "2910525456798", 2, "Brasov, Strada Salcamului, nr 7",
                "0754589639", "madalina@yahoo.com", false);
        Client client3 = new Client("Popescu", "Andrei", "1940518966798", 3, "Sibiu, Strada Andrei Saguna, nr 145",
                "0758536147", "andreip@yahoo.com", true);
        Client client4 = new Client("Florian", "Dan", "1750318914567", 4, "Cluj-Napoca, Strada Becas, nr 5",
                "0764611973", "danflorian@yahoo.com", true);
        Client client5 = new Client("Criste", "Denisa", "2990308856479", 5, "Plopis, Strada Principala, nr 43",
                "0775612895", "denisa.criste@gmail.com", true);
        Client client6 = new Client("Popa", "Ionut", "1950621465287", 6, "Zalau, Strada Narciselor, nr 13",
                "0740807881", "ionutpopa@yahoo.com", false);
        Client client7 = new Client("Chis", "Andreea", "2880309785264", 7, "Zalau, Strada Dimitrie Gusti, nr 75/B",
                "0757693424", "chisandreea@yahoo.com", true);
        Client client8 = new Client("Istrate", "Dan", "1991125756479", 8, "Carei, Strada Ion Creanga, nr 17",
                "0745689895", "dan.istratee@gmail.com", true);
        Client client9 = new Client("Gaga", "Toni", "1950730455287", 9, "Cluj Napoca, Strada Vanatorilor, nr 145",
                "0745681931", "toni_gaga@yahoo.com", true);
        Client client10 = new Client("Jula", "Ionut", "1840305376498", 10, "Bistrita, Strada Noua, nr 37",
                "0746852741", "jula_ionut@yahoo.com", true);
        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);
        clientList.add(client4);
        clientList.add(client5);
        clientList.add(client6);
        clientList.add(client7);
        clientList.add(client8);
        clientList.add(client9);
        clientList.add(client10);
        return clientList;

    }

    public List<Rent> createListeOfRent(){
        List<Rent> rentList = new ArrayList<>();
        LocalDateTime ldt = LocalDateTime.now();
        String stringDate1 = "18/08/2021 12:00:00";
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate1 = LocalDateTime.parse(stringDate1, dtf1);
        Rent rent1 = new Rent("101", 1, 1, 5, startDate1, 150.17, ldt, true);

        String stringDate2 = "25/08/2021 12:00:00";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate2 = LocalDateTime.parse(stringDate2, dtf2);
        Rent rent2 = new Rent("102", 1, 3, 7, startDate2, 450.45, ldt, true);

        String stringDate3 = "30/09/2021 12:00:00";
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate3 = LocalDateTime.parse(stringDate3, dtf3);
        Rent rent3 = new Rent("103", 3, 4, 14, startDate3, 703.79, ldt, true);

        String stringDate4 = "24/09/2021 12:00:00";
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate4 = LocalDateTime.parse(stringDate4, dtf4);
        Rent rent4 = new Rent("104", 3, 7, 2, startDate4, 57.94, ldt, false);

        String stringDate5 = "29/12/2021 12:00:00";
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate5 = LocalDateTime.parse(stringDate5, dtf5);
        Rent rent5 = new Rent("105", 4, 12, 6, startDate5, 79.85, ldt, true);

        String stringDate6 = "15/07/2021 12:00:00";
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate6 = LocalDateTime.parse(stringDate6, dtf6);
        Rent rent6 = new Rent("106", 5, 2, 7, startDate6, 54.64, ldt, true);

        String stringDate7 = "04/11/2021 12:00:00";
        DateTimeFormatter dtf7 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate7 = LocalDateTime.parse(stringDate7, dtf7);
        Rent rent7 = new Rent("107", 6, 8, 2, startDate7, 75.24, ldt, false);

        String stringDate8 = "04/11/2021 12:00:00";
        DateTimeFormatter dtf8 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate8 = LocalDateTime.parse(stringDate8, dtf8);
        Rent rent8 = new Rent("108", 8, 8, 10, startDate8, 267.78, ldt, true);

        String stringDate9 = "25/12/2021 12:00:00";
        DateTimeFormatter dtf9 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate9 = LocalDateTime.parse(stringDate9, dtf9);
        Rent rent9 = new Rent("109", 9, 9, 4, startDate9, 479.78, ldt, true);

        String stringDate10 = "06/12/2021 12:00:00";
        DateTimeFormatter dtf10 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime startDate10 = LocalDateTime.parse(stringDate10, dtf10);
        Rent rent10 = new Rent("110", 10, 9, 6, startDate10, 745.69, ldt, true);
        rentList.add(rent1);
        rentList.add(rent2);
        rentList.add(rent3);
        rentList.add(rent4);
        rentList.add(rent5);
        rentList.add(rent6);
        rentList.add(rent7);
        rentList.add(rent8);
        rentList.add(rent9);
        rentList.add(rent10);
        return rentList;


    }

}
