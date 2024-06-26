package com.fazaulfath.assignment;

import com.fazaulfath.assignment.employees.Developer;
import com.fazaulfath.assignment.employees.Employee;
import com.fazaulfath.assignment.employees.Manager;
import com.fazaulfath.assignment.utilities.EmployeeUtilities;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class to demonstrate the usage of Employee, Manager, Developer, and EmployeeUtilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 90000, "HR");
        Developer developer = new Developer("Bob", 102, 80000, "Java");

        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(developer);

        EmployeeUtilities.printEmployeeDetails(employees);
        double totalSalary = EmployeeUtilities.calculateTotalSalary(employees);
        System.out.println("Total Salary: " + totalSalary);
    }
}
