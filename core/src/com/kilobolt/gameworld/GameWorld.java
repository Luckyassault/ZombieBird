package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;
import com.kilobolt.gameobjects.Bird;

import java.awt.Rectangle;

/**
 * Created by Rene Ambrose Tang on 1/1/2019.
 */

public class GameWorld {
    private Bird bird;

    public GameWorld(int midPointY) {
        bird = new Bird(33,midPointY - 5, 17, 12);
    }

    public void update(float delta) {
        bird.update(delta);

    }

    public Bird getBird() {
        return bird;
    }
}
