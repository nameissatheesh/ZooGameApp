/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * This is CarromsGroup game class
 * Provides methods to create and run a group of Carroms
 * @author S545465 Rahul Konda
 */
public class CarromsGroup {

    private static ArrayList<Carroms> myGroup;

    /**
     * Create a static group of Carroms
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Carroms a = new Carroms("Kappa", 2);
        myGroup.add(a);
        myGroup.add(new Carroms("Delta", 3));
        myGroup.add(new Carroms("Lambda", 4));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKK");
        System.out.println("Hey - look at the Carroms Game!");
        myGroup.forEach(carroms -> {
            carroms.game("Carroms");
            carroms.players();
            carroms.rules();
            carroms.play();
            carroms.skill();
            carroms.scoring();
        });
        System.out.println("Nice Carroms - that was fun!");
        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKK");
    }

}

