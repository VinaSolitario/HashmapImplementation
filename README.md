# HashmapImplementation
Overview
This Java program generates a department report based on data stored in CSV files. It reads information about departments, employees, and their relationships from separate CSV files, aggregates the data, and then prints a detailed report.

Features
Reads department data from a dep.csv file, including department code and name.
Reads employee data from an emp.csv file, including employee number, last name, first name, job title, and initial salary.
Reads department-employee relationship data from a deptemp.csv file, including department code, employee number, and salary.
Aggregates the data to calculate the total salary for each department.
Generates a detailed report that includes:
Employee details (employee number, name, job, and salary) for each department.
Department code, name, and total salary.
Instructions
Ensure that the CSV files (dep.csv, emp.csv, and deptemp.csv) are correctly formatted with the required information.
Compile and run the Main class to generate the department report.
Review the generated report in the console, which will display employee details grouped by department, along with department information and total salary for each department.
Requirements
Java Development Kit (JDK) installed on your system.
CSV files containing department, employee, and department-employee relationship data.
Usage
Clone the repository to your local machine.
Place the CSV files (dep.csv, emp.csv, and deptemp.csv) in the project directory.
Compile the Java files using the command javac *.java.
Run the program using the command java Main.
View the generated report in the console.
Sample Output: 
---------------------Details -------------------------
EmpNo            Employee Name  Job     Salary
E251            Natividad, Lisa HR Manager      66000.00
E252            Rosanto, Margareth      HR Specialist   25000.00

Department code: HR
Department name: Human Resource
Department total salary: 182000.00

---------------------Details -------------------------
EmpNo            Employee Name  Job     Salary
E370            Baldo, Jason    Team Leader     42000.00
E371            Hernandez, Timothy      Junior Accountant       29000.00
E372            Cruz, Ricardo   CPA     37000.00

Department code: FNC
Department name: Finance
Department total salary: 216000.00

---------------------Details -------------------------
EmpNo            Employee Name  Job     Salary
E123            Maxwell, John   Developer       30000.00
E124            Delos Reyes, Ernesto    Analyst 45000.00
E125            Ortiz, Manuel   Tester  51000.00

Department code: IT
Department name: Information Tech
Department total salary: 252000.00
