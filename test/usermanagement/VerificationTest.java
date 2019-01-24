/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mahendra
 */
public class VerificationTest {
    
    public VerificationTest() {
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
     * Test of showInterface method, of class Verification.
     */
    @Test
    public void testShowInterface() {
        System.out.println("showInterface");
        int wher = 0;
        Verification instance = new Verification();
        instance.showInterface(wher);
        
    }

    /**
     * Test of getUserName method, of class Verification.
     */
    // authantication testing
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Verification instance = new Verification();
        String expResult = "nadun";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        
        // check for another user name
        String anotherUser = "suresh";
        String result2 = instance.getUserName();
        assertNotSame(anotherUser, result2);
        
    }

    /**
     * Test of getUser method, of class Verification.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Verification instance = new Verification();
        instance.getUser();
        
    }

}
