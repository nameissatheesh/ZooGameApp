package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of ScavengerHunt
 *
 * @author S545040
 */
public class ScavengerHuntGroup {

    private static ArrayList<ScavengerHunt> myGroup;

    /**
     * Create a static group of ScavengerHunt
     *
     * @return 
     */
    public static int create() {
        myGroup = new ArrayList<>();

        ScavengerHunt a = new ScavengerHunt("Aquatic", 2);
        myGroup.add(a);
        myGroup.add(new ScavengerHunt("Soil", 2));
        myGroup.add(new ScavengerHunt("Himalayas", 2));

        return myGroup.size();
    }

    
    public static void run() {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
        System.out.println("Hey - look at the ScavengerHunt Game!");
        myGroup.forEach(scavengerHunt -> {
            scavengerHunt.game("ScavengerHunt");
            scavengerHunt.players();
            scavengerHunt.rules();
            scavengerHunt.play();
            scavengerHunt.skill();
            scavengerHunt.scoring();
        });
        System.out.println("Nice ScavengerHunt - that was fun!");
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
    }

}
