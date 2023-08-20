package ua.klunniy.springcore.genreOfMusic.mpl;

import ua.klunniy.springcore.genreOfMusic.Music;

/**
 * @author Serhii Klunniy
 */
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
