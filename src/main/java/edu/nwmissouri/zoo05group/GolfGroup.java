package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Golf game
 *
 * @author S545030
 */
public class GolfGroup {

    private static ArrayList<Golf> myGroup;

    /**
     * Create a static group of Golf
     *
     * @return 
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Golf a = new Golf("Aquatic", 2);
        myGroup.add(a);
        myGroup.add(new Golf("Soil", 2));
        myGroup.add(new Golf("Himalayas", 2));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("------------------------------");
        System.out.println("Hey - look at the golf Game!");
        myGroup.forEach(golf -> {
            golf.game("Badminton");
            golf.players();
            golf.rules();
            golf.play();
            golf.skill();
            golf.scoring();
        });
        System.out.println("Nice golf - that was fun!");
        System.out.println("--------------------------");
    }

}
