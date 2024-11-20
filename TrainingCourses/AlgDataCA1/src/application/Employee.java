package application;

/*
* File name : Employee
* Author : Thomas Nolan
* Student number : C23775871
* Description of class : Employee Class in Application Package
*/

public class Employee {
    private int employeeNumber;
    private String name;
    private int yearsOfService;
    private String trainingCourse;

    public Employee(int employeeNumber, String name, int yearsOfService, String trainingCourse) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.yearsOfService = yearsOfService;
        this.trainingCourse = trainingCourse;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public String getTrainingCourse() {
        return trainingCourse;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + employeeNumber + ", Name=" + name + ", Years=" + yearsOfService + ", Course=" + trainingCourse + "]";
    }
}
