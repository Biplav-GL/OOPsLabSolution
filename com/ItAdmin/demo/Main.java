package com.ItAdmin.demo;
import java.util.Scanner;
import com.ItAdmin.services.CredentialService;
import com.ItAdmin.beans.Employee;


public class Main {

    /* main Class */
    public static void main(String [] args) {
        /* Get the input from the user */
        Scanner input = new Scanner(System.in);
        System.out.println("Hello Enter your First Name");
        String firstName = input.next();
        System.out.println("Hello Enter your Last Name");
        String lastName = input.next();
        System.out.println("Please Select the department from the following\n 1. Technical \n 2. Admin \n 3. Human Resource \n 4. Legal");
        Integer departmentNumber = input.nextInt();

        /* Create the parameterized Employee Object */
        Employee employee = new Employee(firstName, lastName, departmentNumber);

        /* Create Object for Credential Services */
        CredentialService  credServ = new CredentialService();

        /* Calling the Method from Credential Service */
        credServ.showCredentials(employee);
    }
}
