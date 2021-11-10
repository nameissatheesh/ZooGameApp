/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 * SoftBall class (derived subclass of the superclass AbstractGame)
 * @author S545040 Sai krishna Vuppala
 */
public class SoftBall extends AbstractGame {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    public SoftBall(String game_name, int number_of_players) {
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
        System.out.printf("Playing SoftBall with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("Softball is a bat-and-ball sport played between two teams of 10 players. The object of the game is to score more runs than the other team ");
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    
    @Override
    public void skill() {
        System.out.println("The skills required for softball are : throwingcatching, hitting for contact, hitting for power, and running");

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    
    @Override
    public void rules() {
        System.out.println("TEach team bats once in each innings. A batter must successfully strike the ball and run around, Once they get all the way around and back to home plate without being given out a run is Scored. The fielding team can prevent the batsmen by making them miss the ball, catching the ball, tagging one of the bases before they reach. A home run can be scored by hitting the ball over the outfield and into a dead ball area ");
    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    
    @Override
    public void scoring() {
        System.out.println("To score a run the batsman must successfully first hit the ball and make it around the bases without being given out. One run is scored for every batsmen they manage to get round. A run can be scored even if the batsmen who hit the ball doesn’t make it round to home plate but manages to get a player that’s already on one of the bases home ");
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
        SoftBall softball = new SoftBall("SoftBall", 2);
        softball.game("SoftBall");
        softball.players();
        softball.rules();
        softball.play();
        softball.skill();
        softball.scoring();
    }

    /**
     * An instance of an SoftBall is now Runnable - call this run() method to
     * see all the SoftBall tricks.
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
