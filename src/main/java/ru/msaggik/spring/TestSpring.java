package ru.msaggik.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("musicBean", Music.class);
        // внедрение зависимостей
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
