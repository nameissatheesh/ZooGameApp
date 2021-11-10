/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 *This is Sequence class that extends AbstractGame
 * @author Keerthana Ragut
 */
public class Sequence extends AbstractGame {

    /**
     *
     * @param game_name 
     * @param number_of_players
     */
    public Sequence(String game_name, int number_of_players) {
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
        System.out.printf("Playing Sequence with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("The object of the game is to form rows of five poker chips on the board by placing the chips on the board spaces corresponding to cards played from the player's hand");
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println("The beginning, middle, and also to the ability to retell the events within a given text in the order in which they occurred. The ability to sequence events in a text is a key comprehension strategy, especially for narrative texts");

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println("Teams should split up evenly and each player or team takes a color of marker. Players should sit so that no two teammates sit next to one another. A random dealer is chosen and shuffles the deck, and a number of cards are dealt out determined by the number of players. In a 2-player game each player receives a hand of 7 cards, 3 and 4 players receive 6 cards each, 6 players receive 5 cards each, 8 and 9 players receive 4 cards each, and 10 and 12 players receive 3 cards each. The remaining cards form the draw deck. The board should be placed centrally as well as the draw deck, additional markers, and discards");

    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println(" To win you must complete two sequence strands. A sequence is achieved when you have a row of five chips of the same color. This can occur in any direction, vertically, horizontally, or diagonally. You may use any one of the spaces from one sequence in the second sequence");
    }

    void game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * Enum for Sequence class
 */
    public enum CoinsColors {
        RED,
        BLUE,
        GREEN;
       
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Sequence sequence = new Sequence("Sequence", 12);
        sequence.game("Sequence");
        sequence.players();
        sequence.rules();
        sequence.play();
        sequence.skill();
        sequence.scoring();
    }

    /**
     * An instance of an Sequence is now Runnable - call this run() method to
     * see all the Sequence tricks.
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
