package pack1annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FootballCoach implements Coach {

    //can add it directly to private name as below(not on setter nor constructor)

    @Autowired
    @Qualifier("arrayFortunService")
    private FortuneService fortuneService;

  public FootballCoach(){
       System.out.println("inside default constr");
    }

    //@Autowired can added on Constructor
   // @Autowired
    //public FootballCoach(FortuneService thefortuneService){
      //  fortuneService=thefortuneService;
   // }

    //we can add it also on setter
     //@Autowired
   // public void setFortuneService(FortuneService fortuneService) {
        // System.out.println("we we we");
       // this.fortuneService = fortuneService;
   // }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkOut() {
        return "learn how to defend and score";
    }
}
