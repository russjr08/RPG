package com.kronosad.games.rpg.entity.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kronosad.games.rpg.entity.Entity;

/**
 * Created by Russell Richardson.
 */
public abstract class Player extends Entity {

    public Player() {
        super();
        this.sprite = new Sprite(new Texture("assets/character/player-down.png"));
        position.x = 20;
        position.y = 20;
    }

    @Override
    public void update() {
        sprite.setPosition(position.x, position.y);
    }

    @Override
    public void render(SpriteBatch batch) {
        sprite.draw(batch);
    }

}
