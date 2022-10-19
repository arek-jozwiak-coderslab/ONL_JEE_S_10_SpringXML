package pl.coderslab.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = context.getBean(HelloWorld.class);
        bean.hello();

        context.close();
    }
}
