package org.pms.patientservice.service;

import org.pms.patientservice.repository.PatinetRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private PatinetRepository patinetRepository;

    public PatientService(PatinetRepository patinetRepository) {
        this.patinetRepository = patinetRepository;
    }
}
