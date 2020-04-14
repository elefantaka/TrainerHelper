package service;

import systemModel.Client;
import systemModel.GroupLesson;
import systemModel.Schedule;

import java.io.IOException;
import java.util.ArrayList;

public class Application implements InterApplication {

    private ClientService clientService;
    private EmployeeService employeeService;
    private Schedule schedule;

    public Application() throws IOException, ClassNotFoundException {

        clientService = new ClientService();
        employeeService = new EmployeeService();
        schedule = new Schedule();

    }

    public ArrayList<GroupLesson> getSchedule(){
        //daj plan zajec
        return schedule.getView();
    }

    //klikanie na jedna lekcje, na podstawie id lekcji
    public GroupLesson showLesson(int id){
        return schedule.findLesson(id);
    }

    //wpisuje id klienta
    public void registerClient(int idClient, int idGroup){
        Client client = clientService.findClient(idClient);
        schedule.registerClient(client, idGroup);
    }

    public void addNewClient(Client client) throws IOException {
        clientService.addAndSaveClient(client);
    }
}
