package EmailAdminApplication;

import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private String emailAddress;
    private String alternateEmailAddress;
    private String password;
    private int maxMailboxCapacity = 100;
    private int currentEmailCapacity;

    public Employee(){}

    public Employee(String firstName,String lastName,String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
    public void generateEmailAddress(){
        this.emailAddress = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + ".company.com";
        System.out.println("The new email address of " + getLastName() + " " + getFirstName() + " " +"is " + getEmailAddress() );
        EmailList.getEmailList().add(getEmailAddress());
        System.out.println("The Email address was added to the database.");
    }
    public void generateAlternateEmailAddress(){
        System.out.println("Print your new alternative email address here: ");
        Scanner scanner = new Scanner(System.in);
        alternateEmailAddress = scanner.next();
    }
    public void generatePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*(";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        this.password = String.valueOf(password);
    }
    public void printEmail(){
        System.out.println("The Email address is: " + emailAddress + "\nThe Emailcapacity is:" + (maxMailboxCapacity - currentEmailCapacity));
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxMailboxCapacity() {
        return maxMailboxCapacity;
    }
    public void setMaxMailboxCapacity(int newCapacity){
        this.maxMailboxCapacity = newCapacity;
    }
    public void showInfo(){
        System.out.println("DISPLAY NAME: " + firstName + " " + lastName + "\nDISPLAY EMAIL: " + emailAddress + "\nDISPLAY EMAIL CAPACITY: " + maxMailboxCapacity);
    }
}
