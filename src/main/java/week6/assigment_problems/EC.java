package week6.assigment_problems;

class Employee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EC {
    public static void main(String[] args) {
        new Employee("Divya", 65000);
        new Employee("Arjun", 45000);
        new Employee("Rahul", 55000);
        Employee.printCompanyInfo();
    }
}