package Inheritance.multilevelinheritance;

public class Employee extends Person {

    int employeeId;
    double salary;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}