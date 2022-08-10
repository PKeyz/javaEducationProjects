package EmailAdminApplication;

import java.util.Scanner;

public class Department {

    private static final String[] department = new String[] {"Sales","Development","Accounting","IT"};

    public static String[] getDepartment() {
        return department;
    }

    public String getDepartmentFromEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email.");

        String s = scanner.next();
        String requiredString = s.substring(s.indexOf("@")+1 , s.indexOf("."));

        return requiredString;
    }
}
