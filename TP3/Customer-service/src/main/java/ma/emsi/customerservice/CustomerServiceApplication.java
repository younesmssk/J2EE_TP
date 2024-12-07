package ma.emsi.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){

        return args -> {

            customerRepository.save(new Customer(null,"Younes","contact@Younes.ma"));
            customerRepository.save(new Customer(null,"Mssouk","contact@Mssouk.ma"));
            customerRepository.save(new Customer(null,"Emsi","contact@Emsi.ma"));
            customerRepository.findAll().forEach(System.out::println);

        };

    }
}
