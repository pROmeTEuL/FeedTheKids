package com.CGD;

import org.jsfml.graphics.*;
import org.jsfml.window.*;
import org.jsfml.system.*;
import org.jsfml.window.event.*;

public class Engine {
    public Engine() {
        window = new RenderWindow(new VideoMode(resolution.x, resolution.y), "FeedTheKids", WindowStyle.DEFAULT);
    }
    public void run() {
        Clock clock = new Clock();
        do {
            Time dt = clock.restart();
            input();
            update(dt.asSeconds());
            draw();
        } while (window.isOpen());
    }
    private void input() {
        for (Event event : window.pollEvents()) {
            switch (event.type) {
                case CLOSED:
                    window.close();
                    break;
                case KEY_PRESSED:
                    switch (event.asKeyEvent().key) {
                        case ESCAPE:
                            window.close();
                            break;
                    }
            }
        }
    }
    private void update(float dtAsSeconds) {

    }
    private void draw() {
        window.clear(Color.BLACK);
        window.display();
    }
    private RenderWindow window;
    private final Vector2i resolution = new Vector2i(640, 480);
}
