package pack1annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public SwimCoach(@Qualifier ("randomFortuneService") FortuneService thefortuneService){
        System.out.println("random in swim");
        this.fortuneService = thefortuneService;
    }


    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkOut() {
        return "daily workout swim";
    }
}
