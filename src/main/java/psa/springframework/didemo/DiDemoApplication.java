package psa.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import psa.springframework.didemo.controllers.ConstructorInjectedController;
import psa.springframework.didemo.controllers.GetterInjectedController;
import psa.springframework.didemo.controllers.MyController;
import psa.springframework.didemo.controllers.PropertyInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
