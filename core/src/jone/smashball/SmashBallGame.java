package jone.smashball;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import jone.smashball.lib.ImageFactory;

public class SmashBallGame extends ApplicationAdapter {
    private SmashBallStage stage;
    @Override
    public void create () {
        ImageFactory.init("game");
        stage = new SmashBallStage(new ExtendViewport(640, 480, 800, 480));
        Gdx.input.setInputProcessor(stage);
        stage.create();
    }


    public void resize (int width, int height) {
        stage.resize(width, height);
    }


    public void dispose() {
        stage.dispose();
    }

    @Override
    public void render () {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();

    }
}
