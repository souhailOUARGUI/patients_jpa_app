package ma.enset.patients_jpa_app.repository;

import ma.enset.patients_jpa_app.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
}
