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

    //find client, add client

    public void addAndSaveClient(Client client) throws IOException {
        ClientFile clientFile = new ClientFile();

        clients.add(client);

        clientFile.saveClients(clients);
    }

    public Client findClient(int idClient) {
        //petla for po liscie
    }
}
