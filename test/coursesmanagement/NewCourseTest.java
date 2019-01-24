/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursesmanagement;

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
public class NewCourseTest {
    
    public NewCourseTest() {
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
     * Test of showInterface method, of class NewCourse.
     */
    @Test
    public void testShowInterface_0args() {
        System.out.println("showInterface");
        NewCourse instance = new NewCourse();
        instance.showInterface();
        
    }
   
    /**
     * Test of isEarlyAddedCourse method, of class NewCourse.
     */
    @Test
    public void testIsEarlyAddedCourse() {
        System.out.println("isEarlyAddedCourse");
        String course = "2019 REVISION";
        String institute = "vision";
        String city = "kurunagala";
        NewCourse instance = new NewCourse();
        boolean expResult = false;
        boolean result = instance.isEarlyAddedCourse(course, institute, city);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hasSameCourse method, of class NewCourse.
     */
    @Test
    public void testHasSameCourse() {
        System.out.println("hasSameCourse");
        int selectedRow = 0;
        String course = "2020 REVISION";
        String institute = "Vision";
        String city = "Nugegoda";
        NewCourse instance = new NewCourse();
        boolean expResult = false;
        boolean result = instance.hasSameCourse(selectedRow, course, institute, city);
        assertEquals(expResult, result);
        
    }

    
    
}
