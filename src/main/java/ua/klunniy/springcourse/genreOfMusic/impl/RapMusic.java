package ua.klunniy.springcourse.genreOfMusic.impl;

import ua.klunniy.springcourse.genreOfMusic.Music;

import java.lang.management.MemoryUsage;

/**
 * @author Serhii Klunniy
 */
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap song ...";
    }
}
