package com.obstacle.avoid.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

import java.awt.Color;

public class GdxUtils {

    public static void clearScreen(){
        clearScreen(Color.BLACK);

    }

    private static void clearScreen (Color color){
        // clear screen
        // DRY = Don't Repeat Yourself
        // WET = Waste Everyone's time
        Gdx.gl.glClearColor(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
    private GdxUtils() { //no need to instantiate de constructor en we can use static

    }
}
