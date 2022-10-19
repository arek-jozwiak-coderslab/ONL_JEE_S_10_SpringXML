package pl.coderslab.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("beans.xml");

//        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
//        helloWorld.printMessage();

//        EmailService bean = context.getBean(EmailService.class);
//        bean.send();

        MessageSender bean = context.getBean(MessageSender.class);
//        bean.sendMessage();

        bean.sendMessageFromProperty();
        context.close();

    }
}
