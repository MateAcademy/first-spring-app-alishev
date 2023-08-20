package ua.klunniy.springcourse;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.klunniy.springcourse.genreOfMusic.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private Music music;

    private String name;
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        for (Music value : musicList) {
            System.out.println(value.getSong());
        }

        System.out.println("\n" + music.getSong());
        System.out.println("name = " + name);
        System.out.println("volume= " + volume);
    }

}
