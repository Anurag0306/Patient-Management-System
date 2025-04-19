package org.pms.patientservice.service;

import org.pms.patientservice.dto.PatientRequestDTO;
import org.pms.patientservice.dto.PatientResponseDTO;
import org.pms.patientservice.mapper.PatientMapper;
import org.pms.patientservice.model.Patient;
import org.pms.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatient(){
        List<Patient> patients = patientRepository.findAll();

        return patients
                .stream()
                .map(PatientMapper::toDTO)
                .toList();
    }
    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
            Patient newpatient = patientRepository.save()
    }

}
