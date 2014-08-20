package jone.smashball;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import jone.smashball.lib.SuperSprite;

/**
 * Created by tore on 27.07.2014.
 */
public class Ball extends SuperSprite {
    Vector2 v;

    public Ball() {
        setImage("red_ball");
        setOriginAtCenter();
    }

    @Override
    public void act(float delta) {
        setCenterPosition(getCenterX() + v.x * delta, getCenterY() + v.y*delta);
        rotateBy(delta * 90);
    }

    public void setTarget(Actor actor) {
        v = new Vector2(actor.getCenterX() - getCenterX(), actor.getCenterY() - getCenterY());
        v.limit(30);

    }
}
