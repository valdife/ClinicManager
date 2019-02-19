package com.webndb.wb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WbApplication {
    private static final Logger log = LoggerFactory.getLogger(WbApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WbApplication.class, args);
    }

    @Bean
    public CommandLineRunner database(CustomerRepository repository) {
        return (args) -> {


            repository.save(new Patient("xd", "Bauer", "1231233", 32, 321));
            repository.save(new Patient("sf", "O'Brian", "321312312", 321, 53));
            repository.save(new Patient("Kim", "Bauer", "321312312", 4125, 432));
            repository.save(new Patient("xd", "Bauer", "1231233", 32, 321));
            repository.save(new Patient("sf", "O'Brian", "321312312", 321, 53));
            repository.save(new Patient("Kim", "Bauer", "321312312", 4125, 432));
            repository.save(new Patient("xd", "Bauer", "1231233", 32, 321));
            repository.save(new Patient("sf", "O'Brian", "321312312", 321, 53));
            repository.save(new Patient("Kim", "Bauer", "321312312", 4125, 432));
            repository.save(new Patient("xd", "Bauer", "1231233", 32, 321));
            repository.save(new Patient("sf", "O'Brian", "321312312", 321, 53));
            repository.save(new Patient("Kim", "Bauer", "321312312", 4125, 432));
            repository.save(new Patient("xd", "Bauer", "1231233", 32, 321));
            repository.save(new Patient("sf", "O'Brian", "321312312", 321, 53));
            repository.save(new Patient("Kim", "Bauer", "321312312", 4125, 432));
            repository.save(new Patient("xd", "Bauer", "1231233", 32, 321));
            repository.save(new Patient("sf", "O'Brian", "321312312", 321, 53));
            repository.save(new Patient("Kim", "Bauer", "321312312", 4125, 432));
            repository.save(new Patient("xd", "Bauer", "1231233", 32, 321));
            repository.save(new Patient("sf", "O'Brian", "321312312", 321, 53));
            repository.save(new Patient("Kim", "Bauer", "321312312", 4125, 432));

            // save a couple of customers //String pesel, float height, int weight
            // fetch all customers
//            log.info("Customers found with findAll():");
//            log.info("-------------------------------");
//            for (Patient patient : repository.findAll()) {
//                log.info(patient.getFirstName());
//            }
//            log.info("-------------------------------");

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


            // for (Customer bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            //log.info("TEST TEST TEST");
        };
    }
}

