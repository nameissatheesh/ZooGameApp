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
 * Test Rowing using JUnit5
 *
 * @author s545030
 */
public class RowingTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public RowingTest() {
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
     * Test of game method, of class Rowing.
     *
     * @throws Exception
     */
//    @Test
//    public void testgame() throws Exception {
//        String expected = "I Like to play Rowing.";
//        var rowing = new Rowing("Shashank", 2);
//        rowing.game();
//        String actual = outputStreamCaptor.toString().trim();
//        assertEquals(expected, actual);
//    }

    /**
     * Test of players method, of class Rowing.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testplayers() throws Exception {
        String expected = "Playing Rowing with 2 players";
        var rowing = new Rowing("Shashank", 2);
        rowing.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class Rowing.
     *
     * @throws Exception
     */
    @Test
    public void testPlay() throws Exception {
        String expected = "Rowing is a game of chance in which each player matches numbers printed in different arrangements on cards with the numbers the game host (caller) draws at random, marking the selected numbers with tiles.";
        var rowing = new Rowing("Shashank", 2);
        rowing.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of skill method, of class Rowing.
     *
     * @throws Exception
     */
    @Test
    public void testSkill() throws Exception {
        String expected = "Rowing is a game of chance and in any game that involves risk, there is a bit of luck and skill involved. While many may think the Rowing is pure luck and requires zero skill.";
        var rowing = new Rowing("Shashank", 2);
        rowing.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Rules method, of class Rowing.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRules() throws Exception {
        String expected = "A typical Rowing game utilizes the numbers 1 through 75. The five columns of the card are labeled 'B', 'I', 'N', 'G', and 'O' from left to right. The center space is usually marked \"Free\" or \"Free Space\", and is considered automatically filled.";
        var rowing = new Rowing("Shashank", 2);
        rowing.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of Scoring method, of class Rowing.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testrScoring() throws Exception {
        String expected = "Rowing is a game of probability in which players mark off numbers on cards as the numbers are drawn randomly by a caller, the winner being the first person to mark off all their numbers.";
        var rowing = new Rowing("Shashank", 2);
        rowing.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}
