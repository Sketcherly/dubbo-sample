package li.dongpo.tc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: dongpo.li
 * Date: 2020-05-14
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        SampleService sampleService = context.getBean(SampleService.class);
        String x = sampleService.serve();
        System.out.println(x);

    }
}
