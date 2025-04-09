package org.pms.patientservice.service;

import org.pms.patientservice.dto.PatientResponseDTO;
import org.pms.patientservice.model.Patient;
import org.pms.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patinetRepository;

    public PatientService(PatientRepository patinetRepository) {
        this.patinetRepository = patinetRepository;
    }

    public List<PatientResponseDTO> getPatient(){
        List<Patient> patients = patinetRepository.findAll();
    }
}
