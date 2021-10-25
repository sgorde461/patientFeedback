package org.tendo.patientfeedback.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.tendo.patientfeedback.models.Message;

@ControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(PatientFeedbackException.class)
    public ResponseEntity<Message> handleWFMSException(PatientFeedbackException ex) {
        HttpHeaders responseHeaders = new HttpHeaders();
        Message responseBody = new Message(ex.getCode(), ex.getException());
        return new ResponseEntity<Message>(responseBody, responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
