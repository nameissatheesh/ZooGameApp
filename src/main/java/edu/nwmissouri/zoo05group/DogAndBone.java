/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

/**
 *This is DogAndBone class which extends AbstractGame
 * @author S545031
 */
public class DogAndBone extends AbstractGame {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    public DogAndBone(String game_name, int number_of_players) {
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
        System.out.printf("Playing DogAndBone with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("DogAndBone is a game which is played by two different groups with bone in the circle");
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println("DogAndBone needs full concentration on bone to get the bone from circle");

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println("Each one person will come from each group and will play for the bone, the person who takes the bone will get a point.  ");
    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println("For each win the team gets 1 point and finally at the end highest points group wins!!");
    }

    void game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * Enum for DogAndBone class
 */
    public enum Things {
        BONE,
        STONE,
        BALL,
        BOTTLE;
        
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        DogAndBone dogandbone = new DogAndBone("DogAndBone", 2);
        dogandbone.game("DogAndBone");
        dogandbone.players();
        dogandbone.rules();
        dogandbone.play();
        dogandbone.skill();
        dogandbone.scoring();
    }

    /**
     * An instance of an DogAndBone is now Runnable - call this run() method to
     * see all the DogAndBone tricks.
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

