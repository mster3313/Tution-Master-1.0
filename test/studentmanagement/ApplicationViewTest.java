/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

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
public class ApplicationViewTest {
    
    public ApplicationViewTest() {
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
     * Test of retrieveCourseDetails method, of class ApplicationView.
     */
    @Test
    public void testRetrieveCourseDetails() {
        System.out.println("retrieveCourseDetails");
        String stuID = "2";
        ApplicationView instance = new ApplicationView();
        instance.retrieveCourseDetails(stuID);
        
    }

}
