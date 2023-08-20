package ua.klunniy.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.klunniy.springcore.genreOfMusic.Music;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}