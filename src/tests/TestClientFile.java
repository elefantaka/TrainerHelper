package tests;

import dataBase.ClientFile;
import systemModel.Client;

import java.io.IOException;

public class TestClientFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("ClientFile test");

        //arraylist to do

        ClientFile clientFile = new ClientFile();

        Client client = new Client(1, "Jacek", "jacek@wp.pl");
        Client client1 = new Client(2, "Michal", "michal@wp.pl");

        clientFile.saveClients(client);
        clientFile.saveClients(client1);

        clientFile.readClients();
    }
}
