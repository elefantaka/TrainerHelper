package tests;

import dataBase.GroupLessonFile;
import systemModel.*;

import java.io.IOException;

public class TestGroupLessonFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("GroupLessonFile Test");

        GroupLessonFile groupLessonFile = new GroupLessonFile();

        Employee employee = new Employee(1, "Kasia", "kasia@wp.pl", KindOfInstructor.YogaInstructor);

        LessonDate lessonDate = new LessonDate(2020, 3, 3, 13);

        GroupLesson groupLesson = new GroupLesson(1, employee, KindOfLesson.BallRoomDancing, lessonDate, 5);

        Client client = new Client(1, "Ewa", "ewa@wp.pl");

        groupLesson.recordTheClient(client);

        groupLessonFile.addGroupLesson(groupLesson);

        groupLessonFile.readGroupLesson();
    }
}
