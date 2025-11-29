package kz.asankulov.springcourse.springcourse1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private String rock1 = "ROOOCK 1";
    private String rock2 = "ROOOOCK 2";
    private String rock3 = "ROOOCK 3";

    public String getRock1() {
        return rock1;
    }

    public String getRock2() {
        return rock2;
    }

    public String getRock3() {
        return rock3;
    }

    public List<String> getSong(){
        List <String> rockMusicList = new ArrayList<>();
        rockMusicList.add(getRock1());
        rockMusicList.add(getRock2());
        rockMusicList.add(getRock3());
        return rockMusicList;
    }

}
