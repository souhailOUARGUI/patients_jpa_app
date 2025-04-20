package ma.enset.patients_jpa_app.service;

import ma.enset.patients_jpa_app.entities.Consultation;
import ma.enset.patients_jpa_app.entities.Medecin;
import ma.enset.patients_jpa_app.entities.Patient;
import ma.enset.patients_jpa_app.entities.RandezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RandezVous saveRDV(RandezVous rdv);
    Consultation saveConsultation(Consultation consultation);
}
