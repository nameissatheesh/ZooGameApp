/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

import java.lang.Integer;
/**
 *
 * Bingo class (derived subclass of the superclass AbstractGame)
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class Bingo extends AbstractGame implements Runnable {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    public Bingo(String game_name, int number_of_players) {
        super(game_name, number_of_players);
    }

    /**
     *
     * @param game_name call this play() method to see which game you are
     * playing.
     */
    @Override
    public void game(String game_name) {
        System.out.printf("I Like to play %s.\n", this.game_name);
    }

    /**
     * call this player() method to see how many number of players are playing.
     */
    public void players() {
        System.out.printf("Playing Bingo with %s players.\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("Bingo is a game of chance in which each player matches numbers printed in different arrangements on cards with the numbers the game host (caller) draws at random, marking the selected numbers with tiles.");

    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println("Bingo is a game of chance and in any game that involves risk, there is a bit of luck and skill involved. While many may think the Bingo is pure luck and requires zero skill.");
    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println("A typical Bingo game utilizes the numbers 1 through 75. The five columns of the card are labeled 'B', 'I', 'N', 'G', and 'O' from left to right. The center space is usually marked \"Free\" or \"Free Space\", and is considered automatically filled.");
    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println("Bingo is a game of probability in which players mark off numbers on cards as the numbers are drawn randomly by a caller, the winner being the first person to mark off all their numbers.");
    }

    void game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * call this NumberFormatException() - method to see Exception handing.
     */
    public void NumberFormatException() {
        try {
            String s = "abc";
            int i = Integer.parseInt(s);//NumberFormatException
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Bingo bingo = new Bingo("Bingo", 2);
        bingo.game("Bingo");
        bingo.players();
        bingo.rules();
        bingo.play();
        bingo.skill();
        bingo.scoring();
        bingo.NumberFormatException();
    }

    /**
     * An instance of an Bingo is now Runnable - call this run() method to see
     * all the Bingo tricks.
     */
    @Override
    public void run() {
        this.game();
        this.players();
        this.rules();
        this.play();
        this.skill();
        this.scoring();
        this.NumberFormatException();
    }
}
