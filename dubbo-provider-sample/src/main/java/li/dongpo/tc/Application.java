package li.dongpo.tc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * User: dongpo.li
 * Date: 2020-05-14
 */
public class Application {
    public static void main(String[] args) throws InterruptedException {
        xml();
        new CountDownLatch(1).await();
    }

    private static void xml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    }
}
