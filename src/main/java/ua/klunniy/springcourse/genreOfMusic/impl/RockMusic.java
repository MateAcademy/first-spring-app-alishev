package ua.klunniy.springcourse.genreOfMusic.impl;

import org.springframework.stereotype.Component;
import ua.klunniy.springcourse.genreOfMusic.Music;

/**
 * @author Serhii Klunniy
 */
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wing cries Marry";
    }
}
