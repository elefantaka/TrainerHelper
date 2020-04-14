package service;

import dataBase.ClientFile;
import systemModel.Client;

import java.io.IOException;
import java.util.ArrayList;

public class ClientService {

    private ArrayList<Client> clients = new ArrayList<>();

    public ClientService() throws IOException, ClassNotFoundException {

        ClientFile clientFile = new ClientFile();
        clients = clientFile.readClients();
    }

    private int findMaxID(){
        int maxID = 0;
        for(Client c : clients){
            if(c.getId() > maxID){
                maxID = c.getId();
            }
        }
        return maxID;
    }

    public void addAndSaveClient(Client client) throws IOException {
        ClientFile clientFile = new ClientFile();

        int newID = findMaxID() + 1;

        client.setId(newID);

        clients.add(client);

        clientFile.saveClients(clients);
    }

    public Client findClient(int idFindClient) {

        for(Client c : clients){
            if(c.getId() == idFindClient){
                return c;
            }
        }
        return null;
    }
}
