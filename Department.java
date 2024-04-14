import java.util.ArrayList;
import java.util.List;

class Department {
    private String depCode;
    private String depName;
    private double depTotalSalary;
    private List<Employee> employees;

    // Constructor
    public Department(String depCode, String depName) {
        this.depCode = depCode;
        this.depName = depName;
        this.depTotalSalary = 0.0;
        this.employees = new ArrayList<>();
    }

    // Getter methods
    public String getDepCode() {
        return depCode;
    }

    public String getDepName() {
        return depName;
    }

    public double getDepTotalSalary() {
        return depTotalSalary;
    }

    public void setDepTotalSalary(double depTotalSalary) {
        this.depTotalSalary = depTotalSalary;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
        depTotalSalary += employee.getSalary();
    }
}