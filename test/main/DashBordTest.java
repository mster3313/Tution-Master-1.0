/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
public class DashBordTest {
    
    public DashBordTest() {
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
     * Test of showInterface method, of class DashBord.
     */
    @Test
    public void testShowInterface_0args() {
        System.out.println("showInterface");
        DashBord instance = new DashBord();
        instance.showInterface();
        
    }

    /**
     * Test of showInterface method, of class DashBord.
     */
    @Test
    public void testShowInterface_String() {
        System.out.println("showInterface");
        String userN = "";
        DashBord instance = new DashBord();
        instance.showInterface(userN);
        
    }

   
    
}
