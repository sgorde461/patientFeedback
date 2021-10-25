package org.tendo.patientfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tendo.patientfeedback.models.PatientFeedback;

@Repository
public interface PatientFeedbackRepository extends JpaRepository<PatientFeedback, String> {
}
