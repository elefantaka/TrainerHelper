package dataBase;

import systemModel.IndividualLesson;

import java.io.*;
import java.util.ArrayList;

public class IndividualLessonFile {

    private ArrayList<IndividualLesson> individualLessons = new ArrayList<>();

    public void addIndividualLesson(IndividualLesson individualLesson) throws IOException {

        individualLessons.add(individualLesson);

        FileOutputStream fileOutputStream = new FileOutputStream("individualLesson.txt");

        ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);

        for(IndividualLesson i : individualLessons){

            obj.writeObject(i);
        }
        obj.close();
    }

    public void readIndividualLesson() throws IOException, ClassNotFoundException {

        individualLessons.clear();

        FileInputStream fileInputStream = new FileInputStream("individualLesson.txt");

        ObjectInputStream obj = new ObjectInputStream(fileInputStream);

        IndividualLesson i = (IndividualLesson) obj.readObject();

        try {
            while (i != null) {

                individualLessons.add(i);
                System.out.println("Individual lesson read correctly" + i);
                i = (IndividualLesson) obj.readObject();
            }
        }
        catch(Exception ex){
        }
        obj.close();
    }
}
