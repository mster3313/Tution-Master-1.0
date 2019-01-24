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
public class NewApplicationTest {
    
    public NewApplicationTest() {
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
     * Test of showInterface method, of class NewApplication.
     */
    @Test
    public void testShowInterface_0args() {
        System.out.println("showInterface");
        NewApplication instance = new NewApplication();
        instance.showInterface();
        
    }

    /**
     * Test of makeChangesAsEditor method, of class NewApplication.
     */
    @Test
    public void testMakeChangesAsEditor() {
        System.out.println("makeChangesAsEditor");
        NewApplication instance = new NewApplication();
        instance.makeChangesAsEditor();
        
    }

    /**
     * Test of retrieveCourseDetails method, of class NewApplication.
     */
    @Test
    public void testRetrieveCourseDetails() {
        System.out.println("retrieveCourseDetails");
        int stuID = 0;
        NewApplication instance = new NewApplication();
        instance.retrieveCourseDetails(stuID);
        
    }

    /**
     * Test of addCourse method, of class NewApplication.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        String course = "";
        String institute = "";
        String city = "";
        NewApplication instance = new NewApplication();
        instance.addCourse(course, institute, city);
        
    }

    /**
     * Test of getCourseTabelRow method, of class NewApplication.
     */
    @Test
    public void testGetCourseTabelRow() {
        System.out.println("getCourseTabelRow");
        NewApplication instance = new NewApplication();
        int expResult = 0;
        int result = instance.getCourseTabelRow();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCourseID method, of class NewApplication.
     */
    @Test
    public void testGetCourseID() {
        System.out.println("getCourseID");
        String courseName = "2018 REVISION";
        String institute = "YMBA";
        String city = "kurunegala";
        NewApplication instance = new NewApplication();
        int expResult = 3;
        int result = instance.getCourseID(courseName, institute, city);
        assertEquals(expResult, result);
        
    }

    
}
