package com.webndb.wb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WbApplication {


    public static void main(String[] args) {
        SpringApplication.run(WbApplication.class, args);
    }

    @Bean
    public CommandLineRunner database(CustomerRepository repository) {
        return (args) -> {
            // save a couple of customers //String pesel, float height, int weight
            repository.save(new Patient("Jack", "Bauer", "53112162845",172,63));
            repository.save(new Patient("Chloe", "O'Brian","92121851872",156,46));
            repository.save(new Patient("Lol", "Bauer","59012967794",163,64));
            repository.save(new Patient("David", "Palmer","91030645451",163,64));
            repository.save(new Patient("David", "Palmer","79040139425",163,64));
            repository.save(new Patient("Jack", "Bauer", "53112162845",172,63));
            repository.save(new Patient("Chloe", "O'Brian","92121851872",156,46));
            repository.save(new Patient("Kim", "Bauer","59012977794",163,64));
            repository.save(new Patient("David", "Palmer","91030645451",163,64));
            repository.save(new Patient("David", "Palmer","79040139425",163,64));
            repository.save(new Patient("Jack", "Bauer", "53112162845",172,63));
            repository.save(new Patient("Chloe", "O'Brian","92121851872",156,46));
            repository.save(new Patient("Kim", "Bauer","59012977794",163,64));
            repository.save(new Patient("David", "Palmer","91030645451",163,64));
            repository.save(new Patient("David", "Palmer","79040139425",163,64));
            repository.save(new Patient("Jack", "Bauer", "53112162845",172,63));
            repository.save(new Patient("Chloe", "O'Brian","92121851872",156,46));
            repository.save(new Patient("Kim", "Bauer","59012977794",163,64));
            repository.save(new Patient("David", "Palmer","91030645451",163,64));
            repository.save(new Patient("David", "Palmer","79040139425",163,64));
            // fetch all customers
//            log.info("Customers found with findAll():");
//            log.info("-------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info(customer.toString());
//            }
//            log.info("");

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

