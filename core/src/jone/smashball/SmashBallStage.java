package jone.smashball;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by tore on 27.07.2014.
 */
public class SmashBallStage extends Stage {
    Smasher player;
    Ball ball;


    public SmashBallStage(Viewport viewport) {
        super(viewport);
        player = new Smasher();
        ball = new Ball();
        ball.setCenterPosition(100,100);
        ball.setTarget(player);
    }



    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return rotatePlayer(screenX, screenY);
    }

    private boolean rotatePlayer(int screenX, int screenY) {
        float playerX = player.getCenterX();
        float playerY = player.getCenterY();
        double theta = Math.atan2(playerX -screenX, playerY - screenY);
        player.setRotation((float)(theta * 180 /Math.PI ));
        return true;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return rotatePlayer(screenX, screenY);
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return rotatePlayer(screenX, screenY);
    }

    public void create() {
        addActor(player);
        addActor(ball);
    }

    public void resize(int width, int height) {
        getViewport().update(width, height);
        player.setCenterPosition(width/2, height/2);
        ball.setTarget(player);
    }
}
