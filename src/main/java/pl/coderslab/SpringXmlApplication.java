package pl.coderslab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.printMessage();

        context.close();

    }
}
