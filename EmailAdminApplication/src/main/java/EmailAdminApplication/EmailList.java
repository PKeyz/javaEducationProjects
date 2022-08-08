package EmailAdminApplication;

import java.util.ArrayList;

public class EmailList {
    private ArrayList<String> emailList = new ArrayList<>();

    public EmailList () {}


    public ArrayList<String> getEmailList() {
        return emailList;
    }

    public void setEmailList(ArrayList<String> emailList) {
        this.emailList = emailList;
    }
}
