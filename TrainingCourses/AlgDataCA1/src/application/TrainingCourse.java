package application;

/*
* File name : TrainingCourse
* Author : Thomas Nolan
* Student number : C23775871
* Description of class : TrainingCourse Class in Application Package
*/

import util.LinkedList;
import java.util.ArrayList;

public class TrainingCourse {
    private String courseName;
    private ArrayList<Employee> employees;

    public TrainingCourse(String courseName) {
        this.courseName = courseName;
        this.employees = new ArrayList<>();
    }

    public void enrollEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(int employeeNumber) {
        for (Employee emp : employees) {
            if (emp.getEmployeeNumber() == employeeNumber) {
                employees.remove(emp);
                return true;
            }
        }
        return false;
    }

    // New method to delete all employees from a specific course
    public void removeEmployeesByCourse(String courseName) {
        employees.removeIf(emp -> emp.getTrainingCourse().equalsIgnoreCase(courseName));
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees enrolled.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }
}
