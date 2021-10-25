package org.tendo.patientfeedback.serviceTest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.tendo.patientfeedback.exception.PatientFeedbackException;
import org.tendo.patientfeedback.models.PFRequest;
import org.tendo.patientfeedback.models.Response;
import org.tendo.patientfeedback.repository.PatientFeedbackRepository;
import org.tendo.patientfeedback.service.PatientFeedbackServiceImpl;

import junit.framework.Assert;

public class PatientFeedbackServiceImplTest {
	@InjectMocks
	private PatientFeedbackServiceImpl patientFeedbackServiceImpl;
	@Mock
    PatientFeedbackRepository patientFeedbackRepository;
	
	@SuppressWarnings("deprecation")
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testCreatePatientFeedback() {
		PFRequest req = new PFRequest();
		req.setName("test name");
		req.setRecommendation(9);
		req.setManagediagonsis("Yes");	
		req.setFeedback("test feedback");

		Response res = patientFeedbackServiceImpl.createPatientFeedback(req);
        Assert.assertEquals("New Patient Feedback added", res.getResponse());

	}
	
	@Test(expected=PatientFeedbackException.class)
	public void testExceptionCreatePatientFeedback() {
		PFRequest req = null;
		Response res = patientFeedbackServiceImpl.createPatientFeedback(req);

	}
	
}
