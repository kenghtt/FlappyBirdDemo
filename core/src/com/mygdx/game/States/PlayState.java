package com.mygdx.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyBirdDemo;
import com.mygdx.game.sprites.Bird;

/**
 * Project: FlappyBirdGame
 * Package: com.mygdx.game.States
 * <p>
 * User: jeremytouch
 * Date: 4/2/20
 * Time: 6:04 PM
 * <p>
 * Created with Android Studio
 * To change this template use File | Settings | File Templates.
 */
public class PlayState extends State {
    private Bird bird;
//    private Texture bird;
    protected PlayState(GameStateManager gsm) {
        super(gsm);
//        bird = new Texture("bird.png");
        bird = new Bird(50,300);
        cam.setToOrtho(false, FlappyBirdDemo.WIDTH/2, FlappyBirdDemo.HEIGHT/2);
    }

    @Override
    protected void handleInput() {


    }

    @Override
    public void update(float dt) {
        handleInput();
        bird.update(dt);  // update bird based on Delta Time on Game Engine ???


    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);  // zoomed in plus only need to see view port of what we need to see  explained 6min 30 sec part 5

        sb.begin();
//        sb.draw(bird, 50,50);
        sb.draw(bird.getTexture(),bird.getPosition().x, bird.getPosition().y);
        sb.end();

    }

    @Override
    public void dispose() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
