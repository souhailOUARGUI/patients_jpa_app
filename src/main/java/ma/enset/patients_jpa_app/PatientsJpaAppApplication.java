package ma.enset.patients_jpa_app;

import ma.enset.patients_jpa_app.entities.*;
import ma.enset.patients_jpa_app.repository.ConsultationRepository;
import ma.enset.patients_jpa_app.repository.MedecinRepository;
import ma.enset.patients_jpa_app.repository.PatientRepository;
import ma.enset.patients_jpa_app.repository.RandezVousRepository;
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
    CommandLineRunner start(PatientRepository patientRepository, MedecinRepository medecinRepository, RandezVousRepository  randezVousRepository, ConsultationRepository consultationRepository){
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

//            Stream.of("salma", "souhail", "hanane").forEach(
//                    //    name -> patientRepository.save(new Patient(null, name, new Date(),true, null ))
//                    name -> {
//                        Medecin medecin = new Medecin();
//                        medecin.setNom(name);
//                        medecin.setEmail(name+"@gmail.com");
//                        medecin.setSpecialite("Cardiologie");
//                        medecinRepository.save(medecin);
//                    });

            Patient patient1 = patientRepository.findByNom("najat");

            Medecin medecin = medecinRepository.findByNom("salma");

            RandezVous rdv = new RandezVous();
            rdv.setDateRandezVous(new Date());
            rdv.setStatusRdv(StatusRDV.PENDING);
            rdv.setMedecin(medecin);
            rdv.setPatient(patient1);
            randezVousRepository.save(rdv);

            RandezVous rdv1 = randezVousRepository.findById(1L).orElse(null);

            Consultation consult = new Consultation();
            consult.setDateConsultation(new Date());
            consult.setRapportConsultation("tout est normal");
            consult.setRandezVous(rdv1);
            //rdv1.setConsultation(consult);
            consultationRepository.save(consult);

        };
    }
}
