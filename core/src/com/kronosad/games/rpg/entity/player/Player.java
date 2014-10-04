package com.kronosad.games.rpg.entity.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kronosad.games.rpg.entity.Entity;
import com.kronosad.games.rpg.level.Level;

/**
 * Created by Russell Richardson.
 */
public abstract class Player extends Entity {
    protected Facing direction;

    public Player(Level level) {
        super(level);
        this.sprite = new Sprite(new Texture("assets/character/player-down.png"));
        position.x = 20;
        position.y = 20;

        direction = Facing.UP;
    }

    @Override
    public void update() {
        sprite.setPosition(position.x, position.y);
        if(direction == Facing.UP) {
            sprite.setTexture(new Texture("assets/character/player-up.png"));
        } else if(direction == Facing.DOWN) {
            sprite.setTexture(new Texture("assets/character/player-down.png"));
        } else if(direction == Facing.LEFT) {
            sprite.setTexture(new Texture("assets/character/player-left.png"));
        } else if(direction == Facing.RIGHT) {
            sprite.setTexture(new Texture("assets/character/player-right.png"));
        } else {
            throw new IllegalArgumentException("Player is not facing a valid direction!");
        }
    }

    @Override
    public void render(SpriteBatch batch) {
        sprite.draw(batch);
    }

}
