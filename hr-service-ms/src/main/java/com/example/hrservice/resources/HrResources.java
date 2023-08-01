package com.example.hrservice.resources;

import com.example.hrservice.resources.model.Employee;
import com.example.hrservice.resources.model.EmployeesList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hr")
public class HrResources {


    List<Employee> employees = Arrays.asList(
            new Employee("E1", "Kindson", "Munonye", "MediTech"),
            new Employee("E2", "Lila", "Hardcastle", "Surgery")
    );

    @RequestMapping("/employees")
    public EmployeesList getEmployees() {
        EmployeesList employeesList = new EmployeesList();

        employeesList.setEmployees(employees);

        return employeesList;
    }

    @RequestMapping("/employees/{Id}")
    public Employee getEmployeeById(@PathVariable("Id") String Id) {
        return employees.stream().filter(employee -> Id.equalsIgnoreCase(employee.getId())).findAny().orElse(null);
    }
}
