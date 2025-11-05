package services;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        Integer employeeID = sc.nextInt();
        System.out.println("Enter employee name");
        String name = sc.next();
        System.out.println("Enter employee job");
        String job = sc.next();
        System.out.println("Enter employee manager");
        String manager = sc.next();
        System.out.println("Enter employee hireDate");
        String hireDate = sc.next();
        System.out.println("Enter employee salary");
        Integer salary = sc.nextInt();
        System.out.println("Enter employee commission");
        Integer commission = sc.nextInt();
        System.out.println("Enter employee department number");
        Integer department = sc.nextInt();
    }
}
