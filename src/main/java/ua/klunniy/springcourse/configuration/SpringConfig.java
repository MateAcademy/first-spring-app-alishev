package ua.klunniy.springcourse.configuration;

import org.springframework.context.annotation.*;
import ua.klunniy.springcourse.musicPlayer.MusicPlayer;
import ua.klunniy.springcourse.genreOfMusic.Music;
import ua.klunniy.springcourse.genreOfMusic.impl.RapMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ua.klunniy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("singleton")
    public RapMusic rapBean() {
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(rapBean());
    }

//    @Bean
//    public MusicPlayer musicPlayer() {
//        return new MusicPlayer(rapBean(), musicList());
//    }

}
