package application; // Ensure the package is correct at the top

//import application.Employee; // Correct import

import java.util.Scanner;

public class TrainingCourses {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[10]; // Array to store up to 10 employees
        int numEmployees = 0;

        // Step 1: Ask user how many employees they want to input (between 1 and 10)
        System.out.print("How many employees would you like to enter (1-10): ");
        numEmployees = getValidNumber(scanner, 1, 10);

        // Step 2: Collect data for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            int employeeNumber = getValidNumber(scanner, 1, Integer.MAX_VALUE, "Enter employee number: ");
            scanner.nextLine();  // Consume newline after number input

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            int yearsWorking = getValidNumber(scanner, 0, Integer.MAX_VALUE, "Enter years working in the organization: ");

            System.out.print("Enter the name of the training course: ");
            String trainingCourse = scanner.nextLine();

            // Create the Employee object and store it in the array
            employees[i] = new Employee(employeeNumber, name, yearsWorking, trainingCourse);
        }

        // Step 3: Display the employees' information
        System.out.println("\nEmployee Information: ");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.println(employees[i].toString());
        }

        scanner.close();
    }

    // Helper method to get a valid integer from the user within a range
    public static int getValidNumber(Scanner scanner, int min, int max) {
        int input = -1;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number: ");
            }
        }
    }

    // Overloaded method to get a valid integer with a custom prompt
    public static int getValidNumber(Scanner scanner, int min, int max, String prompt) {
        System.out.print(prompt);
        return getValidNumber(scanner, min, max);
    }
}

