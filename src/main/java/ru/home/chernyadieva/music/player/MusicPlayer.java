package ru.home.chernyadieva.music.player;

import org.springframework.beans.factory.annotation.Qualifier;
import ru.home.chernyadieva.music.interface_music.Music;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musicListGenre;
    private Random random = new Random();

    public MusicPlayer(@Qualifier("musicList") List<Music> musicListGenre) {
        this.musicListGenre = musicListGenre;
    }

    public String playMusic() {
        int randomCountGenre = random.nextInt(musicListGenre.size());
        Music randomMusicGenre = musicListGenre.get(randomCountGenre);

        int randomCountSong = random.nextInt(randomMusicGenre.getSong().size());
        String randomMusicSong = randomMusicGenre.getSong().get(randomCountSong);

        return "Playing song: " + randomMusicSong;
    }
}
