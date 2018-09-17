package quickstart.bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Hello {
    public String getHello() {
        return"Hello Spring Boot!";
    }
}