package de.tum.ar.researchplatform;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class ResearchplatformApplication {
	public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ResearchplatformApplication.class, args);
	}
}
