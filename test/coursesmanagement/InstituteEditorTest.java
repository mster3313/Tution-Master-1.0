/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursesmanagement;

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
public class InstituteEditorTest {
    
    public InstituteEditorTest() {
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
     * Test of hasSameInstitute method, of class InstituteEditor.
     */
    @Test
    public void testHasSameInstitute() {
        System.out.println("hasSameInstitute");
        String institute = "YMBA";
        String city = "kurunegala";
        InstituteEditor instance = new InstituteEditor();
        boolean expResult = true;
        boolean result = instance.hasSameInstitute(institute, city);
        assertEquals(expResult, result);
        
    }

    
}
