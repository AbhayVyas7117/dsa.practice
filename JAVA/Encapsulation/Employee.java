package Encapsulation;
// using this method we are using getter and setter method with encapsulation concept in java.

public class Employee {

    private int empId;
    private String empName;
    private String empDept;

    public int getempId() {
        return empId;
    }

    public void setempId(int empId) {
        this.empId = empId;
    }

    public String getempName() {
        return empName;
    }

    public void setempName(String empName) {
        this.empName = empName;
    }

    public String getempDept() {
        return empDept;
    }

    public void setempDept(String empDept) {
        this.empDept = empDept;
    }
}

class EmployeeDetails {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setempId(25068);
        emp.setempName(" Ananya");
        emp.setempDept(" CS");
        System.out.println("Employee Id: " + emp.getempId());
        System.out.println("Employee Name: " + emp.getempName());
        System.out.println("Employee Department: " + emp.getempDept());
    }
}
