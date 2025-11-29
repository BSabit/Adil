package kz.asankulov.springcourse.springcourse1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.List;
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    MusicPlayer(@Qualifier("popMusic") Music music1, @Qualifier("rockMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;

    }


    public String playMusic(Genre genre){
        Random random = new Random();
        if(genre == Genre.POP){
            return music1.getSong().get(random.nextInt(music1.getSong().size()));
        }
        else return music2.getSong().get(random.nextInt(music2.getSong().size()));
    }

}
