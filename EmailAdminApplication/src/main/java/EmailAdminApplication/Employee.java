package EmailAdminApplication;

public class Employee {

    private String firstName;
    private String lastName;
    private String department;
    private String emailAddress;

    public Employee(){}

    public Employee(String firstName,String lastName,String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
    public void generateEmailAddress(){
        this.emailAddress = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + ".company.com";
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
}
//1.Generate an email with the following syntax: firstname.lastname@department.company.com