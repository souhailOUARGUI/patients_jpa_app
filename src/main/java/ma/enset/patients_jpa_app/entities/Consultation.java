package ma.enset.patients_jpa_app.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Consultation {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private Date dateConsultation;
    private String rapportConsultation;
    private double prixConsultation;
    @OneToOne( mappedBy = "consultation")
    private RandezVous randezVous;


}
