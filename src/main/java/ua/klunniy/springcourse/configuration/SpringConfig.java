package ua.klunniy.springcourse.configuration;

import org.springframework.context.annotation.*;
import ua.klunniy.springcourse.MusicPlayer;
import ua.klunniy.springcourse.genreOfMusic.Music;
import ua.klunniy.springcourse.genreOfMusic.impl.ClassicalMusic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ua.klunniy.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("singleton")
    public ClassicalMusic musicBean() {
        return ClassicalMusic.getInstance();
    }

    @Bean
    public List<Music> musicPlayer() {
        return return Arrays.asList(musicBean));
    }
}
