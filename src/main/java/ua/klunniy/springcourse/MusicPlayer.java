package ua.klunniy.springcourse;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.klunniy.springcourse.genreOfMusic.Music;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(music.getSong());
        System.out.println("name = " + name);
        System.out.println("volume= " + volume);
    }

}
