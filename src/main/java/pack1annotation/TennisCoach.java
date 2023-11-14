package pack1annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getDailyWorkOut() {
        return "Pravtive tennish";
    }
}
