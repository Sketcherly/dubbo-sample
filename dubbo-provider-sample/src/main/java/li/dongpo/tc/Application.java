package li.dongpo.tc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * User: dongpo.li
 * Date: 2020-05-14
 */
public class Application {
    public static void main(String[] args) throws IOException {
        xml();
        System.in.read();
    }

    private static void xml(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
    }
}
