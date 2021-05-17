package manager;

import model.Client;
import model.Rent;

import java.util.*;

public class ClientManager {
    //UPDATE

    public void updateClientEmail(List<Client> clientList, int clientID, String newEmail) {
        for (Client client : clientList) {
            if (client.getId() == clientID) {
                client.setEmail(newEmail);
            }
        }
    }

    //Find Search

    public Client findClient(List<Client> clientList, int id){
        Client client = null;
        for(Client c : clientList){
            if(c.getId()== id){
                client=c;
            }
        }
        return client;

    }
    //Map
    public Map<Integer,List<String>> extractRentIdByClient(List<Client> clientList,List<Rent> rentList ){
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for(Client c : clientList){
            List<String> clientRentList = new ArrayList<>();
            for(Rent rent : rentList){
                if(c.getId()==rent.getClientId()){
                    clientRentList.add(rent.getReservationId());
                }
            }
            resultMap.put(c.getId(),clientRentList);
        }

        return resultMap;
    }
    //Remove/Add
    public void addAClient(List<Client> clientList, Client client){
        clientList.add(client);
    }

    public void removeAClientById(int clientId, List<Client> clientList){
        Client clientToBeRemoved = null;
        for(Client c : clientList){
            if(c.getId() == clientId){
                clientToBeRemoved = c;
            }
        }
        clientList.remove(clientToBeRemoved);
    }

    public void removeClient(List<Client> clientList, Client clientToBeDeleted){
        Iterator<Client> iterator = clientList.iterator();
        while (iterator.hasNext()){
            Client client1 = iterator.next();
            if(client1.getId() == clientToBeDeleted.getId()){
                clientList.remove(client1);
            }
        }
    }

}

