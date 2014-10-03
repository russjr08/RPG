package com.kronosad.games.rpg.level;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.Array;
import com.kronosad.games.rpg.entity.Entity;

/**
 * Created by Russell Richardson
 */
public class Level {

    private OrthogonalTiledMapRenderer mapRenderer;
    private OrthographicCamera camera;

    private TiledMap map;

    private Array<Entity> entities = new Array<Entity>();

    public Level(String name, OrthographicCamera camera) {
        map = new TmxMapLoader().load("assets/level/" + name + ".tmx");

        mapRenderer = new OrthogonalTiledMapRenderer(map);

        this.camera = camera;

    }

    public void render(SpriteBatch batch) {
        batch.end();
        mapRenderer.setView(camera);
        mapRenderer.render();
        batch.begin();
        // TODO: Draw Entities.
    }

    public void update() {

    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public void removeEntity(Entity entity) {
        entities.removeValue(entity, false);
    }

}
