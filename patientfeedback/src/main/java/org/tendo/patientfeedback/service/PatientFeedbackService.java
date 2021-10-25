package org.tendo.patientfeedback.service;

import org.springframework.stereotype.Component;
import org.tendo.patientfeedback.models.*;

@Component
public interface PatientFeedbackService {
    Response createPatientFeedback(PFRequest request);

}
