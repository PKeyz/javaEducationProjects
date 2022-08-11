package EmailAdminApplication;

import java.util.LinkedList;

public class EmailList {
    private static LinkedList<String> emailList = new LinkedList<>();

    public EmailList () {}


    public static LinkedList<String> getEmailList() {
        return emailList;
    }

    public static void setEmailList(String email) {
        getEmailList().add(email);
    }
}
