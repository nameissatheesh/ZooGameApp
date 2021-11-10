package edu.nwmissouri.zoo05group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test DogAndBone using JUnit5
 *
 * @author s545031
 */
public class DogAndBoneTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public DogAndBoneTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
    }

  /**
   * 
   * @throws Exception 
   */
    @Test
    public void testplayers() throws Exception {
        String expected = "Playing DogAndBone with 6";
        var dogAndBone = new DogAndBone("Keerthana", 6);
        dogAndBone.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    /**
     * 
     * @throws Exception 
     */

    @Test
    public void testPlay() throws Exception {
        String expected = "DogAndBone is a game which is played by two different groups with bone in the circle";
        var dogAndBone = new DogAndBone("Keerthana", 6);
        dogAndBone.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testSkill() throws Exception {
        String expected = "DogAndBone needs full concentration on bone to get the bone from circle";
        var dogAndBone = new DogAndBone("Keerthana", 6);
        dogAndBone.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testRules() throws Exception {
        String expected = "Each one person will come from each group and will play for the bone, the person who takes the bone will get a point.";
        var dogAndBone = new DogAndBone("Keerthana", 6);
        dogAndBone.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testrScoring() throws Exception {
        String expected = "For each win the team gets 1 point and finally at the end highest points group wins!!";
        var dogAndBone = new DogAndBone("Keerthana", 6);
        dogAndBone.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}


