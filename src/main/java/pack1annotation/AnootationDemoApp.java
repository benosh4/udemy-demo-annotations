package pack1annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnootationDemoApp

{
    public static void main(String[] args){

        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Coach coach = con.getBean("thatSillyCoach",Coach.class);

        Coach coach1 = con.getBean("footballCoach", Coach.class);

        Coach coach2 = con.getBean("footballCoach", Coach.class);


        boolean result = (coach2 == coach1) ;

        System.out.println(result);


        System.out.println(coach1.getDailyFortune());

        System.out.println(coach1.getDailyWorkOut());


        //System.out.println(coach.getDailyWorkOut());
    }


}
