/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package edu.nwmissouri.zoo05group;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author S545113
 */
public class FencingGroupTest {
    
    public FencingGroupTest() {
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
     * Test of create method, of class GolfGroup.
     */
    @org.junit.jupiter.api.Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = BadmintonGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class GolfGroup.
     */
    @org.junit.jupiter.api.Test
    public void testGroupRun() {
        BadmintonGroup.create();
        BadmintonGroup.run();
        assertTrue(true);
    }
    
    
}
