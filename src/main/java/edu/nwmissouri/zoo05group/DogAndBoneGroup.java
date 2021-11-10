/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 *This is DogAndBoneGroup class
 * @author S545031
 */
public class DogAndBoneGroup {
     private static ArrayList<DogAndBone> myGroup;

    /**
     * Create a static group of DogAndBone
     *
     * @return the number of players in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        DogAndBone dog = new DogAndBone("Firewaters", 2);
        myGroup.add(dog);
        myGroup.add(new DogAndBone("Greenteam", 2));
        myGroup.add(new DogAndBone("Yellowgroup", 2));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("******************************");
        System.out.println("Hey - look at the Dogandbone Game!");
        myGroup.forEach(dogandbone -> {
            dogandbone.game("DogAndBone");
            dogandbone.players();
            dogandbone.rules();
            dogandbone.play();
            dogandbone.skill();
            dogandbone.scoring();
        });
        System.out.println("Nice DogAndBone - that was fun!");
        System.out.println("*********************************");
    }
}
