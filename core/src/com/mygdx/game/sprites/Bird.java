package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Project: FlappyBirdGame
 * Package: com.mygdx.game.sprites
 * <p>
 * User: jeremytouch
 * Date: 4/3/20
 * Time: 12:00 AM
 * <p>
 * Created with Android Studio
 * To change this template use File | Settings | File Templates.
 */
public class Bird {
    private static final int GRAVITY= -15;  // default set to -15
    private Vector3 position; // Vector3 holds x, y, z axis, but we will only be using x and y
    private Vector3 velocity;
    private Texture bird;

    public Bird(int x, int y){  // takes in x and y
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0); // start at 0 since we dont want it to move at first
        bird = new Texture("bird.png");

    }

    public void update(float dt){  //dt ==> Delta Time
        velocity.add(0, GRAVITY, 0);
        velocity.scl(dt); // scale by time
        position.add(0, velocity.y, 0);

        velocity.scl(1/dt);  // this reverses what we scaled previously on next frame  ??? kind confusing

    }


    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return bird;
    }

}
