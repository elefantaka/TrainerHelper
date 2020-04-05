package tests;

import dataBase.RecordsWebsiteFile;
import systemModel.Client;
import systemModel.SportLesson;

import java.io.IOException;
import java.util.ArrayList;

public class TestRecordsWebsiteFile {
    public static void main(String[] args) throws IOException {
        System.out.println("RecordsWebsiteFile Test");

        RecordsWebsiteFile recordsWebsiteFile = new RecordsWebsiteFile();

        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<SportLesson> sportLessons = new ArrayList<>();

        int clientId = 1;
        int lessonGroup = 1;

        //doesnt work correctly - for improvement
        recordsWebsiteFile.addGroupClientId(clientId, lessonGroup, clients, sportLessons);
    }
}
