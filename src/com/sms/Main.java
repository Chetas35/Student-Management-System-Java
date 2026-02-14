package com.sms;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1: // Add Student
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter branch: ");
                    String branch = sc.nextLine();

                    Student s = new Student(name, age, branch);

                    if (dao.addStudent(s)) {
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Failed to add student.");
                    }
                    break;

                case 2: // View Students
                    List<Student> list = dao.getAllStudents();

                    if (list.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\nID\tName\tAge\tBranch");
                        for (Student st : list) {
                            System.out.println(st.getId() + "\t" +
                                               st.getName() + "\t" +
                                               st.getAge() + "\t" +
                                               st.getBranch());
                        }
                    }
                    break;

                case 3: // Update Student
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new branch: ");
                    String newBranch = sc.nextLine();

                    Student us = new Student(newName, newAge, newBranch);
                    us.setId(uid); // 👈 important

                    if (dao.updateStudent(us)) {
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Update failed. Check ID.");
                    }
                    break;

                case 4: // Delete Student
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();

                    if (dao.deleteStudent(did)) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Delete failed. Check ID.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting... Bye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

