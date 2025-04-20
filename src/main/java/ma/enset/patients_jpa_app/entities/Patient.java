package ma.enset.patients_jpa_app.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Patient {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
   @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private Collection<RandezVous> randezVous;

}
