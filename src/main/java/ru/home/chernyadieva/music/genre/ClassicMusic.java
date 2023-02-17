package ru.home.chernyadieva.music.genre;

import ru.home.chernyadieva.music.interface_music.Music;

import java.util.Arrays;
import java.util.List;

public class ClassicMusic implements Music {

    @Override
    public List<String> getSong() {
        return Arrays.asList("Eine Kleine Nachtmusik", "The Four Seasons", "Clair De Lune", "Symphony No. 5");
    }
}