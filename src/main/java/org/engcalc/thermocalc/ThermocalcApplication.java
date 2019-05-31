package org.engcalc.thermocalc;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThermocalcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThermocalcApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return (String[] args) -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beans = ctx.getBeanDefinitionNames();
            Arrays.sort(beans);
            for(String bean : beans) {
                System.out.println(bean);
            }
        };
    }
}
