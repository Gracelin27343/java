package Inheritance.multilevelinheritance;

public class Manager extends Employee {

    String department;

    void displayManager() {
        System.out.println("Department: " + department);
    }
}