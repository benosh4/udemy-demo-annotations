package pack1annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotherAnootationDemoApp

{
    public static void main(String[] args){

        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Coach coach = con.getBean("thatSillyCoach",Coach.class);

       Coach coach1 = con.getBean("swimCoach", Coach.class);

        // System.out.println(coach1.getDailyFortune());

        System.out.println(coach1.getDailyWorkOut());

        System.out.println(coach1.getDailyFortune());


        //System.out.println(coach.getDailyWorkOut());
    }


}
