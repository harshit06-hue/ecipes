package com.lti.testcode;

import static org.junit.Assert.*;
import org.junit.Test;


import com.lti.junit.LoginService;

public class LoginServiceTest {

	 

    @Test
    public void testcase1() {
    
        LoginService l=new LoginService();
        boolean validOrnot = l.isValiduser("raj", "111");
        boolean expected=false;
        assertEquals(expected,validOrnot);
    }
    
    @Test
    public void testcase2() {
    
        LoginService l=new LoginService();
        boolean validOrnot = l.isValiduser("raj", "123");
        boolean expected=true;
        assertEquals(expected,validOrnot);
    }
    
    @Test
    public void testcase3() {
    
        LoginService l=new LoginService();
        boolean validOrnot = l.isValiduser("RAJ", "123");
        boolean expected=true;
        assertEquals(expected,validOrnot);
    }

}
