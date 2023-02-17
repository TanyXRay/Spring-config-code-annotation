package ru.home.chernyadieva.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.home.chernyadieva.audio.AudioSystem;
import ru.home.chernyadieva.music.genre.ClassicMusic;
import ru.home.chernyadieva.music.genre.RockMusic;
import ru.home.chernyadieva.music.player.MusicPlayer;

import java.util.List;

@Configuration
@ComponentScan("ru.home.chernyadieva")
@PropertySource("classpath:audioSystem.properties")
public class SpringConfig {

    @Bean
    public ClassicMusic classicMusic() {
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(List.of(classicMusic(), rockMusic()));
    }

    @Bean
    public AudioSystem audioSystem() {
        return new AudioSystem(musicPlayer());
    }
}
