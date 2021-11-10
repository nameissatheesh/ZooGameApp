/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * This is CarromsGroup game class
 * Provides methods to create and run a group of Uno
 *
 * @author S545465 Rahul Konda
 */
public class UnoGroup {

    private static ArrayList<Uno> myGroup;

    /**
     * Create a static group of Uno
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Uno a = new Uno("Alpha", 2);
        myGroup.add(a);
        myGroup.add(new Uno("Beta", 3));
        myGroup.add(new Uno("Gamma", 4));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKK");
        System.out.println("Hey - look at the Uno Game!");
        myGroup.forEach(uno -> {
            uno.game("Uno");
            uno.players();
            uno.rules();
            uno.play();
            uno.skill();
            uno.scoring();
        });
        System.out.println("Nice Uno - that was fun!");
        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKK");
    }

}

