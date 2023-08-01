package com.example.admissionsservice.resources.models;

public class Employee {
    private String Id;
    private String firstName;
    private String lastName;
    private String specialities;

    public Employee(String id, String firstName, String lastName, String specialities) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialities = specialities;
    }

    public Employee() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialities() {
        return specialities;
    }

    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }
}
