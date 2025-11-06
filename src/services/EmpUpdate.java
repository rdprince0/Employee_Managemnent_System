package services;

import data.EmployeeDAO;
import data.EmployeeDTo;
import util.EmployeeValidator;

import java.util.Scanner;

public class EmpUpdate {
    static final EmployeeDTo empDTo = new EmployeeDTo();
    static final EmployeeDAO empDAO = new EmployeeDAO();
    static final Scanner sc = new Scanner(System.in);
    public void updateSalary() {

        System.out.println("Enter Employee ID");
        Integer id = sc.nextInt();
        System.out.println("Enter Employee new Salary");
        Integer newSalary = sc.nextInt();
        EmployeeValidator.idValidate(id);
        EmployeeValidator.salaryValidate(newSalary);
        empDTo.setEmployeeId(id);
        empDTo.setSalary(newSalary);
        empDAO.updateSalary(id, newSalary);
    }
    public void updateComm()
    {
        System.out.println("Enter Employee ID");
        Integer id = sc.nextInt();
        System.out.println("Enter Employee new Commission");
        Integer newComm = sc.nextInt();
        EmployeeValidator.idValidate(id);
        EmployeeValidator.salaryValidate(newComm);
        empDTo.setEmployeeId(id);
        empDTo.setCommission(newComm);
        empDAO.updateCm(id, newComm);
    }
    public void updateEmpJob()
    {
        System.out.println("Enter Employee ID");
        Integer id = sc.nextInt();
        System.out.println("Enter Employee new Job");
        String newJob = sc.next();
        EmployeeValidator.idValidate(id);
        EmployeeValidator.jobValidate(newJob);
        empDTo.setEmployeeId(id);
        empDTo.setJob(newJob);
        empDAO.updateJob(id, newJob);
    }
}
