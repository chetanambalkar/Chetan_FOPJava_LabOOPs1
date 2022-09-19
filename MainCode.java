package com.gl.main;

import java.util.Scanner;

import com.gl.service.Password;

import com.gl.model.Employee;

public class MainCode {
	private static char[] generatePassword;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee E1 =new Employee("Harshit", "Choudhary");
		
			System.out.println("Please enter the department from the following:\n 1.Technical\n 2.Admin\n 3.HR\n 4.legal");
			int code=sc.nextInt();
			 switch(code) {
	         case 1:
	         	System.out.println("The generated credentials are as follow");
				System.out.println("Email ID--->"+E1.getFirstName()+E1.getLastName()+"@tech.abc.com");
	         	break;
	         case 2:
	         	System.out.println("The generated credentials are as follow");
	    	    System.out.println("Email ID--->"+E1.getFirstName()+E1.getLastName()+"@admin.abc.com");
	      	    break;
	         case 3:
	            System.out.println("The generated credentials are as follow");
	 	        System.out.println("Email ID--->"+E1.getFirstName()+E1.getLastName()+"@HumanResource.abc.com");
	      	    break;
	         case 4:
	         	System.out.println("The generated credentials are as follow");
	 	        System.out.println("Email ID--->"+E1.getFirstName()+E1.getLastName()+"@Legal.abc.com");
	      	    break;   
	         default:System.out.println("Enter valid input"); 
			 
			}

	        generatePassword = Password.generatePassword();
	        System.out.println("Password---> "+generatePassword);
	
	}
}
