package manager;

import model.Client;
import model.Rent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

}
