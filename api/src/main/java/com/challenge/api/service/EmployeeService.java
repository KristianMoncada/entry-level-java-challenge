package com.challenge.api.service;

// Needed to generate UUID
import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

// Service layer that provides the business logic for the controller

@Service
public class EmployeeService {
    // Create list of type Employee and add mock employees
    private List<Employee> employees = new ArrayList<>();
    // Constructor for initializing employees and providing them wtih values
    public EmployeeService() {
        Employee employee1 = new EmployeeImpl();
        Employee employee2 = new EmployeeImpl();

        // Generates random UUID for each employee
        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();

        employee1.setUuid(uuid1);
        employee1.setFirstName("Kristian");
        employee1.setLastName("Moncada");
        employee1.setFullName("Kristian Moncada");
        employee1.setSalary(50000);
        employee1.setAge(22);
        employee1.setJobTitle("Shift Supervisor");
        employee1.setEmail("kristianmoncada@outlook.com");
        employee1.setContractHireDate(Instant.parse("2024-01-14T00:00:00Z"));
        employee1.setContractTerminationDate(null);
        employees.add(employee1);

        employee2.setUuid(uuid2);
        employee2.setFirstName("John");
        employee2.setLastName("Doe");
        employee2.setFullName("John Doe");
        employee2.setSalary(65000);
        employee2.setAge(29);
        employee2.setJobTitle("Team Manager");
        employee2.setEmail("johndoe@outlook.com");
        employee2.setContractHireDate(Instant.parse("2022-03-10T00:00:00Z"));
        employee2.setContractTerminationDate(Instant.parse("2023-08-01T00:00:00Z"));
        employees.add(employee2);
    }
    // Returns list
    public List<Employee> getAllEmployees() {
        return employees;
    }
    // Returns uuid of employee if exists
    public Employee getEmployeeByUuid(UUID uuid) {
        for (Employee employee : employees) {
            if (uuid.equals(employee.getUuid())) {
                return employee;
            }
        }

        return null;
    }
    // Creates Employee
    public Employee createEmployee(Object requestBody) {
        Employee newEmployee = new EmployeeImpl();
        UUID uuid = UUID.randomUUID();

        newEmployee.setUuid(uuid);

        
    }
}
