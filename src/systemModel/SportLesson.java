package systemModel;

public class SportLesson {

    protected int id;
    protected Employee employee;
    protected KindOfLesson lesson;
    protected LessonDate date;

    public SportLesson(int id, Employee employee, KindOfLesson lesson, LessonDate date) {
        this.id = id;
        this.employee = employee;
        this.lesson = lesson;
        this.date = date;
    }

    @Override
    public String toString() {
        return "SportLesson{" +
                "id=" + id +
                ", employee=" + employee +
                ", lesson=" + lesson +
                ", date=" + date +
                '}';
    }
}
