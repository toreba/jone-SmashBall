package jone.smashball.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import jone.smashball.SmashBallGame;

public class DesktopLauncher {
	public static void main (String[] arg) {

        TexturePacker.Settings settings = new TexturePacker.Settings();
        settings.maxWidth = 512;
        settings.maxHeight = 512;
        settings.filterMin = Texture.TextureFilter.Linear;
        settings.filterMag = Texture.TextureFilter.Linear;
        TexturePacker.process(settings, "../../core/images", ".", "game");

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new SmashBallGame(), config);
	}
}
