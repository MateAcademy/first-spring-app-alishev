package ua.klunniy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.klunniy.springcourse.genreOfMusic.Music;
import ua.klunniy.springcourse.genreOfMusic.impl.ClassicalMusic;
import ua.klunniy.springcourse.genreOfMusic.impl.RapMusic;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        Music music = musicPlayer.getMusic();
        System.out.println(music.getSong());


//        ClassicalMusic musicBean2 = context.getBean("musicBean1", ClassicalMusic.class);
//        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);
//        RapMusic rapMusic2 = context.getBean("musicBean3", RapMusic.class);

//        System.out.println(rapMusic == rapMusic2);
 //       System.out.println(musicBean1 == musicBean2);

//      Music music = context.getBean("classicalMusic", Music.class);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//        System.out.println(firstMusicPlayer == secondMusicPlayer);

//        System.out.println(firstmMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(666);
//        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
