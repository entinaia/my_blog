package de.svi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "de.svi.service", "de.svi.demo", "de.svi.data.dto", "de.svi.controllers" })
@SpringBootApplication
public class DemoApplication {
  
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
  
}
