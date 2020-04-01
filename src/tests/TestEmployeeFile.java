package systemModel;

import dataBase.EmployeeFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Hello! I'm TrainerHelper");

        EmployeeFile employeeFile = new EmployeeFile();

        Employee employee;

        int id = 1;
        String name = "Kamila";
        String email = "kamila@wp.pl";
        KindOfInstructor instructor = KindOfInstructor.SwimmingInstructor;

        int id2 = 2;
        String name2 = "Basia";
        String email2 = "basia@wp.pl";
        KindOfInstructor instructor2 = KindOfInstructor.YogaInstructor;

        employeeFile.addEmployee(id, name, email, instructor);
        employeeFile.addEmployee(id2, name2, email2, instructor2);

        employeeFile.readEmployees();
    }
}
