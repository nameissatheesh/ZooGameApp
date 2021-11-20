/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 * Badminton class (derived subclass of the superclass AbstractGame)
 *
 * @author S545243 Satheesh Eppalapelli
 */
public class Badminton extends AbstractGame implements Runnable {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    public Badminton(String game_name, int number_of_players) {
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
        System.out.printf("I Like to play %s.\n", this.game_name);
    }

    /**
     * call this player() method to see how many number of players are playing.
     */
    public void players() {
        System.out.printf("Playing Badminton with %s players.\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("Badminton is a racquet sport played using racquets to hit a shuttlecock across a net.");
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println("Badminton offers a wide variety of basic strokes, and players require a high level of skill to perform all of them effectively. All strokes can be played either forehand or backhand.");

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println("The court is rectangular and divided into halves by a net. Courts are usually marked for both singles and doubles play, although badminton rules permit a court to be marked for singles only.");

    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println("Each game is played to 21 points, with players scoring a point whenever they win a rally regardless of whether they served (this differs from the old system where players could only win a point on their serve and each game was played to 15 points). A match is the best of three games.");
    }

    void game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * call this stocks() enum method to see which badminton stockes.
     */
    public enum stockes {
        SERVES,
        CLEARS,
        SMASHES,
        DRIVES,
        DROPS;
    }

     /**
     *
     * call this DivideByZero() - method to see Exception handing.
     */
    public void DivideByZero() {
        try {
            int data = 100/0;
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
        Badminton badminton = new Badminton("Badminton", 2);
        badminton.game("Badminton");
        badminton.players();
        badminton.rules();
        badminton.play();
        badminton.skill();
        badminton.scoring();
        for (Badminton.stockes stockes : Badminton.stockes.values()) {
            System.out.println(stockes);
        }
        badminton.DivideByZero();
        
        int myInt = 9;
        double myDouble = myInt; // Automatic casting from Int to Double
        
        System.out.println(myInt); // output 9 
        System.out.println(myDouble); // output to 9.0
    }

    /**
     * An instance of an Badminton is now Runnable - call this run() method to
     * see all the Badminton tricks.
     */
    @Override
    public void run() {
        this.game();
        this.players();
        this.rules();
        this.play();
        this.skill();
        this.scoring();
        this.DivideByZero();
    }
}
