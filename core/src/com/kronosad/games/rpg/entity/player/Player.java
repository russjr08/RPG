package com.kronosad.games.rpg.entity.player;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.kronosad.games.rpg.entity.Entity;

/**
 * Created by Russell Richardson.
 */
public abstract class Player extends Entity {

    public Player() {
        this.sprite = new Sprite(new Texture("assets/character/player-down.png"));
    }

}
