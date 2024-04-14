import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DepartmentReport {
    private HashMap<String, Department> departments;
    private HashMap<String, Employee> employees;

    // Constructor
    public DepartmentReport() {
        this.departments = new HashMap<>();
        this.employees = new HashMap<>();
    }

    // Method to create the report
    public void create() {
        readDepartments();
        readEmployees();
        readDeptEmp();
        printReport();
    }

    // Method to read department data from file
    private void readDepartments() {
        try (BufferedReader br = new BufferedReader(new FileReader("dep.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                departments.put(data[0].trim(), new Department(data[0].trim(), data[1].trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read employee data from file
    private void readEmployees() {
        try (BufferedReader br = new BufferedReader(new FileReader("emp.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                employees.put(data[0].trim(), new Employee(data[0].trim(), data[1].trim(), data[2].trim(), data[3].trim(), 0.0));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readDeptEmp() {
        try (BufferedReader br = new BufferedReader(new FileReader("deptemp.csv"))) {
            // Skip the header row
            br.readLine();
            
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String depCode = data[0].trim();
                String empNo = data[1].trim();
                double salary = Double.parseDouble(data[2].trim());
                // Update the total salary for the department
                departments.get(depCode).setDepTotalSalary(departments.get(depCode).getDepTotalSalary() + salary);
                // Set the salary for the employee
                employees.get(empNo).setSalary(salary);
                // Add the employee to the department
                departments.get(depCode).addEmployee(employees.get(empNo));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printReport() {
        for (Department department : departments.values()) {
            if (!department.getEmployees().isEmpty()) {
                System.out.println("---------------------Details -------------------------");
                System.out.println("EmpNo\t\t Employee Name\tJob\tSalary");
                for (Employee employee : department.getEmployees()) {
                    System.out.printf("%s\t\t%s, %s\t%s\t%.2f%n",
                            employee.getEmpNo(), employee.getLastName(), employee.getFirstName(), employee.getJob(), employee.getSalary());
                }
                System.out.println(); // Print an empty line between employee details and department info
                System.out.println("Department code: " + department.getDepCode());
                System.out.println("Department name: " + department.getDepName());
                System.out.printf("Department total salary: %.2f%n", department.getDepTotalSalary());
                System.out.println(); // Print an empty line between departments
            }
        }
    }
    
}    
