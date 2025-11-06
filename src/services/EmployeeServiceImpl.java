package services;

import data.EmployeeDAO;
import data.EmployeeDTo;
import util.EmployeeValidator;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public void addEmployee() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Employee ID");
//        Integer employeeId = sc.nextInt();
        System.out.println("Enter employee name");
        String name = sc.next();
        System.out.println("Enter employee job");
        String job = sc.next();
        System.out.println("Enter employee manager");
        Integer manager = sc.nextInt();
        System.out.println("Enter employee hireDate");
        String hireDate = sc.next();
        System.out.println("Enter employee salary");
        Integer salary = sc.nextInt();
        System.out.println("Enter employee commission");
        Integer commission = sc.nextInt();
//        System.out.println("Enter employee department number");
//        Integer deptNo = sc.nextInt();

        EmployeeDTo empDto = new EmployeeDTo();
//        empDto.setEmployeeId(employeeId);
        empDto.setName(name);
        empDto.setJob(job);
        empDto.setManager(manager);
        empDto.setHireDate(hireDate);
        empDto.setSalary(salary);
        empDto.setCommission(commission);
//        empDto.setDeptNo(deptNo);

        System.out.println("Trying to save employee data");

        EmployeeValidator.validator(empDto);
        EmployeeDAO empDAo = new EmployeeDAO();
        empDAo.save(empDto);
        System.out.println("Employee data saved!!");
    }
}
