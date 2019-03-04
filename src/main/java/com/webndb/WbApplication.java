package com.webndb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WbApplication {

    public static void main(String[] args) {
        SpringApplication.run(WbApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner database(PatientRepository repository) {
//        return (args) -> repository.save(new Patient("asd", "asd", 31212312, 123, 1231));
//    }
}

// fetch an individual customer by ID
//            repository.findById(1L)
//                    .ifPresent(customer -> {
//                        log.info("Customer found with findById(1L):");
//                        log.info("--------------------------------");
//                        log.info(customer.toString());
//                        log.info("");
//                    });

// fetch customers by last name
//            log.info("Customer found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            repository.findByLastName("Bauer").forEach(bauer -> log.info(bauer.toString()));
//            repository.findByFirstName("David").forEach(david -> log.info(david.toString()));
