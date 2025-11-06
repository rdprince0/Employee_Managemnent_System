package services;

import java.util.Scanner;

public class EmployeeViewImpl implements EmployeeView {
    @Override
    public void viewEmployee() {
        ViewEmployee vEmp = new ViewEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Choice");
        System.out.println("1. View By Name");
        System.out.println("2. View By Employee ID");
        System.out.println("3. View By Job");
        System.out.print("Enter your choice : ");
        Integer choice = sc.nextInt();
        switch (choice) {
            case 1 -> vEmp.viewName();
            case 2 -> vEmp.viewId();
            case 3 -> vEmp.viewJob();
            default -> System.out.println("Invalid choice");
        }
    }
}
