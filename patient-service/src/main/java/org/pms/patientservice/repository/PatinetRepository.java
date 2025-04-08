package org.pms.patientservice.repository;

import org.pms.patientservice.model.Patient;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Creating the constructor
public interface PatinetRepository extends JpaRepository <Patient, UUID> {
}
