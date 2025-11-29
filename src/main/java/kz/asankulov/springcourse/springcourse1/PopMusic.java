package kz.asankulov.springcourse.springcourse1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music{
    private String starboy = "The Weekend - Starboy";
    private String shapeOfYou = "Ed Sheeran - Shape of you";
    private String often = "The Weekend - often";

    public String getStarboy() {
        return starboy;
    }

    public String getShapeOfYou() {
        return shapeOfYou;
    }

    public String getOften() {
        return often;
    }


    public List<String> getSong(){
        List<String> popMusicList = new ArrayList<>();
        popMusicList.add(getStarboy());
        popMusicList.add(getShapeOfYou());
        popMusicList.add(getOften());
        return popMusicList;

    }
}
