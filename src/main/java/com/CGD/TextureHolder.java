package com.CGD;

import org.jsfml.graphics.Texture;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class TextureHolder {
    private TextureHolder(){}
    public static TextureHolder instance() {
        if (m_instance == null)
            m_instance = new TextureHolder();
        return m_instance;
    }
    public Texture texture(String filename) {
        String path = "src/main/resources/" + filename;
        if (m_textures.containsKey(path))
            return m_textures.get(path);
        Texture texture = new Texture();
        try {
            texture.loadFromFile(Path.of(path));
        } catch (Exception e) {
            System.out.println("FAILED TO LOAD FROM FILE!");
            System.out.println(e);
        }
        m_textures.put(path, texture);
        return texture;
    }
    private static TextureHolder m_instance = null;
    private Map<String, Texture> m_textures = new HashMap<>();
}
