package edu.nwmissouri.zoo05group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of StringRay
 * @author S545040 Saikrishna Vuppala
 */
public class StringRayGroup {
    private static ArrayList<StringRay> myGroup;

    /**
     * Create a static group of StringRay
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new StringRay("Shashi"));
        myGroup.add(new StringRay("Madhav"));
        myGroup.add(new StringRay("Afridi"));

        return myGroup.size();
    }

    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the StringRay!");
        for (StringRay stringRay : myGroup) {
            stringRay.speak();
            stringRay.move();
        }

        System.out.println("Nice StringRay - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    
}
