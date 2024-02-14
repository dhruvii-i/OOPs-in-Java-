package Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private Student[] students = new Student[10];
    private int size = 0;

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchByPRN();
                    break;
                case 4:
                    searchByName();
                    break;
                case 5:
                    updateStudent();
                    break;
                case 6:
                    deleteStudent();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
        scanner.close(); // Close scanner to prevent resource leak
    }

    private void displayMenu() {
        System.out.println("\n------ Menu ------");
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Search Student by PRN");
        System.out.println("4. Search Student by Name");
        System.out.println("5. Update Student");
        System.out.println("6. Delete Student");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addStudent() {
        System.out.println("\n------ Add Student ------");
        System.out.print("Enter PRN: ");
        int prn;
        try {
            prn = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid PRN format. Please enter a valid integer.");
            scanner.nextLine(); // Consume newline character
            return;
        }
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Date of Birth (DOB): ");
        String dob = scanner.nextLine();
        System.out.print("Enter Marks: ");
        double marks;
        try {
            marks = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Marks format. Please enter a valid number.");
            return;
        }

        students[size] = new Student(prn, name, dob, marks);
        size++;
        System.out.println("Student added successfully.");
    }

    private void displayStudents() {
        System.out.println("\n------ Display Students ------");
        if (size == 0) {
            System.out.println("No students found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i].display();
        }
    }

    private void searchByPRN() {
        System.out.println("\n------ Search Student by PRN ------");
        if (size == 0) {
            System.out.println("No students found.");
            return;
        }
        System.out.print("Enter PRN to search: ");
        int searchPRN;
        try {
            searchPRN = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine(); // Consume newline character
            return;
        }
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getPrn() == searchPRN) {
                System.out.println("Student found:");
                students[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + searchPRN + " not found.");
        }
    }

    private void searchByName() {
        System.out.println("\n------ Search Student by Name ------");
        if (size == 0) {
            System.out.println("No students found.");
            return;
        }
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equalsIgnoreCase(searchName)) {
                System.out.println("Student found:");
                students[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with name " + searchName + " not found.");
        }
    }

    private void updateStudent() {
        System.out.println("\n------ Update Student ------");
        if (size == 0) {
            System.out.println("No students found.");
            return;
        }
        System.out.print("Enter PRN of student to update: ");
        int updatePRN;
        try {
            updatePRN = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine(); // Consume newline character
            return;
        }
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getPrn() == updatePRN) {
                System.out.println("Enter new details for student:");
                System.out.print("Name: ");
                scanner.nextLine(); // Consume newline character
                String name = scanner.nextLine();
                System.out.print("Date of Birth (DOB): ");
                String dob = scanner.nextLine();
                System.out.print("Marks: ");
                double marks;
                try {
                    marks = scanner.nextDouble();
                } catch (InputMismatchException ex) {
                    System.out.println("Invalid marks format. Please enter a valid number.");
                    return;
                }
                students[i] = new Student(updatePRN, name, dob, marks);
                System.out.println("Student details updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + updatePRN + " not found.");
        }
    }

    private void deleteStudent() {
        System.out.println("\n------ Delete Student ------");
        if (size == 0) {
            System.out.println("No students found.");
            return;
        }
        System.out.print("Enter PRN of student to delete: ");
        int deletePRN;
        try {
            deletePRN = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.nextLine(); // Consume newline character
            return;
        }
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i].getPrn() == deletePRN) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                size--;
                System.out.println("Student with PRN " + deletePRN + " deleted successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + deletePRN + " not found.");
        }
    }
}
