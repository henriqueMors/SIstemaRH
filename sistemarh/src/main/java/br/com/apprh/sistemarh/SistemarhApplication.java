package br.com.apprh.sistemarh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.apprh.sistemarh")
public class SistemarhApplication {
    public static void main(String[] args) {
        SpringApplication.run(SistemarhApplication.class, args);
    }
}