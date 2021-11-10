/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 * This is Carroms game class which extends AbstractGame class
 * It has override methods which has print statements in it
 * @author S545465 Rahul Konda
 */
public class Uno extends AbstractGame {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    public Uno(String game_name, int number_of_players) {
        super(game_name, number_of_players);
    }

    /**
     *
     * @param game_name
     * @param name
     * @return name
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void game(String game_name) {
        System.out.printf("I Like to play %s. \n", this.game_name);
    }

    /**
     * call this player() method to see how many number of players are playing.
     */
    public void players() {
        System.out.printf("Playing Uno Cards with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("Uno is a game played by using Uno cards with the help of color and numbers written on cards");
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println("Skills required while playing Uno are - one needs to keep the previous card in mind and release the card accordingly and make use of the wild card in much needed situation");

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println("It is an indoor game, each player will be given 7 cards. One need to start by dropping a card. Second person has to throw a card based on the previous card. He has to throw the same color card or the number on previous card.");

    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println("A person who drops all his cards at the earlist is considered to be as winner.");
    }

    void game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    /**
    * This is enum class which describes the Uno class
    */
    public enum unocards {
        SWAP,
        WILD,
        PLUSTWO,
        PLUSFOUR;
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Uno uno = new Uno("Badminton", 2);
        uno.game("Badminton");
        uno.players();
        uno.rules();
        uno.play();
        uno.skill();
        uno.scoring();
    }

    /**
     * An instance of an UnoCards is now Runnable - call this run() method to
     * see all the UnoCards tricks.
     */
    @Override
    public void run() {
        this.game();
        this.players();
        this.rules();
        this.play();
        this.skill();
        this.scoring();
    }
}
