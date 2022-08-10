package EmailAdminApplication;

import java.util.LinkedList;
import java.util.List;

public class EmailList {
    private static LinkedList<String> emailList = new LinkedList<>();

    public EmailList () {}


    public static LinkedList<String> getEmailList() {
        return emailList;
    }

    public void setEmailList(String email) {
        getEmailList().add(email);
    }
}
