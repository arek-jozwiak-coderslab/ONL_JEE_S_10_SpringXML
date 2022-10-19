package pl.coderslab.java;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class HelloWorld {
    public void hello(){
        System.out.println(LocalDateTime.now());
    }
}
