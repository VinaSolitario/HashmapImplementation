class Employee {
    private String empNo;
    private String lastName;
    private String firstName;
    private String job; // Add job field
    private double salary;

    // Constructor
    public Employee(String empNo, String lastName, String firstName, String job, double salary) {
        this.empNo = empNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.job = job;
        this.salary = salary;
    }

    // Getter and setter methods
    public String getEmpNo() {
        return empNo;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
