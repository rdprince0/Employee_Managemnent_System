package util;

import data.EmployeeDTo;

public class EmployeeValidator {
    public static void validator(EmployeeDTo empDTo)
    {
        nameValidate(empDTo.getName());
        jobValidate(empDTo.getJob());
        managerValidate(empDTo.getManager());
        hiredateValidate(empDTo.getHireDate());
        salaryValidate(empDTo.getSalary());
        commValidate(empDTo.getCommission());
    }
    public static void idValidate(Integer id)
    {
        if(id == null || id<=0)
        {
            System.out.println("Invalid Employee ID");
            throw new IllegalArgumentException("Employee ID can not be null or negative");
        }
    }
    public static void nameValidate(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.err.println("Employee name should not be empty");
            throw new IllegalArgumentException("Employee name is null or empty");
        } else if (name.length() < 3 || name.length() > 45) {
            System.err.println("Invalid name length");
            throw new IllegalArgumentException("Employee name must be between 3 and 45 characters");
        }
    }
    public static void jobValidate(String job)
    {
        if (job == null || job.trim().isEmpty()) {
            System.err.println("Employee job should not be null or empty");
            throw new IllegalArgumentException("Employee job is null or empty");
        } else if (job.length() < 3 || job.length() > 45) {
            System.err.println("Invalid job length");
            throw new IllegalArgumentException("Employee job must be between 3 and 45 characters");
        }
    }
    public static void  managerValidate(Integer  manager)
    {
        if( manager == null || manager <= 0 )
        {
            System.err.println("Employee manager should not be negative");
            throw new IllegalArgumentException("Invalid employee manager number");
        }
    }
    public static void hiredateValidate(String hireDate)
    {
        if(hireDate == null || hireDate.trim().isEmpty())
        {
            System.err.println("HireDate Should not be null or empty");
            throw new IllegalArgumentException("Employee hire date is null or empty");
        }

    }
    public static void salaryValidate(Integer salary)
    {
        if(salary == null || salary <= 0 )
        {
            System.err.println("Employee Salary should not be negative");
            throw new IllegalArgumentException(" salary should not be negative");
        }
    }
    public static void commValidate(Integer commission)
    {
        if(commission !=null && commission <= 0 )
        {
            System.err.println("Employee Commission should not be negative");
            throw new IllegalArgumentException(" commission should not be negative");
        }
    }
}
