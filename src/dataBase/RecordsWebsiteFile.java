package dataBase;

import systemModel.Client;
import systemModel.SportLesson;

import java.io.*;
import java.util.ArrayList;

public class RecordsWebsiteFile {

    //musi korzystac z pliku ClientFile i GroupLesson + IndividualLesson, zeby znalezc odpowiednie id
    //DO POPRAWY!!!

    public void addGroupClientId(int clientId, int lessonId, ArrayList<Client> clients, ArrayList<SportLesson> sportLessons) throws IOException {

        File file = new File(Configuration.folder, Configuration.recordsWebsiteFile);

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);

        for(Client c : clients){
            if(c.getId() == clientId){
                obj.writeObject(c);
            }
        }

        for(SportLesson s : sportLessons){
            if(s.getId() == lessonId){
                obj.writeObject(s);
            }
        }

        obj.close();
    }

    //read objects
}
