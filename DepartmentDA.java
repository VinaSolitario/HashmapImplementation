class DepartmentDA {
    // Method to create a new Department object from department data
    public Department createDepartment(String depCode, String depName) {
        return new Department(depCode, depName);
    }
}

// EmployeeDA class is a data access object for the Employee object
class EmployeeDA {
    // Method to create a new Employee object from employee data
    public Employee createEmployee(String empNo, String lastName, String firstName, String job, double salary) {
        return new Employee(empNo, lastName, firstName, job, salary);
    }
}