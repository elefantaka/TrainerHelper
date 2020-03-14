package systemModel;

public class Employee {

    protected int id;
    protected String name;
    protected String email;
    protected KindOfInstructor instructor;

    public Employee(int id, String name, String email, KindOfInstructor instructor) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}


