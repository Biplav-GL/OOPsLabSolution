package com.ItAdmin.services;
import com.ItAdmin.beans.Employee;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

import java.util.Random;

public class CredentialService {


     public String generatePassword(){
          Random rand = new Random();
          final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@£$%^&*";
          StringBuilder sb = new StringBuilder();
          for (int i = 0; i < 8; i++)
          {
               int randomIndex = rand.nextInt(chars.length());
               sb.append(chars.charAt(randomIndex));
          }
          String finalPassword = sb.toString();
          return finalPassword;
     }

     public  String generateEmailAddress(Employee employee, int departmentNumber){
          String[]departments = {"Tech", "Admin", "HR", "Legal"};
          String department = departments[departmentNumber];
          return employee.getFirstName() +employee.getLastName()+"@"+department+".abc.com";
     }

     public String showCredentials(Employee employee, int departmentNumber){
          String initialMessage = "Dear " +  employee.getFirstName() + " your generated credential are as follows";
          String email = generateEmailAddress(employee, departmentNumber);
          String password = generatePassword();
          String emailAndPassword = "Email --> " + email +"\n" + "Password --> " + password;
          return initialMessage + "\n" + emailAndPassword;
     }
}
