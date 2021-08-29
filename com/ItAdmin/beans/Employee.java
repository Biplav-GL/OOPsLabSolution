package com.ItAdmin.beans;

public class Employee {

    public String firstName;
    public String lastName;
    public String department;


    public Employee(String firstName, String lastName, int department){
        String[]departments = {"Tech", "Admin", "HR", "Legal"};
        this.firstName=firstName;
        this.lastName=lastName;
        this.department = departments[department];
    }
}
