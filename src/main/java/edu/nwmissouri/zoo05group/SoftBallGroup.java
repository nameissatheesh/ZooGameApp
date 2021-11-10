package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of SoftBall
 *
 * @author S545040 Sai Krishna Vuppala
 */
public class SoftBallGroup {

    private static ArrayList<SoftBall> myGroup;

    /**
     * Create a static group of SoftBall
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        SoftBall a = new SoftBall("Bat", 2);
        myGroup.add(a);
        myGroup.add(new SoftBall("Ball", 2));
        myGroup.add(new SoftBall("Pitch", 2));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("cccccccccccccccccc");
        System.out.println("Hey - look at the SoftBall Game!");
        myGroup.forEach(softball -> {
            softball.game("SoftBall");
            softball.players();
            softball.rules();
            softball.play();
            softball.skill();
            softball.scoring();
        });
        System.out.println("Nice SoftBall- that was fun!");
        System.out.println("ccccccccccccccccccc");
    }

}
