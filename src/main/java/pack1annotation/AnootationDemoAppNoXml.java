package pack1annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnootationDemoAppNoXml

{
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringNoXml.class);

       // Coach coach = context.getBean("thatSillyCoach",Coach.class);

        Coach coach1 = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach1.getDailyFortune());

        System.out.println(coach1.getDailyFortune());

        //System.out.println(coach.getDailyWorkOut());
    }


}
