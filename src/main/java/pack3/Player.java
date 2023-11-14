package pack3;


import org.springframework.stereotype.Component;

@Component
public class Player implements Person{

    @Override
    public String getNickName() {
        return "hii in player";
    }
}
