package Projects;

import java.util.Scanner;

public class MarksMenuProgram {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 : Enter student marks");
            System.out.println("0 : Stop");
            System.out.print("Enter your choice (1 or 0): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter student marks (0-100). Enter -1 to go back to menu.");
                while (true) {
                    System.out.print("Marks: ");
                    int marks = scanner.nextInt();

                    if (marks == -1) {
                        System.out.println("Returning to menu...");
                        break;
                    } else if (marks < 0 || marks > 100) {
                        System.out.println("Invalid marks. Please enter a value between 0 and 100, or -1 to stop.");
                    } else if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (marks >= 60) {
                        System.out.println("This is also Good");
                    } else {
                        System.out.println("This is Good as well, Because marks don’t matter but our effort does.");
                    }
                }
            } else if (choice == 0) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice! Please enter 1 to continue or 0 to stop.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
