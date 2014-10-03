package com.kronosad.games.rpg;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kronosad.games.rpg.level.Level;

public class Game extends ApplicationAdapter {

    public static final int WIDTH = 800, HEIGHT = 600;

    private OrthographicCamera camera;

    private SpriteBatch batch;

    private Level currentLevel;

    private static Game instance;

	@Override
	public void create () {
		batch = new SpriteBatch();

        camera = new OrthographicCamera();
        camera.setToOrtho(false, WIDTH, HEIGHT);

        currentLevel = new Level("outside", camera);

        instance = this;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        update();
        batch.setProjectionMatrix(camera.combined);

		batch.begin();
        currentLevel.render(batch);
		batch.end();
	}

    public void update() {
        currentLevel.update();
    }

    public static Game getInstance() { return instance; }
}
