package jone.smashball.lib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by tore on 28.07.2014.
 */
public class ImageFactory {
    private static TextureAtlas atlas;

    public static void init(String atlasName) {
        atlas = new TextureAtlas(Gdx.files.internal(atlasName + ".atlas"));
   }

    public static TextureRegion getRegion(String name) {
        return atlas.findRegion(name);
    }

}
