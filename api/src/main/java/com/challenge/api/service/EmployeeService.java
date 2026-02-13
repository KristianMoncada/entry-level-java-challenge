package com.challenge.api.service;

// Needed to generate UUID
import java.util.UUID;
import java.util.List;
import java.time.Instant;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;

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
        // UUID uuid2 = UUID.randomUUID();
        
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

    }

}