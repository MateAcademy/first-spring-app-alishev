package ua.klunniy.springcourse.genreOfMusic.impl;

import org.springframework.stereotype.Component;
import ua.klunniy.springcourse.genreOfMusic.Music;

/**
 * @author Serhii Klunniy
 */
//@Component("musicBean1")
public class ClassicalMusic implements Music {

    private static Music instance;

    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }
}
