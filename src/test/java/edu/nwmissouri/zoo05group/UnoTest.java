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
 * Test Uno using JUnit5
 *
 * @author Rahul Konda (#S545465)
 */
public class UnoTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public UnoTest() {
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
        String expected = "Playing Uno Cards with 6";
        var uno = new Uno("Rahul", 6);
        uno.players();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    /**
     * 
     * @throws Exception 
     */

    @Test
    public void testPlay() throws Exception {
        String expected = "Uno is a game played by using Uno cards with the help of color and numbers written on cards";
        var uno = new Uno("Rahul", 2);
        uno.play();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testSkill() throws Exception {
        String expected = "Skills required while playing Uno are - one needs to keep the previous card in mind and release the card accordingly and make use of the wild card in much needed situation";
        var uno = new Uno("Rahul", 2);
        uno.skill();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testRules() throws Exception {
        String expected = "It is an indoor game, each player will be given 7 cards. One need to start by dropping a card. Second person has to throw a card based on the previous card. He has to throw the same color card or the number on previous card.";
        var uno = new Uno("Rahul", 2);
        uno.rules();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    @Test
    public void testrScoring() throws Exception {
        String expected = "A person who drops all his cards at the earlist is considered to be as winner.";
        var uno = new Uno("Rahul", 2);
        uno.scoring();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}