package data;

public class EmployeeDTo {
    private Integer employeeId;
    private String name;
    private String job;
    private Integer manager;
    private String hireDate;
    private Integer salary;
    private Integer commission;
//    private Integer deptNo;


    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

//    public Integer getDeptNo() {
//        return deptNo;
//    }

//    public void setDeptNo(Integer deptNo) {
//        this.deptNo = deptNo;
//    }
}
