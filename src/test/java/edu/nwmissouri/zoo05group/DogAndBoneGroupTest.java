/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo05group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test DogAndBone Group.
 * 
 * @author s545031
 */
public class DogAndBoneGroupTest {

    public DogAndBoneGroupTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class DogAndBoneGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = DogAndBoneGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class DogAndBoneGroup.
     */
    @Test
    public void testGroupRun() {
        DogAndBoneGroup.create();
        DogAndBoneGroup.run();
        assertTrue(true);
    }

}
