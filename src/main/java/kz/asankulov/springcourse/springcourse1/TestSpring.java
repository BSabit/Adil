package kz.asankulov.springcourse.springcourse1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpring {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Music music = context.getBean("popMusic",PopMusic.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }

}
