package quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {

		ApplicationContext ac= SpringApplication.run(QuickstartApplication.class, args);
//		System.out.println("使用Spring");
//		Hello hello = (Hello) ac.getBean("hello");
//		System.out.println(hello.getHello());

	}

}
