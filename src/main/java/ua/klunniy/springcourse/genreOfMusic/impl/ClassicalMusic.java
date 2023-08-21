package ua.klunniy.springcourse.genreOfMusic.impl;

import ua.klunniy.springcourse.genreOfMusic.Music;

/**
 * @author Serhii Klunniy
 */
public class ClassicalMusic implements Music {

    private static Music instance;

    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public static Music getInstance() {

        return new ClassicalMusic();
    }
}
