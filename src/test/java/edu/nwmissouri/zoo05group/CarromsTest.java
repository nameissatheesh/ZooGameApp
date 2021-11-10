/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * Test Carroms using JUnit5
 * This class tests down the methods in CarromsGroup java class
 * @author Rahul Konda(#S545465)
 */
public class CarromsTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public CarromsTest() {
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
        String expected = "Playing Carroms with 4";
        var carroms = new Carroms("Rahul", 4);
        carroms.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    /**
     * 
     * @throws Exception 
     */

    @Test
    public void testPlay() throws Exception {
        String expected = "Carroms is a game played by using a board which has several lines in it. the board has four holes in four corners. There will be white coins, black coins, a red coin and a striker to strike the coins.";
        var carroms = new Carroms("Rahul", 2);
        carroms.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testSkill() throws Exception {
        String expected = "Skills required while playing Carroms are one need to strike the coins places in the center of the board at an angle where coins has to drop inside holes.";
        var carroms = new Carroms("Rahul", 2);
        carroms.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testRules() throws Exception {
        String expected = "It is an indoor game, It can be played by 2 or 4 people at a time. Each player or opposite players will be in one team and will choose a color. One need to strike only the color coins they choose. The team which strikes red first and drops it in any hole wins the game.";
        var carroms = new Carroms("Rahul", 2);
        carroms.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testrScoring() throws Exception {
        String expected = "The team which completes the coins first will win the game. The points won will be depending on the coins of the opposite team remained in the board.";
        var carroms = new Carroms("Rahul", 2);
        carroms.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}
