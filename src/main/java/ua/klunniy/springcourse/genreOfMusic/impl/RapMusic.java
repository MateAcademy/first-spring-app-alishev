package ua.klunniy.springcourse.genreOfMusic.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.klunniy.springcourse.genreOfMusic.Music;

import java.lang.management.MemoryUsage;

/**
 * @author Serhii Klunniy
 */
@Component
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap song ...";
    }
}
