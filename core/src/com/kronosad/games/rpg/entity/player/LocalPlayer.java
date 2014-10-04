package com.kronosad.games.rpg.entity.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kronosad.games.rpg.level.Level;

/**
 * Created by Russell Richardson.
 */
public class LocalPlayer extends Player {
    public final static float MOVE_SPEED = 2.0f;

    public LocalPlayer(Level level) {
        super(level);
    }

    @Override
    public void render(SpriteBatch batch) {
        super.render(batch);
    }

    @Override
    public void update() {
        super.update();
        // TODO: Pan camera
        if(Gdx.input.isKeyPressed(Input.Keys.A)) {
            position.x -= MOVE_SPEED;
            direction = Facing.LEFT;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.D)) {
            position.x += MOVE_SPEED;
            direction = Facing.RIGHT;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.W)) {
            position.y += MOVE_SPEED;
            direction = Facing.UP;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.S)) {
            position.y -= MOVE_SPEED;
            direction = Facing.DOWN;
        }
    }
}
