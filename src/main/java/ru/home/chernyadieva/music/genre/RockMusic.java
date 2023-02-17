package ru.home.chernyadieva.music.genre;

import ru.home.chernyadieva.music.interface_music.Music;

import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music {

    @Override
    public List<String> getSong() {
        return Arrays.asList("Boulevard of broken dreams", "Smells Like Teen Spirit ", "Highway to Hell", "Zombie");
    }
}