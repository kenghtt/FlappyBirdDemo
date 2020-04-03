package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyBirdDemo;

/**
 * Project: FlappyBirdGame
 * Package: com.mygdx.game.States
 * <p>
 * User: jeremytouch
 * Date: 4/1/20
 * Time: 11:27 PM
 * <p>
 * Created with Android Studio
 * To change this template use File | Settings | File Templates.
 */
public class MenuState extends State {
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm){
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");

    };
    @Override
    public void handleInput() {

        if(Gdx.input.justTouched()){   // any type of click
            gsm.set(new PlayState(gsm));  // set game state
            dispose(); // dispose texture to free up memory to prevent memory leak

        }


    }

    @Override
    public void update(float dt) {
        handleInput();  // always going to check the input if the user has done anything

    }

    @Override
    public void render(SpriteBatch sb) {

        sb.begin();
        sb.draw(background, 0,0, FlappyBirdDemo.WIDTH, FlappyBirdDemo.HEIGHT);
        sb.draw(playBtn, (FlappyBirdDemo.WIDTH/2) -  (playBtn.getWidth()/2), FlappyBirdDemo.HEIGHT/2);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();;
        playBtn.dispose();
    }


}
