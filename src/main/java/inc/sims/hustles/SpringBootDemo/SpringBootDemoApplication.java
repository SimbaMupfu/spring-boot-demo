package inc.sims.hustles.SpringBootDemo;

import inc.sims.hustles.SpringBootDemo.models.Laptop;
import inc.sims.hustles.SpringBootDemo.models.Programmer;
import inc.sims.hustles.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		Laptop laptop = context.getBean(Laptop.class);

		LaptopService laptopService = context.getBean(LaptopService.class);
		laptopService.addLaptop(laptop);
	}

}
