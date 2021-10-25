package org.tendo.patientfeedback.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tendo.patientfeedback.exception.PatientFeedbackException;
import org.tendo.patientfeedback.models.PFRequest;
import org.tendo.patientfeedback.models.PatientFeedback;
import org.tendo.patientfeedback.models.Response;
import org.tendo.patientfeedback.repository.PatientFeedbackRepository;

@Service
public class PatientFeedbackServiceImpl implements PatientFeedbackService {
	@Autowired
    PatientFeedbackRepository patientFeedbackRepository;
	
	@Override
	public Response createPatientFeedback(PFRequest request) {
		try {
		Response response = new Response();
		PatientFeedback patientFeedback = new PatientFeedback();
		patientFeedback.setName(request.getName());
		patientFeedback.setPatientid(request.getPatientId());
		patientFeedback.setPatientfeedbackid(UUID.randomUUID().toString());
		patientFeedback.setRecommendation(request.getRecommendation());
		patientFeedback.setManagediagonis(request.getManagediagonsis());
		patientFeedback.setFeedback(request.getFeedback());
		
		patientFeedbackRepository.save(patientFeedback);
		response.setResponse("Successfully Patient Feedback added!");
	    return response;
		}
		catch(Exception e)
		{
			throw new PatientFeedbackException("PF-1500",e.getMessage());
		}
		
	}

}
