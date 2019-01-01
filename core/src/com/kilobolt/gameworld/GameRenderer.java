package com.kilobolt.gameworld;

import com.badlogic.gdx.Gdx;

/**
 * Created by Rene Ambrose Tang on 1/1/2019.
 */

public class GameRenderer {

    private GameWorld myWorld;

    public GameRenderer(GameWorld world){
        myWorld = world;
    }

    public void render(){
        Gdx.app.log("GameRenderer","render");
    }
}
