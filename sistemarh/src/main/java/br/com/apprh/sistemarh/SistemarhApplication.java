package br.com.apprh.sistemarh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.apprh.sistemarh.models")
@EnableJpaRepositories(basePackages = "br.com.apprh.sistemarh.repository")
@ComponentScan(basePackages = "br.com.apprh.sistemarh")
public class SistemarhApplication {
    public static void main(String[] args) {
        SpringApplication.run(SistemarhApplication.class, args);
    }
}
