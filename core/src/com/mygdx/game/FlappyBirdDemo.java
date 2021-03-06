package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.States.GameStateManager;
import com.mygdx.game.States.MenuState;

public class FlappyBirdDemo extends ApplicationAdapter {
	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;
	public static final String TITLE = "Flappy Bird Game";
	private GameStateManager gsm;
	private SpriteBatch batch;
	Texture img;

	@Override
	public void create () {
		batch = new SpriteBatch();
		// create game state manager
		gsm = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push(new MenuState(gsm));

	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);  // wipes screen clean and then redraw every update
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);  // rendar the batch file
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
	}

//	@Override
//	public void dispose () {
//		batch.dispose();
//		img.dispose();
//	}
}
