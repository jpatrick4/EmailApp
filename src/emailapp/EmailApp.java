package emailapp;
/*
 * The app should do the following:
 * -Generate an email with the following: firstname.lastname@department.company.com
 * -Determine the department: sales, development, accounting. If none leave blank
 * -Generate a random string for password
 * -Have set methods to change password, set mailbox capacity, and define alternate email address
 * -Have get methods to display name, email, and capacity
 * 
 */
public class EmailApp {
	public static void main(String[] args) {
		Email email = new Email();
		email.createPassword();
		email.setPassword();
		email.setAltEmail();
		email.getAltEmail();
		email.setMailCapacity();
		email.getMailCapacity();
	}
}
