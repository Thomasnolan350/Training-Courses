package application;

/*
* File name : Driver
* Author : Thomas Nolan
* Student number : C23775871
* Description of class : Driver Class in Application Package
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set; 

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrainingCourse course = new TrainingCourse("Advanced Java");
        Set<Integer> employeeNumbers = new HashSet<>();

        int numEmployees = getValidIntInput(scanner, "Enter the number of employees (1-10): ", 1, 10);

        for (int i = 0; i < numEmployees; i++) {
            int empNumber;
            while (true) {
                empNumber = getValidIntInput(scanner, "Enter Employee Number: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
                if (!employeeNumbers.contains(empNumber)) {
                    employeeNumbers.add(empNumber);
                    break;
                } else {
                    System.out.println("Employee number already exists. Please enter a unique number.");
                }
            }

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            int years = getValidIntInput(scanner, "Enter Years of Service: ", 0, Integer.MAX_VALUE);

            System.out.print("Enter Training Course: ");
            String trainingCourse = scanner.nextLine();

            Employee emp = new Employee(empNumber, name, years, trainingCourse);
            course.enrollEmployee(emp);
        }

        System.out.println("\nAll Employees:");
        course.displayEmployees();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Remove a specific employee by ID");
            System.out.println("2. Remove all employees from a specified course");
            System.out.println("3. Display remaining employees");
            System.out.println("4. Exit");

            int choice = getValidIntInput(scanner, "Enter your choice: ", 1, 4);

            switch (choice) {
                case 1: // Remove specific employee
                    int empNumberToRemove = getValidIntInput(scanner, "Enter Employee Number to remove: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
                    if (course.removeEmployee(empNumberToRemove)) {
                        employeeNumbers.remove(empNumberToRemove);
                        System.out.println("Employee removed successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 2: // Remove all employees from a course
                    System.out.print("Enter the name of the course to clear: ");
                    String courseToRemove = scanner.nextLine();
                    course.removeEmployeesByCourse(courseToRemove);
                    System.out.println("All employees from the course \"" + courseToRemove + "\" have been removed.");
                    break;

                case 3: // Display remaining employees
                    System.out.println("\nRemaining Employees:");
                    course.displayEmployees();
                    break;

                case 4: // Exit
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int getValidIntInput(Scanner scanner, String prompt, int min, int max) {
        String input;
        int result;

        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (isValidInteger(input)) {
                result = Integer.parseInt(input);
                if (result >= min && result <= max) {
                    return result;
                } else {
                    System.out.println("Input out of range. Please enter a number between " + min + " and " + max + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    private static boolean isValidInteger(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c) && (c != '-' || input.indexOf('-') != 0)) {
                return false;
            }
        }
        return true;
    }
}