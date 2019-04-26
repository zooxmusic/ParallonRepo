package com.parallon.coding.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
/*
    @Bean
    public CommandLineRunner demo(final CustomerFacadeService customerFacadeService) {
        return (args) -> {
            // save a couple of customers
            customerFacadeService.addCustomer(new Customer("Jack", "Bauer"));
            customerFacadeService.addCustomer(new Customer("Chloe", "O'Brian"));
            customerFacadeService.addCustomer(new Customer("Kim", "Bauer"));
            customerFacadeService.addCustomer(new Customer("David", "Palmer"));
            customerFacadeService.addCustomer(new Customer("Michelle", "Dessler"));

              /*
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");


            repository.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });


            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });

            log.info("");
        };
    }*/
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.parallon.coding.challenge")).build();
    }
}
