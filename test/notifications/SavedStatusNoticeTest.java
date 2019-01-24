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
public class SavedStatusNoticeTest {
    
    public SavedStatusNoticeTest() {
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
     * Test of disposeMessage method, of class SavedStatusNotice.
     */
    @Test
    public void testDisposeMessage() {
        System.out.println("disposeMessage");
        SavedStatusNotice instance = new SavedStatusNotice();
        instance.disposeMessage();
        
    }

    
}
