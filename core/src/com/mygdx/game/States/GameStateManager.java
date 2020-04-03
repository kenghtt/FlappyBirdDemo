package com.mygdx.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Project: FlappyBirdGame
 * Package: com.mygdx.game.States
 * <p>
 * User: jeremytouch
 * Date: 4/1/20
 * Time: 11:17 PM
 * <p>
 * Created with Android Studio
 * To change this template use File | Settings | File Templates.
 */
public class GameStateManager {

    private Stack<State> states;

    public GameStateManager(){
        states = new Stack<State>();
    }

    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop();
    }

    public void set(State state){
        states.pop();
        states.push(state);
    }

    public void update(float dt){
        states.peek().update(dt);
//        states.p
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
