package service;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "service")
@EntityScan(basePackages = "model")
@EnableJpaRepositories("dao")
public class ServiceApplicationStarter implements CommandLineRunner {
	
	private static final Logger LOGGER = Logger.getLogger("SERVICE-APP");
	
	public static void main(String[] args) {
		LOGGER.info("Starting service module ...");
		SpringApplication.run(ServiceApplicationStarter.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
