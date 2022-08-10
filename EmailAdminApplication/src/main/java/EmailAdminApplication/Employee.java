package EmailAdminApplication;

public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private String emailAddress;
    private String password;
    private int mailboxCapacity;

    public Employee(){}

    /**
     * 3.Have set methods to change password, set mailbox capacity, define alternate email address
     * 4.get methods to display name email and mailbox capacity
     */

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

    public String generatePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*(";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
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

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
}
