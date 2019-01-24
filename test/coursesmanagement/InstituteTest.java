/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursesmanagement;

import javax.swing.JButton;
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
public class InstituteTest {
    
    public InstituteTest() {
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
     * Test of deleteInstitute method, of class Institute.
     */
    @Test
    public void testDeleteInstitute() {
        System.out.println("deleteInstitute");
        Institute instance = new Institute();
        instance.deleteInstitute();
    }

    /**
     * Test of isEarlyAddedInstitute method, of class Institute.
     */
    @Test
    public void testIsEarlyAddedInstitute() {
        System.out.println("isEarlyAddedInstitute");
        String institute = "YMBA";
        String city = "Kurunegala";
        Institute instance = new Institute();
        boolean expResult = false;
        boolean result = instance.isEarlyAddedInstitute(institute, city);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of retrieveData method, of class Institute.
     */
    @Test
    public void testRetrieveData() {
        System.out.println("retrieveData");
        Institute instance = new Institute();
        instance.retrieveData();
        
    }

    
}
