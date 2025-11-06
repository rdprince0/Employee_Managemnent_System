package menu;

import data.EmployeeDAO;
import services.*;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    public static void main(String[] args
    ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Select an option");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employee Details");
        System.out.println("3. Update Employee");
        System.out.println("4. Detele Employee");
        System.out.println("5. Exit");
        System.out.print("Enter your choice : ");
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter Employee Data");
                EmployeeServiceImpl empDAO = new EmployeeServiceImpl();
                empDAO.addEmployee();
                break;
            case 2:
                EmployeeViewImpl empView = new EmployeeViewImpl();
                empView.viewEmployee();
                break;
            case 3:
                EmployeeUpdateImp empUpdate = new EmployeeUpdateImp();
                empUpdate.empUpdate();
                break;
            case 4:
                EmployeeDeleteImp  empDelete = new EmployeeDeleteImp();
                empDelete.employeeDelete();
                break;
            case 5:
                exit(0);
            default:
                System.out.println("Invalid option");
        }
    }
}
