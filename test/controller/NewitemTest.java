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

public class NewitemTest {
    
    public NewitemTest() {
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
     * Test of item method, of class Newitem.
     * @throws java.lang.Exception
     */
    @Test
    public void testItem() throws Exception {
        System.out.println("item");
        String name = "Hotdog";
        String price = "90";
        String id = "122";
        Newitem instance = new Newitem();
        boolean expResult = false;
        boolean result = instance.item(name, price, id);
        assertEquals(expResult, result);
    }
    
}
