package com.ItAdmin.beans;

public class Employee {

    private String firstName;
    private String lastName;

    // Getter
    public String getFirstName() {
        return firstName;
    }

    /* -> commenting as we are setting the params using Constructor
    // Setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
     */

    // Getter
    public String getLastName() {
        return lastName;
    }

    /* -> commenting as we are setting the params using Constructor
    // Setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
     */


    public Employee(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
