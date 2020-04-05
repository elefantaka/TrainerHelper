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
        Employee employee = new Employee(1, "Kasia", "kasia@wp.pl", KindOfInstructor.ZumbaInstructor);
        LessonDate lessonDate = new LessonDate(2020, 10, 12, 15);
        GroupLesson groupLesson = new GroupLesson(1, employee, KindOfLesson.Swimming, lessonDate, 5);
        //to do, do klasy groupLessonService, szuka id
        return groupLesson;
    }

    public void registerClient(Client client, int idGroup){
        GroupLesson foundLesson = findLesson(idGroup);
        foundLesson.recordTheClient(client);
        groupLessonService.saveGroupLesson();
    }

    //wyswietlanie, dodawanie nowych zajec, zapisywanie klientow
}
