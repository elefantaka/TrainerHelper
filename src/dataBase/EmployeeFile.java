package dataBase;

import systemModel.Employee;
import systemModel.KindOfInstructor;

import java.io.*;
import java.util.ArrayList;

public class EmployeeFile {

    private  ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee employees1) throws IOException {

        employees.add(employees1);

        System.out.println(employees);

        FileOutputStream fileStream = new FileOutputStream("employees.txt");

        ObjectOutputStream obj = new ObjectOutputStream(fileStream);

            for(Employee e : employees) {

                obj.writeObject(e);
            }
        obj.close();
    }

    public void readEmployees() throws IOException, ClassNotFoundException {

        employees.clear();

        FileInputStream fileStream = new FileInputStream("employees.txt");

        ObjectInputStream obj = new ObjectInputStream(fileStream);

        Employee e = (Employee) obj.readObject();

            try {
                while (e != null) {
                    employees.add(e);
                    System.out.println("Employee readed correctly " + e);
                    e = (Employee) obj.readObject();
                }

            }
            catch(Exception ex){
        }
        obj.close();
    }
}
