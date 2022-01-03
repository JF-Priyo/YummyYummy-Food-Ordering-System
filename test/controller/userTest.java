/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Priyo
 */

public class userTest {
    
    public userTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of signIn method, of class user.
     */
    @Test
    public void testSignIn() {
        System.out.println("signIn");
        String userID = "7";
        String pass = "123";
        user instance = new user();
        instance.signIn(userID, pass);
        boolean expResult = true;
        boolean result = instance.signIn(userID, pass);
        assertEquals(expResult, result);

    }

    /**
     * Test of signup method, of class user.
     */
    @Test
    public void testSignup() {
        System.out.println("signup");
        String UserId = "7";
        String fName = "nargis";
        String lName = "azad";
        String email = "nargis@gmail.com";
        String address = "hatirpool";
        String pass = "123";
        String conpass = "123";
        user instance = new user();
        boolean expResult = true;
        boolean result = instance.signup(UserId, fName, lName, email, address, pass, conpass);
        assertEquals(expResult, result);
    }
    
}
