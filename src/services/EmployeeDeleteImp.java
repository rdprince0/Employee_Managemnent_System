package services;

import data.EmployeeDAO;
import data.EmployeeDTo;
import util.EmployeeValidator;

import java.util.Scanner;

public class EmployeeDeleteImp implements EmployeeDelete {

    static final Scanner sc = new Scanner(System.in);
    @Override
    public void employeeDelete() {

        System.out.print("Enter employee Id you want to delete : ");
        Integer id = sc.nextInt();
        EmployeeValidator.idValidate(id);
        EmployeeDTo empDTo = new EmployeeDTo();
        empDTo.setEmployeeId(id);
        EmployeeDAO empDAO = new EmployeeDAO();
        empDAO.deleteEmployee(id);
        sc.close();

    }
}
