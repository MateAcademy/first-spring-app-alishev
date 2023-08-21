package ua.klunniy.springcourse;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ua.klunniy.springcourse.genreOfMusic.Music;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MusicPlayer {

    List<Music> musicList = new ArrayList<>();
    Music music;
    String name;
    int volume;

    @Autowired
    public MusicPlayer( @Qualifier("rapMusic") Music music) {
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

    private void doMyInit() {
        System.out.println("init method");
    }

    private void doMyDestroy() {
        System.out.println("destroy method");
    }

}
