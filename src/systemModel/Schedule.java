package systemModel;

import service.GroupLessonService;

import java.util.ArrayList;

public class Schedule {
    private GroupLessonService groupLessonService;

    public ArrayList<GroupLesson> getView() {
        return groupLessonService.getGroupLessons();
        //na razie daje wszytsko, ale pozniej moze dawac mniej
    }

    public GroupLesson findLesson(int id) {
        //to do, do klasy groupLessonService, szuka id
        //return...
    }

    public void registerClient(Client client, int idGroup){
        GroupLesson foundLesson = findLesson(idGroup);
        foundLesson.recordTheClient(client);
        groupLessonService.saveGroupLesson();
    }

    //wyswietlanie, dodawanie nowych zajec, zapisywanie klientow
}
