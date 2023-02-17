package ru.home.chernyadieva.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.home.chernyadieva.audio.AudioSystem;
import ru.home.chernyadieva.config.SpringConfig;

public class TestSpring {

    public static void main(String[] args) {
        /*
        теперь получаем спринг контекст не через конфигурационный файл, а через конфигурационный класс SpringConfig
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        AudioSystem audioSystem = context.getBean("audioSystem", AudioSystem.class);//получаем бин из спринг контекста
        System.out.println(audioSystem);

        context.close();//закрываем контекст
    }
}
