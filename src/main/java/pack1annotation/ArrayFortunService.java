package pack1annotation;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ArrayFortunService implements FortuneService{

    private Random random = new Random();
    @Override
    public String getFortune() {

        String[] arrays = {"yyyyy","totot","lolele"};
        int index = random.nextInt(arrays.length);

        String res = arrays[index];
        return "you are in ArraysOfFortuneService" + res;
    }


}
