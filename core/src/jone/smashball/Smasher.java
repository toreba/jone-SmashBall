package jone.smashball;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import jone.smashball.lib.SuperSprite;

/**
 * Created by tore and jone on 27.07.2014.
 */
public class Smasher extends Group {

    SuperSprite sprite;

    public Smasher() {
        sprite = new SuperSprite();
        sprite.setImage("green_smasher");
        sprite.setOriginAtCenter();
        sprite.setCenterPosition(0,80);
        addActor(sprite);

    }

    @Override
    public void act(float delta) {
        //setCenterPosition(getStage().getWidth()/2, getStage().getHeight()/2);
    }

}
