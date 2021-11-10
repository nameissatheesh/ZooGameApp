/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 * This is Monopoly class extends AbstractGame class
 * @author S545030
 */
public class Monopoly extends AbstractGame {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    public Monopoly(String game_name, int number_of_players) {
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
       System.out.printf("Playing Monopoly with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("A game played with the two to six members");
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println("Active mind and some business skills");

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println("1. Each player chooses one token to represent them while traveling around the board \n 2.Each player is given $1500 \n 3. Select someone as banker. If this person also plays, then he must keep his personal funds \n 4. Then each player places his token on the corner marked GO and throw the dice and move his the number of spaces indicated by the dice.");

    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println("Person with highest amount wins");
    }

    void game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    public enum Money {
        COINS,
        NOTES;
        
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Monopoly monopoly = new Monopoly("Monoploy", 2);
        monopoly.game("Monoploy");
        monopoly.players();
        monopoly.rules();
        monopoly.play();
        monopoly.skill();
        monopoly.scoring();
    }

    /**
     * An instance of an Monopoly is now Runnable - call this run() method to
     * see all the Monopoly tricks.
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
