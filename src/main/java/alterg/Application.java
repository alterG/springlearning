package alterg;

import alterg.mod1.performance.PerformanceException;
import alterg.mod1.performance.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration1.xml");

//        Performer performer = (Performer) context.getBean("duke");
//        performer.perform();
        Performer performer = (Performer) context.getBean("kenny");
        performer.perform();

    }
}
