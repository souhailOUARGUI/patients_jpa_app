package ma.enset.patients_jpa_app.repository;

import ma.enset.patients_jpa_app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {


}
