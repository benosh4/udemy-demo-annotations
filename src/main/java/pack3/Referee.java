package pack3;

import org.springframework.stereotype.Component;

@Component
public class Referee implements Person{
    @Override
    public String getNickName() {
        return "im referee - this is my name: referro";
    }
}
