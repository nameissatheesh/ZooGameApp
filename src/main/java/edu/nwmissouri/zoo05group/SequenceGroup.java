/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 *This is SequenceGroup Class 
 * @author S545031
 */
public class SequenceGroup {
     private static ArrayList<Sequence> myGroup;

    /**
     * Create a static group of Sequence
     *
     * @return the number of players in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Sequence seq = new Sequence("King", 12);
        myGroup.add(seq);
        myGroup.add(new Sequence("Queen", 12));
        myGroup.add(new Sequence("Jack", 12));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("******************************");
        System.out.println("Hey - look at the Sequence Game");
        myGroup.forEach(sequence -> {
            sequence.game("Sequence");
            sequence.players();
            sequence.rules();
            sequence.play();
            sequence.skill();
            sequence.scoring();
        });
        System.out.println("Nice Sequence - that was fun!");
        System.out.println("*******************************");
    }
}
