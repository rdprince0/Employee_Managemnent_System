package services;

import data.EmployeeDAO;
import data.EmployeeDTo;
import util.EmployeeValidator;

import java.util.Scanner;

public class ViewEmployee {
    static final Scanner sc = new Scanner(System.in);
    static final EmployeeDTo empDTo = new EmployeeDTo();
    static final EmployeeDAO empDAo = new EmployeeDAO();
    public void viewName()
    {
        System.out.println("Enter employee name");
        String name = sc.nextLine();
        EmployeeValidator.nameValidate(name);
        empDTo.setName(name);
        System.out.println("Fetching the data....");
        empDAo.viewByName(empDTo.getName());
        sc.close();
    }
    public  void viewId()
    {
        System.out.println("Enter employee id");
        Integer id = sc.nextInt();
        EmployeeValidator.idValidate(id);
        empDTo.setEmployeeId(id);
        System.out.println("Fetching the data....");
        empDAo.viewById(empDTo.getEmployeeId());
        sc.close();

    }
    public void viewJob()
    {
        System.out.println("Enter employee job");
        String job = sc.nextLine();
        EmployeeValidator.jobValidate(job);
        empDTo.setJob(job);
        System.out.println("Fetching the data....");
        empDAo.viewByJob(empDTo.getJob());
        sc.close();
    }
}

