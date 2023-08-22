package ua.klunniy.springcourse.musicPlayer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.klunniy.springcourse.genreOfMusic.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
@Data
@NoArgsConstructor
//@Component
@Scope("singleton")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MusicPlayer {

    Music music;
    List<Music> musicList = new ArrayList<>();

    @Value("${musicPlayer.name}")
    String name;

    @Value("${musicPlayer.volume}")
    int volume;

    @Autowired
    public MusicPlayer(Music music, List<Music> musicList) {
        this.musicList = musicList;
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

    @PreDestroy
    private void doMyInit() {
        System.out.println("init method");
    }

    @PostConstruct
    private void doMyDestroy() {
        System.out.println("destroy method");
    }

}
