package data;

import model.Car;
import model.Client;
import model.Colour;

import java.util.ArrayList;
import java.util.List;

//creare de ob client
//List
public class DataCreator {
    public List<Client> createListOfClients(){
        List<Client> clientList = new ArrayList<>();
        Client client1 = new Client("Pintea", "Bogdan", "1871229453189", 1, "Cluj-Napoca,Strada Rasaritului, nr 2",
                740881807,"pinteabogdan@gmail.com",true);
        Client client2 = new Client("Pintea", "Madalina", "2910525456798", 2, "Brasov, Strada Salcamului, nr 7",
                754589639, "madalina@yahoo.com", false);
        Client client3 = new Client("Popescu", "Andrei", "1940518966798", 3, "Sibiu, Strada Andrei Saguna, nr 145",
                758536147, "andreip@yahoo.com", true);
        Client client4 = new Client("Florian", "Dan", "1750318914567", 4, "Cluj-Napoca, Strada Becas, nr 5",
                764611973, "danflorian@yahoo.com", true);
        Client client5 = new Client("Criste", "Denisa", "2990308856479", 5, "Plopis, Strada Principala, nr 43",
                775612895, "denisa.criste@gmail.com", true);
        Client client6 = new Client("Popa", "Ionut", "1950621465287", 6, "Zalau, Strada Narciselor, nr 13",
                740807881, "ionutpopa@yahoo.com", false);
        Client client7 = new Client("Chis", "Andreea", "2880309785264", 7, "Zalau, Strada Dimitrie Gusti, nr 75/B",
                757693424, "chisandreea@yahoo.com", true);
        Client client8 = new Client("Istrate", "Dan", "1991125756479", 8, "Carei, Strada Ion Creanga, nr 17",
                745689895, "dan.istratee@gmail.com", true);
        Client client9 = new Client("Gaga", "Toni", "1950730455287", 9, "Cluj Napoca, Strada Vanatorilor, nr 145",
                745681931, "toni_gaga@yahoo.com", true);
        Client client10 = new Client("Jula", "Ionut", "1840305376498", 10, "Bistrita, Strada Noua, nr 37",
                746852741, "jula_ionut@yahoo.com", true);
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

}
