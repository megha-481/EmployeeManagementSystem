package EmployeeSystem;

public class EmployeeManagerTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(1, "John Doe", "Developer", 60000));
        manager.addEmployee(new Employee(2, "Jane Smith", "Manager", 80000));
        manager.addEmployee(new Employee(3, "Alice Johnson", "Analyst", 55000));
        manager.addEmployee(new Employee(4, "Bob Brown", "Developer", 65000));

        System.out.println("All Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for employee with ID 3:");
        Employee e = manager.searchEmployeeById(3);
        if (e != null) {
            System.out.println(e);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting employee with ID 2:");
        manager.deleteEmployeeById(2);

        System.out.println("\nAll Employees after deletion:");
        manager.traverseEmployees();
    }
}
