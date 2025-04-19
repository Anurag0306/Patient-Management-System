package org.pms.patientservice.mapper;

import org.pms.patientservice.dto.PatientResponseDTO;
import org.pms.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient){
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patient.getId().toString());
        patientDTO.setName(patient.getName());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDTO;


    }

    public static Patient toPatient( PatientResponseDTO patientResponseDTO){
        Patient patient = new Patient();
        patient.setName(patientResponseDTO.getName());
        patient.setAddress(patientResponseDTO.getAddress());
        patient.setEmail(patientResponseDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(patientResponseDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientResponseDTO.getRegisteredDate()));
    }
}
