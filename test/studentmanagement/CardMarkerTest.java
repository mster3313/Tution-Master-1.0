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
public class CardMarkerTest {
    
    public CardMarkerTest() {
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
     * Test of retrieveData method, of class CardMarker.
     */
    @Test
    public void testRetrieveData() {
        System.out.println("retrieveData");
        int what = CardMarker.NEW_DATA;
        CardMarker instance = new CardMarker();
        instance.retrieveData(what);
        
    }

}
