package calendar.backend.service.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"calendar.backend.service.data", "calendar.backend.service"}, exclude = {SecurityAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "calendar.backend.service.data.repository")
@EntityScan(basePackages = "calendar.backend.service.data.model")
public class CalendarBackendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarBackendServiceApplication.class, args);
	}

}
