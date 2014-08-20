package jone.smashball.lib;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by tore on 28.07.2014.
 */
public class SuperSprite extends Actor {
    TextureRegion image;

    public void setImage(String imageName) {
        image = ImageFactory.getRegion(imageName);
        setSize(image.getRegionWidth(), image.getRegionHeight());
    }

    public void setOriginAtCenter() {
        setOrigin(getWidth()/2, getHeight()/2);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        //batch.

        //super.draw(batch, parentAlpha);
        batch.draw(image, getX() , getY(), getOriginX(),getOriginY(), getWidth(),getHeight(), 1,1,getRotation());
    }

}
