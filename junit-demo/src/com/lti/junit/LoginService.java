package com.lti.junit;

import java.util.HashMap;

public class LoginService {
   public  HashMap<String ,String> users=new HashMap<String,String>();
   public LoginService() {
	   users.put("harhit","123");
	   users.put("harhit1","1234");
	   users.put("harhit2","1235");
	   users.put("harhit3","1236");
   }
   public boolean isValidUser(String username, String password) {
	   //write the logic here to check if the username & valid or not
	   
   }
}
