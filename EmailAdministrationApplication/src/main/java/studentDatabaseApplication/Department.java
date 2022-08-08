package studentDatabaseApplication;

import java.lang.reflect.Array;

public class Department {

    private static final String[] department = new String[] {"Sales","Development","Accounting","IT"};

    public static String[] getDepartment() {
        return department;
    }
}
