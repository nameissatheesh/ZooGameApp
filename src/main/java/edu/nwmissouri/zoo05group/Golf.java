/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 * This Golf Class extends AbstractGame class
 * @author S545030
 * 
 */
public class Golf extends AbstractGame {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    public Golf(String game_name, int number_of_players) {
        super(game_name, number_of_players);
    }

    /**
     *
     * @param game_name
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
       System.out.printf("Playing Golf with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("A game played in outdoor areas ");
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println("Strike, Power");

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println("The ball must be hit using standard clubs from the start of each hole to the green and ultimately into the hole, which is marked by a flag.");

    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println(" winner is the player with the lowest total");
    }

    void game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Golf golf = new Golf("Golf", 1);
        golf.game("Golf");
        golf.players();
        golf.rules();
        golf.play();
        golf.skill();
        golf.scoring();
    }

    /**
     * An instance of an Golf is now Runnable - call this run() method to
     * see all the Golf tricks.
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
