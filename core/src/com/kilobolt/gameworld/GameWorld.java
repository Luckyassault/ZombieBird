package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;
import com.kilobolt.gameobjects.Bird;
import com.kilobolt.gameobjects.ScrollHandler;

import java.awt.Rectangle;

/**
 * Created by Rene Ambrose Tang on 1/1/2019.
 */

public class GameWorld {
    private Bird bird;
    private ScrollHandler scroller;

    public GameWorld(int midPointY) {
        bird = new Bird(33,midPointY - 5, 17, 12);
        scroller = new ScrollHandler(midPointY + 66);
    }

    public void update(float delta) {
        bird.update(delta);
        scroller.update(delta);

    }

    public Bird getBird() {
        return bird;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }
}
