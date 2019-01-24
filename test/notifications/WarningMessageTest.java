/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifications;

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
public class WarningMessageTest {
    
    public WarningMessageTest() {
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
     * Test of showInterface method, of class WarningMessage.
     */
    @Test
    public void testShowInterface() {
        System.out.println("showInterface");
        String notice = "";
        WarningMessage instance = new WarningMessage();
        instance.showInterface(notice);
        
    }

    /**
     * Test of disposeMessage method, of class WarningMessage.
     */
    @Test
    public void testDisposeMessage() {
        System.out.println("disposeMessage");
        WarningMessage instance = new WarningMessage();
        instance.disposeMessage();
        
    }

    
}
