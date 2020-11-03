package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName, lastName, department, company;
	private static String password;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// Constructor to receive first and last name
	public Email() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first and last name: ");
		firstName = scan.next();
		lastName = scan.next();
		System.out.println("Enter your department: ");
		department = scan.next();
		System.out.println("Enter your company name: ");
		company = scan.next();
		System.out.println("Name: " + firstName + " " + lastName + '.' + "\nDepartment: " + department + "\nCompany: "+ company);
		System.out.println("Email address: "+ firstName+lastName+'@'+department+"." + company + ".com");
	}
	
	// Generate a random 10 digit password
	// function to generate a random string of length n 
    public void createPassword() 
    { 
        // choose a random character from this String 
        password = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(10); 
        for (int i = 0; i < 10; i++) { 
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index = (int)(password.length() * Math.random()); 
            // add Character one by one in end of sb 
            sb.append(password.charAt(index)); 
        } 
       System.out.println("Your new password is: " + sb.toString());
    }
	
	// Set the mailbox capacity
    public void setMailCapacity() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter mailbox capacity: ");
    	mailboxCapacity = scan.nextInt();
    	System.out.println("Mailbox capacity is: " + mailboxCapacity);
    }
    public int getMailCapacity() {
    	return mailboxCapacity;
    }
    
	// Set alternate email
	public void setAltEmail() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an alternate email: ");
		alternateEmail = scan.next();
		System.out.println("Alternate Email: "+ alternateEmail);
	}
	public String getAltEmail() {
		return alternateEmail;
	}
	
	// Change the password
	public void setPassword() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Change your password: ");
		password = scan.next();
		System.out.println("New changed password is: "+ password);
	}

	// Methods to get name, email, and mailbox capacity
	public String getName() {
		return firstName + " " + lastName;
	}
	public String getEmail(){
		return firstName+lastName+'@'+department+"." + company + ".com";
	}
}
