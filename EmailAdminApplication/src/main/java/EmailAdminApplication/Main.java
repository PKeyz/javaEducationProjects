package EmailAdminApplication;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    /**
     * https://www.youtube.com/watch?v=U3Ibvu0htNs&list=PLG7VJOKS5_G0usTijS3rIIRiCF32v5uHq
     * Scenario: create email accounts for new hires
     * 1.Generate an email with the following syntax: firstname.lastname@department.company.com
     * 2.Determine the department (sales,development,accounting,it), if none leave blank
     * 3.Have set methods to change password, set mailbox capacity, define alternate email address
     * 4.get methods to display name email and mailbox capacity
     */

            Employee employee = new Employee();
            Scanner scanner = new Scanner(System.in);
            EmailList emailList = new EmailList();

            System.out.println("Set new employees first name: ");
            employee.setFirstName(scanner.next());
            System.out.println("First name: " + employee.getFirstName());

            System.out.println("Set new employee last name: ");
            employee.setLastName(scanner.next());
            System.out.println("Last name: " + employee.getLastName());

            System.out.println("Departments in company: \n" + Arrays.toString(Department.getDepartment()));
            System.out.println("Set new employees department: ");
            employee.setDepartment(scanner.next());
            System.out.println("EmailAdminApplication.Department: " + employee.getDepartment());

            employee.generateEmailAddress();

        }
    }
