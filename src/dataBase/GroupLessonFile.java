package dataBase;

import systemModel.Employee;
import systemModel.GroupLesson;

import java.io.*;
import java.util.ArrayList;

public class GroupLessonFile {

    private ArrayList<GroupLesson> groupLessons = new ArrayList<>();

    public void addGroupLesson(GroupLesson groupLesson) throws IOException {

        groupLessons.add(groupLesson);

        System.out.println(groupLesson);

        FileOutputStream fileStream = new FileOutputStream("groupLesson.txt");

        ObjectOutputStream obj = new ObjectOutputStream(fileStream);

        for(GroupLesson g : groupLessons) {

            obj.writeObject(g);
        }
        obj.close();
    }

    public void readGroupLesson() throws IOException, ClassNotFoundException {

        groupLessons.clear();

        FileInputStream fileStream = new FileInputStream("groupLesson.txt");

        ObjectInputStream obj = new ObjectInputStream(fileStream);

        GroupLesson g = (GroupLesson) obj.readObject();

        try {
            while (g != null) {
                groupLessons.add(g);
                System.out.println("Przeczytano pracownika " + g);
                g = (GroupLesson) obj.readObject();
            }
        }
        catch(Exception ex){
        }
        obj.close();
    }
}
