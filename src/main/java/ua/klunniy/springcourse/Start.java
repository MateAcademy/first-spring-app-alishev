package ua.klunniy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.klunniy.springcourse.genreOfMusic.Music;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

//      Music music = context.getBean("classicalMusic", Music.class);

        MusicPlayer firstmMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        System.out.println(firstmMusicPlayer == secondMusicPlayer);

        System.out.println(firstmMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstmMusicPlayer.setVolume(666);
        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
