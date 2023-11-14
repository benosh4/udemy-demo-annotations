package pack3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootBallGame implements Game {
    @Autowired
    @Qualifier("referee")
   private Person person;

    public FootBallGame(){}

    public FootBallGame(Person p){
        this.person = p;
    }

    @Override
    public String getNameOfGame() {
        return "uuuuuu footbale game this is the name";
    }
}
