package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeMockData {
    private static final String[] DEPARTMENTS = {"Sales", "Marketing", "Engineering", "HR", "Finance"};
    private static final String[] NAMES = {"John", "Jane", "Bob", "Alice", "Mike", "Emily", "David", "Sarah", "Tom", "Emma"};
    private static final Random RANDOM = new Random();

    public static List<Employee> generateMockData(int numEmployees) {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numEmployees; i++) {
            int id = i + 1;
            String name = NAMES[RANDOM.nextInt(NAMES.length)];
            String dept = DEPARTMENTS[RANDOM.nextInt(DEPARTMENTS.length)];
            double salary = RANDOM.nextDouble() * 100000 + 50000; // Random salary between $50,000 and $150,000

            Employee employee = new Employee(id, name, dept, salary);
            employees.add(employee);
        }

        return employees;
    }

    public static void main(String[] args) {
        List<Employee> employees = generateMockData(100);

        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Department: " + employee.getDept());
            System.out.println("Salary: $" + employee.getSalary());
            System.out.println();
        }
    }
}