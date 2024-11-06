package application;

public class Employee {
    private int employeeNumber;
    private String name;
    private int yearsWorking;
    private String trainingCourse;

    // Constructor
    public Employee(int employeeNumber, String name, int yearsWorking, String trainingCourse) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.yearsWorking = yearsWorking;
        this.trainingCourse = trainingCourse;
    }

    // Getters and Setters
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsWorking() {
        return yearsWorking;
    }

    public void setYearsWorking(int yearsWorking) {
        this.yearsWorking = yearsWorking;
    }

    public String getTrainingCourse() {
        return trainingCourse;
    }

    public void setTrainingCourse(String trainingCourse) {
        this.trainingCourse = trainingCourse;
    }

    // Override toString() method for displaying employee information
    @Override
    public String toString() {
        return "Employee Number: " + employeeNumber + "\n" +
               "Name: " + name + "\n" +
               "Years Working: " + yearsWorking + "\n" +
               "Training Course: " + trainingCourse;
    }
}