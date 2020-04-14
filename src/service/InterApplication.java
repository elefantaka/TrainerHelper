package service;

import systemModel.Client;
import systemModel.GroupLesson;

import java.io.IOException;
import java.util.ArrayList;

public interface InterApplication {

    //taki spis stron
    ArrayList<GroupLesson> getSchedule();
    GroupLesson showLesson(int id);
    void registerClient(int idClient, int idGroup); //formularz
    void addNewClient(Client client) throws IOException;
}
