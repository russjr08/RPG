package com.kronosad.games.rpg.entity;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.UUID;

/**
 * Created by Russell Richardson.
 */
public abstract class Entity {

    protected Sprite sprite;
    protected Vector2 position = new Vector2();

    protected String uuid;

    public Entity() {
        generateUUID();
    }

    public abstract void render(SpriteBatch batch);
    public abstract void update();

    public void generateUUID() {
        System.out.println("Generating UUID for: " + getClass().toString());
        uuid = UUID.randomUUID().toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Entity) {
            Entity other = (Entity)obj;
            if(other.uuid.equals(uuid)) return true;
        }
        return false;
    }
}
