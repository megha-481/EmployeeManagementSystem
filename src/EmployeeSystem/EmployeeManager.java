package EmployeeSystem;

public class EmployeeManager {
 private Employee[] employees;
 private int size;

 public EmployeeManager(int capacity) {
     employees = new Employee[capacity];
     size = 0;
 }

 public void addEmployee(Employee employee) {
     if (size >= employees.length) {
         System.out.println("Array is full, cannot add more employees.");
         return;
     }
     employees[size++] = employee;
 }

 public Employee searchEmployeeById(int employeeId) {
     for (int i = 0; i < size; i++) {
         if (employees[i].getEmployeeId() == employeeId) {
             return employees[i];
         }
     }
     return null;
 }

 public void traverseEmployees() {
     for (int i = 0; i < size; i++) {
         System.out.println(employees[i]);
     }
 }

 public void deleteEmployeeById(int employeeId) {
     int index = -1;
     for (int i = 0; i < size; i++) {
         if (employees[i].getEmployeeId() == employeeId) {
             index = i;
             break;
         }
     }

     if (index == -1) {
         System.out.println("Employee with ID " + employeeId + " not found.");
         return;
     }

     for (int i = index; i < size - 1; i++) {
         employees[i] = employees[i + 1];
     }
     employees[size - 1] = null;
     size--;
 }
}
