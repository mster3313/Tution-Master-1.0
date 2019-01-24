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
public class StudentRegistryTest {
    
    public StudentRegistryTest() {
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
     * Test of showInterface method, of class StudentRegistry.
     */
    @Test
    public void testShowInterface() {
        System.out.println("showInterface");
        StudentRegistry instance = new StudentRegistry();
        instance.showInterface();
        
    }

    /**
     * Test of editTabel method, of class StudentRegistry.
     */
    @Test
    public void testEditTabel() {
        System.out.println("editTabel");
        int studentID = 0;
        StudentRegistry instance = new StudentRegistry();
        instance.editTabel(studentID);
        
    }

    /**
     * Test of deleteStudent method, of class StudentRegistry.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        StudentRegistry instance = new StudentRegistry();
        instance.deleteStudent();
        
    }

    /**
     * Test of searchStudent method, of class StudentRegistry.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        StudentRegistry instance = new StudentRegistry();
        instance.searchStudent();
        
    }

    
    
}
