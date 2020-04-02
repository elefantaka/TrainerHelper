package tests;

import dataBase.IndividualLessonFile;
import systemModel.*;

import java.io.IOException;

public class TestIndividualLessonFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("IndividualLessonFile test");

        IndividualLessonFile individualLessonFile = new IndividualLessonFile();

        Employee employee = new Employee(1, "Renata", "renata@wp.pl", KindOfInstructor.SwimmingInstructor);

        LessonDate lessonDate = new LessonDate(2020, 3, 21, 12);

        Client client = new Client(1, "Ola", "ola@wp.pl");

        IndividualLesson individualLesson = new IndividualLesson(1, employee, KindOfLesson.Swimming, lessonDate, client);

        individualLessonFile.addIndividualLesson(individualLesson);

        individualLessonFile.readIndividualLesson();
    }
}
