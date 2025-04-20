package ma.enset.patients_jpa_app;

import ma.enset.patients_jpa_app.entities.Medecin;
import ma.enset.patients_jpa_app.entities.Patient;
import ma.enset.patients_jpa_app.repository.MedecinRepository;
import ma.enset.patients_jpa_app.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class PatientsJpaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsJpaAppApplication.class, args);
    }



    @Bean
    CommandLineRunner start(PatientRepository patientRepository, MedecinRepository medecinRepository){
        return args -> {
           //patientRepository.save(new Patient(null, "hassan", new Date(),true, null ));
//            Stream.of("hajar", "najat", "khadija").forEach(
//                //    name -> patientRepository.save(new Patient(null, name, new Date(),true, null ))
//                    name -> {
//                        Patient patient = new Patient();
//                        patient.setNom(name);
//                        patient.setDateNaissance(new Date());
//                        patient.setMalade(false);
//                        patientRepository.save(patient);
//                    }
//            );

            Stream.of("salma", "souhail", "hanane").forEach(
                    //    name -> patientRepository.save(new Patient(null, name, new Date(),true, null ))
                    name -> {
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name+"@gmail.com");
                        medecin.setSpecialite("Cardiologie");
                        medecinRepository.save(medecin);
                    });


        };
    }
}
