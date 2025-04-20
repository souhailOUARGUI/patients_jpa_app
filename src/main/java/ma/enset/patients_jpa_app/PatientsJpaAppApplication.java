package ma.enset.patients_jpa_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PatientsJpaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsJpaAppApplication.class, args);
    }



    @Bean
    CommandLineRunner start( ){
        return args -> {
            System.out.println("Hello World");
        };
    }
}
