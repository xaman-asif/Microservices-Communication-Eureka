package com.example.admissionsservice.resources.models;

import java.util.List;

public class EmployeesList {
    public List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
