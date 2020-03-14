package systemModel;

import java.util.Arrays;

public class GroupLesson extends SportLesson {

    private int maxGroupSize;
    private int currentGroupSize;
    private Client[] recordedClient;

    public GroupLesson(int id, Employee employee, KindOfLesson lesson, LessonDate date, int maxGroupSize) {
        super(id, employee, lesson, date);
        this.maxGroupSize = maxGroupSize;
        currentGroupSize = 0;
        recordedClient = new Client[maxGroupSize];
    }

    public boolean recordTheClient(Client client){
        if(maxGroupSize <= currentGroupSize){
            System.out.println("The client recorded incorrectly");
            return false;
        }
        else{
            recordedClient[currentGroupSize] = client;
            currentGroupSize++;
            System.out.println("The client recorded correctly");
            return true;
        }
    }

    @Override
    public String toString() {
        return "GroupLesson{" + super.toString() +
                "maxGroupSize=" + maxGroupSize +
                ", currentGroupSize=" + currentGroupSize +
                ", recordedClient=" + Arrays.toString(recordedClient) +
                '}';
    }
}
