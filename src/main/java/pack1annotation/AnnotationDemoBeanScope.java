package pack1annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoBeanScope {


        public static  void main(String[] args) {
            ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContextWithScopeBean.xml");

            Coach myco1 = classPathXmlApplicationContext.getBean("runningCoach",Coach.class);

            Coach myco2 = classPathXmlApplicationContext.getBean("runningCoach", Coach.class);

            boolean result = (myco1 == myco2) ;

            System.out.println(result);

            System.out.println(myco1.hashCode());

            System.out.println(myco2.hashCode());

            myco1.getDailyFortune();

            myco2.getDailyFortune();

            classPathXmlApplicationContext.close();
        }


    }


