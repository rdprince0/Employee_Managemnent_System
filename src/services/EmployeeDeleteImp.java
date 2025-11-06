package services;

import data.EmployeeDAO;
import data.EmployeeDTo;
import util.EmployeeValidator;

import java.util.Scanner;

public class EmployeeDeleteImp implements EmployeeDelete {

    @Override
    public void employeeDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee Id you want to delete : ");
        Integer id = sc.nextInt();
        EmployeeValidator.idValidate(id);
        EmployeeDTo empDTo = new EmployeeDTo();
        empDTo.setEmployeeId(id);
        EmployeeDAO empDAO = new EmployeeDAO();
        empDAO.deleteEmployee(id);

    }
}
