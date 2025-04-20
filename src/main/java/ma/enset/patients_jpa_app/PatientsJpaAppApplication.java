package ma.enset.patients_jpa_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientsJpaAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PatientsJpaAppApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
