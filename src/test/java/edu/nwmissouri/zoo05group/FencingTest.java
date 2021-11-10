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
 * Test Fencing using JUnit5
 *
 * @author s545030
 */
public class FencingTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public FencingTest() {
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
     * Test of game method, of class Fencing.
     *
     * @throws Exception
     */
//    @Test
//    public void testgame() throws Exception {
//        String expected = "I Like to play Fencing.";
//        var fencing = new Fencing("Shashank", 2);
//        fencing.game();
//        String actual = outputStreamCaptor.toString().trim();
//        assertEquals(expected, actual);
//    }

    /**
     * Test of players method, of class Fencing.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testplayers() throws Exception {
        String expected = "Playing Fencing with 2 players";
        var fencing = new Fencing("Shashank", 2);
        fencing.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class Fencing.
     *
     * @throws Exception
     */
    @Test
    public void testPlay() throws Exception {
        String expected = "Fencing is a game of chance in which each player matches numbers printed in different arrangements on cards with the numbers the game host (caller) draws at random, marking the selected numbers with tiles.";
        var fencing = new Fencing("Shashank", 2);
        fencing.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of skill method, of class Fencing.
     *
     * @throws Exception
     */
    @Test
    public void testSkill() throws Exception {
        String expected = "Fencing is a game of chance and in any game that involves risk, there is a bit of luck and skill involved. While many may think the Fencing is pure luck and requires zero skill.";
        var fencing = new Fencing("Shashank", 2);
        fencing.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Rules method, of class Fencing.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRules() throws Exception {
        String expected = "A typical Fencing game utilizes the numbers 1 through 75. The five columns of the card are labeled 'B', 'I', 'N', 'G', and 'O' from left to right. The center space is usually marked \"Free\" or \"Free Space\", and is considered automatically filled.";
        var fencing = new Fencing("Shashank", 2);
        fencing.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Scoring method, of class Fencing.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testrScoring() throws Exception {
        String expected = "Fencing is a game of probability in which players mark off numbers on cards as the numbers are drawn randomly by a caller, the winner being the first person to mark off all their numbers.";
        var fencing = new Fencing("Shashank", 2);
        fencing.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}
