package com.mygdx.game.States;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Project: FlappyBirdGame
 * Package: com.mygdx.game.States
 * <p>
 * User: jeremytouch
 * Date: 4/1/20
 * Time: 7:15 PM
 * <p>
 * Created with Android Studio
 * To change this template use File | Settings | File Templates.
 */
public abstract class State {
    protected OrthographicCamera cam;
    protected Vector3 mouse;  // xyz coordinate
    protected GameStateManager gsm;  // State Manager // pause state, game state etc

    protected State(GameStateManager gsm){
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();
    }

    protected abstract void handleInput();
    public abstract void update(float dt); // in delta time
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
}
