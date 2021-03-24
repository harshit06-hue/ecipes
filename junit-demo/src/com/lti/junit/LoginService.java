package com.lti.junit;
import java.util.HashMap;
public class LoginService { 
    public HashMap<String,String> users= new HashMap<String,String>();
    public LoginService() {
        users.put("raj", "123");
        users.put("shivam", "456");
        users.put("gaurav", "789");
    }
    
    //assumption username is not case sensitive but password is case sensitive
    
    public  boolean isValiduser(String username , String password) {
        
        if(users.containsKey(username.toLowerCase()) && users.containsValue(password))
            return true;
        else 
            return false;
        
    }
    
}