import java.util.HashMap;
public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<>();

    IDandPasswords(){

        logininfo.put("Adhim","12345");

    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}