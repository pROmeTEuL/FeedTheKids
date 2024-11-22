package com.CGD;

import org.jsfml.graphics.Color;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.window.VideoMode;
import org.jsfml.window.WindowStyle;
import org.jsfml.window.event.Event;

class resolution {
    public int x = 640;
    public int y = 480;
};

public class MainMenu {
    MainMenu() {
        m_window = new RenderWindow(new VideoMode(m_resolution.x, m_resolution.y), "FeedTheKids", WindowStyle.DEFAULT);
    }
    public void run() {
        do {
            input();
            update();
            draw();
        } while (m_window.isOpen());
    }
    private void input() {
        for (Event event : m_window.pollEvents()) {
            switch (event.type) {
                case CLOSED:
                    m_window.close();
                    break;
                case KEY_PRESSED:
                    switch (event.asKeyEvent().key) {
                        case ESCAPE:
                            m_window.close();
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }
    private void update() {
        
    }
    private void draw() {
        m_window.clear(Color.BLUE);
        m_window.display();
    }
    private RenderWindow m_window;
    private resolution m_resolution = new resolution();
}
