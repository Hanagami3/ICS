//package com.obstacle.avoid.screen;
//
//import com.badlogic.gdx.Screen;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
//import com.badlogic.gdx.utils.ScreenUtils;
//import com.badlogic.gdx.utils.viewport.Viewport;
//
//public class ctrlV {
//
//    package com.obstacle.avoid.screen;
//
//import com.badlogic.gdx.Screen;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
//import com.badlogic.gdx.utils.ScreenUtils;
//import com.badlogic.gdx.utils.viewport.Viewport;
//
//    public class GameScreen implements Screen {
//
//        private OrthographicCamera camera;
//        private Viewport viewport;
//        private ShapeRenderer renderer;
//        SpriteBatch batch;
//        Texture img;
//
//        @Override
//        public void show () {
//            batch = new SpriteBatch();
//            img = new Texture("badlogic.jpg");
//        }
//
//        @Override
//        public void render (float delta) {
//            ScreenUtils.clear(1, 0, 0, 1);
//            batch.begin();
//            batch.draw(img, 0, 0);
//            batch.end();
//        }
//
//        @Override
//        public void dispose () {
//            batch.dispose();
//            img.dispose();
//        }
//
//        @Override
//        public void resize(int width, int height) {
//
//        }
//
//        @Override
//        public void pause() {
//
//        }
//
//        @Override
//        public void resume() {
//
//        }
//
//        @Override
//        public void hide() {
//            dispose();
//        }
//    }
//
//}
