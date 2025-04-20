package ma.enset.patients_jpa_app;

import ma.enset.patients_jpa_app.entities.Patient;
import ma.enset.patients_jpa_app.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsJpaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsJpaAppApplication.class, args);
    }



    @Bean
    CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
           patientRepository.save(new Patient(null, "hassan", new Date(),true, null ));

        };
    }
}
