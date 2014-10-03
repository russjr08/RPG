package com.kronosad.games.rpg.entity;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.UUID;

/**
 * Created by Russell Richardson.
 */
public abstract class Entity {

    protected Sprite sprite;

    protected String uuid;

    public Entity() {
        generateUUID();
    }

    public abstract void render(SpriteBatch batch);
    public abstract void update();

    public void generateUUID() {
        System.out.println(this.getClass().toString());
        uuid = UUID.randomUUID().toString();
    }

}
