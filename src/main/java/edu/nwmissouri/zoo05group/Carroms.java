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
public class Carroms extends AbstractGame {

    /**
     *
     * @param game_name
     * @param number_of_players
     */
    public Carroms(String game_name, int number_of_players) {
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
        System.out.printf("Playing Carroms with %s\n", this.number_of_players);
    }

    /**
     *
     * call this play() method to see which game you are playing.
     */
    @Override
    public void play() {
        System.out.println("Carroms is a game played by using a board which has several lines in it. the board has four holes in four corners. There will be white coins, black coins, a red coin and a striker to strike the coins.");
    }

    /**
     *
     * call this skill() method to see which game you are playing.
     */
    @Override
    public void skill() {
        System.out.println("Skills required while playing Carroms are one need to strike the coins places in the center of the board at an angle where coins has to drop inside holes.");

    }

    /**
     *
     * call this rules() method to see which game you are playing.
     */
    @Override
    public void rules() {
        System.out.println("It is an indoor game, It can be played by 2 or 4 people at a time. Each player or opposite players will be in one team and will choose a color. One need to strike only the color coins they choose. The team which strikes red first and drops it in any hole wins the game.");

    }

    /**
     *
     * call this scoring() method to see which game you are playing.
     */
    @Override
    public void scoring() {
        System.out.println("The team which completes the coins first will win the game. The points won will be depending on the coins of the opposite team remained in the board.");
    }

    void game() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * This is enum class which describes the carroms class
     */
    public enum carromcoins {
        WHITECOINS,
        BLACKCOINS,
        REDCOIN,
        STRIKER;
    }
    
    public void exceptiontest(){
    try {
        int a[] = new int[4];
        System.out.println("Access element three :" + a[8]);
     }
     catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception thrown  :" + e);
     }
      finally{
     System.out.println("Out of the block");
   }
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        Carroms carroms = new Carroms("Badminton", 2);
        carroms.game("Badminton");
        carroms.players();
        carroms.rules();
        carroms.play();
        carroms.skill();
        carroms.scoring();
        carroms.exceptiontest();
    }

    /**
     * An instance of an Carrom board is now Runnable - call this run() method to
     * see all the Carrom board tricks.
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

