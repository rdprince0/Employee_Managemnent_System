package services;

import java.util.Scanner;

public class EmployeeUpdateImp implements EmployeeUdate {
    static final EmpUpdate ep = new EmpUpdate();

    @Override
    public void empUpdate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option");
        System.out.println("1. Update Salary ");
        System.out.println("2. Update Commission ");
        System.out.println("3. Update Job");
        System.out.print("Enter your choice : ");
        Integer choice = sc.nextInt();
        switch(choice) {
            case 1 -> ep.updateSalary();
            case 2 -> ep.updateComm();
            case 3 -> ep.updateEmpJob();
            default -> System.out.println("Invalid choice");
        }
    }
}
