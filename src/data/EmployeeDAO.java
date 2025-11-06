package data;
import java.sql.*;

public class EmployeeDAO {
    private static final String dbUrl = "jdbc:mysql://localhost/ems";
    private static final String username = "root";
    private static final String password = "Root@123";



    public void save(EmployeeDTo empDto)
    {
        String sql = "insert into ems.emp (ename,job,mgr,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,null)";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,username,password);
            PreparedStatement presmt = connection.prepareStatement(sql);
//            presmt.setInt(1,empDto.getEmployeeId());
            presmt.setString(1,empDto.getName());
            presmt.setString(2,empDto.getJob());
            presmt.setInt(3,empDto.getManager());
            presmt.setString(4,empDto.getHireDate());
            presmt.setInt(5,empDto.getSalary());
            presmt.setInt(6,empDto.getCommission());
//            presmt.setInt(8,empDto.getDeptNo());
            presmt.executeUpdate();
        }
        catch(SQLException e)
        {
//            e.printStackTrace();
            System.out.println("Unable to connect to database");
        }
    }

    public void viewByName(String name)
    {
        String sql = "select * from ems.emp where ename = ?";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,username,password);
            PreparedStatement presmt = connection.prepareStatement(sql);
            presmt.setString(1,name);
            ResultSet resultSet = presmt.executeQuery();
            boolean recordFound = false;
            while(resultSet.next())
            {
                recordFound = true;
                int id = resultSet.getInt("empid");
                String empName = resultSet.getString("ename");
                String job = resultSet.getString("job");
                int manager = resultSet.getInt("mgr");
                String hiredate = resultSet.getString("hiredate");
                int salary = resultSet.getInt("sal");
                int commission = resultSet.getInt("comm");
                int deptno = resultSet.getInt("deptno");
                System.out.println("EmpId: "+id+" | Name: "+empName+" | Job: "+job+" | MGR No: "+manager+" | HireDate: "+hiredate+" | Salary: "+salary+" | Commission: "+commission+" | DeptNo: "+deptno);

            }
            if(!recordFound)
            {
                System.out.println("No records found.....");
            }

        }
        catch(SQLException e)
        {
//            e.printStackTrace();
            System.out.println("Unable to connect to database");
        }
    }

    public void viewById(Integer id)
    {
        String sql = "select * from ems.emp where empId = ?";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,username,password);
            PreparedStatement presmt = connection.prepareStatement(sql);
            presmt.setInt(1,id);
            ResultSet resultSet = presmt.executeQuery();
            boolean recordFound = false;
            while(resultSet.next())
            {
                recordFound = true;

                Integer eid = resultSet.getInt("empid");
                String empName = resultSet.getString("ename");
                String job = resultSet.getString("job");
                Integer manager = resultSet.getInt("mgr");
                String hiredate = resultSet.getString("hiredate");
                Integer salary = resultSet.getInt("sal");
                Integer commission = resultSet.getInt("comm");
                Integer deptno = resultSet.getInt("deptno");
                System.out.println("EmpId: "+id+" | Name: "+empName+" | Job: "+job+" | MGR No: "+manager+" | HireDate: "+hiredate+" | Salary: "+salary+" | Commission: "+commission+" | DeptNo: "+deptno);

            }
            if(!recordFound)
                {
                System.out.println("No records found.....");
                }
        }
        catch(SQLException e)
        {
//            e.printStackTrace();
            System.out.println("Unable to connect to database");
        }
    }
    public void viewByJob(String job)
    {
        String sql = "select * from ems.emp where job = ?";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,username,password);
            PreparedStatement presmt = connection.prepareStatement(sql);
            presmt.setString(1,job);
            ResultSet resultSet = presmt.executeQuery();
            boolean recordFound = false;
            while(resultSet.next())
            {
                 recordFound = true;
                Integer eid = resultSet.getInt("empid");
                String empName = resultSet.getString("ename");
                String empjob = resultSet.getString("job");
                Integer manager = resultSet.getInt("mgr");
                String hiredate = resultSet.getString("hiredate");
                Integer salary = resultSet.getInt("sal");
                Integer commission = resultSet.getInt("comm");
                Integer deptno = resultSet.getInt("deptno");
                System.out.println("EmpId: "+eid+" | Name: "+empName+" | Job: "+empjob+" | MGR No: "+manager+" | HireDate: "+hiredate+" | Salary: "+salary+" | Commission: "+commission+" | DeptNo: "+deptno);

            }
            if(!recordFound)
            {
                System.out.println("No records found..........");
            }
        }
        catch(SQLException e)
        {
//            e.printStackTrace();
            System.out.println("Unable to connect to database");
        }
    }

    public void updateSalary(Integer id, Integer salary)
    {
        String sql = "update ems.emp set sal = ? where empId = ? ";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,username,password);
            PreparedStatement presmt = connection.prepareStatement(sql);
            presmt.setInt(1,salary);
            presmt.setInt(2,id);
            Integer rowEffected = presmt.executeUpdate();
            if(rowEffected > 0)
                System.out.println("Salary Updated.......");
            else
                System.out.println("Employee Not found.....");
        }
        catch(SQLException e)
        {
            System.out.println("Unable to connect to database");
        }
    }
    public void updateCm(Integer id, Integer commission)
    {
        String sql = "update ems.emp set comm = ? where empId = ? ";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,username,password);
            PreparedStatement presmt = connection.prepareStatement(sql);
            presmt.setInt(1,commission);
            presmt.setInt(2,id);
            Integer rowEffected = presmt.executeUpdate();
            if(rowEffected > 0)
                System.out.println("Commission  Updated.......");
            else
                System.out.println("Employee Not found...");
        }
        catch(SQLException e)
        {
            System.out.println("Unable to connect to database");
        }
    }
    public void updateJob(Integer id, String job)
    {
        String sql = "update ems.emp set job = ? where empId = ? ";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,username,password);
            PreparedStatement presmt = connection.prepareStatement(sql);
            presmt.setString(1,job);
            presmt.setInt(2,id);
            Integer rowEffected = presmt.executeUpdate();
            if(rowEffected > 0)
                System.out.println("Job Updated......");
            else
                System.out.println("Employee Not found......");
        }
        catch(SQLException e)
        {
            System.out.println("Unable to connect to database");
        }
    }


    public void deleteEmployee(Integer id)
    {
        String sql = "delete from ems.emp where empId = ?; ";
        try{
            Connection connection = DriverManager.getConnection(dbUrl,username,password);
            PreparedStatement presmt = connection.prepareStatement(sql);
            presmt.setInt(1,id);
            Integer rowEffected = presmt.executeUpdate();
            if(rowEffected > 0)
                System.out.println("Employee Deleted");
            else
                System.out.println("Employee Not  found.....");
        }
        catch(SQLException e)
        {
            System.out.println("Unable to connect to database");
        }
    }

}
