package Inheritance;

class Employeee {

    private String Name;
    private double Salary;

    public Employeee(String Name, double Salary) {
        this.Name = Name;
        this.Salary = Salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        if (Salary > 0) {
            this.Salary = Salary;
        } else {
            System.out.println("Salary invalid");
        }
    }
}

public class HR {

    public static void main(String[] args) {
        Employeee E1 = new Employeee("Ananya", 50000);
        E1.setSalary(10000);
        E1.setSalary(-5000);
    }
}
