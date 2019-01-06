package com.kilobolt.gameobjects;

import java.util.Random;

/**
 * Created by Rene Ambrose Tang on 4/1/2019.
 */

public class Pipe extends Scrollable {

    private Random r;

    // When Pipe's constructor is invoked, invoke the super(Scrollable) constructor
    public Pipe(float x, float y, int width, int height, float scrollSpeed){
        super(x,y,width,height,scrollSpeed);
        // initalise a random object for RNG
        r = new Random();
    }

    @Override
    public void reset(float newX) {
        // Call the reset method in the superclass (Scrollable)
        super.reset(newX);
        // Change the height to a random number
        height = r.nextInt(90) + 15;
    }
}
