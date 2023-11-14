package pack3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pack1annotation.Coach;

public class AnnotationMainExample {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContextNewExample.xml");

        Game c1 = con.getBean("footBallGame", Game.class);

        System.out.println(c1.getNameOfGame());
    }
    }
