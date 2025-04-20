package ma.enset.patients_jpa_app.service;

import jakarta.transaction.Transactional;
import ma.enset.patients_jpa_app.entities.Consultation;
import ma.enset.patients_jpa_app.entities.Medecin;
import ma.enset.patients_jpa_app.entities.Patient;
import ma.enset.patients_jpa_app.entities.RandezVous;
import ma.enset.patients_jpa_app.repository.ConsultationRepository;
import ma.enset.patients_jpa_app.repository.MedecinRepository;
import ma.enset.patients_jpa_app.repository.PatientRepository;
import ma.enset.patients_jpa_app.repository.RandezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private MedecinRepository medecinRepository;
    @Autowired
    private RandezVousRepository randezVousRepository;
    @Autowired
    private ConsultationRepository consultationRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RandezVous saveRDV(RandezVous rdv) {
        return randezVousRepository.save(rdv);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
