package com.ItAdmin.services;
import com.ItAdmin.beans.Employee;

import java.util.Random;

public class CredentialService {
     public String generatePassword(){
          Random rand = new Random();
          System.out.println(rand.nextInt(1000));
          int firstUppercaseIndex = (int)'A'; // for uppercase
          int firstLowercaseIndex = (int)'a'; // for lowercase
          int letterIndex =rand.nextInt(26); // random number between 0 and 26
          char randomLowercase = (char) (firstLowercaseIndex + letterIndex);
          char randomUppercase = (char) (firstUppercaseIndex + letterIndex);
          System.out.println(randomLowercase);
          System.out.println(randomUppercase);

          return "randomPassword"; //TODO
     }

     public  String generateEmailAddress(Employee employee){
          return employee.firstName+employee.lastName+"@"+employee.department+".abc.com";
     }

     public void showCredentials(Employee employee){
          System.out.println("Dear " +  employee.firstName + " your generated credential are as follows");
          String email = generateEmailAddress(employee);
          String password = generatePassword();
          System.out.println("Email --> " + email +"\n" + "Password --> " + password);
     }
}
