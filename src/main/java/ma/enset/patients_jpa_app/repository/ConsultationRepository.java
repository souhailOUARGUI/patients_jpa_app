package ma.enset.patients_jpa_app.repository;

import ma.enset.patients_jpa_app.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
