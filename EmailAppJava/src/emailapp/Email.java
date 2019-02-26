package emailapp;

import java.util.Scanner;

public class Email {
private String firstName;
private String lastName;
private String password;
private String email;
private String department;
private int mailBoxCapacity = 500;
private int defaultPasswordLength = 10;
private String alternateEmail;
private String companySyffix = "yourcompany.com";

public Email(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;

	this.department = setDepartment();
	System.out.println("DEPARTMENT " + this.department);
	this.password = randomPassword(defaultPasswordLength);
	
	email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" + department + "." + companySyffix;
	
}
	
private String setDepartment() {
	System.out.println("New worker: " + firstName + 
			"\nDEPARTMENTS CODES\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\nEnter department code");
	Scanner scanner = new Scanner (System.in);
	int departmentChoice = scanner.nextInt();
	if (departmentChoice == 1) {
		return "Sales";}
		else if (departmentChoice == 2) {
			return "Development";}
		else if (departmentChoice == 3) {
			return "Accounting";}
		else {return "";}
	}
private String randomPassword (int lenght) {
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()";
	char [] password = new char[lenght];
	for (int i =0; i <lenght; i ++ ) {
		int random = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(random);
	
	}
	return new String(password);
	
}

public void setMailBoxCapacity (int capacity) {
	this.mailBoxCapacity = capacity;
}

public void setAlternateEmail(String alternateEmail) {
	this.alternateEmail = alternateEmail;
}

public int getMailBoxCapacity() {
	return mailBoxCapacity;
}

public String getAlternateEmail() {
	return alternateEmail;
}

public String getPassword() {
	return password;
}

public String showInfo () {
	return "DISPLAY NAME: " + firstName + " " + lastName +
			" \nCompany email: " + email + 
			"\nMAILBOX CAPACITY " + mailBoxCapacity + "mb";
}

}
